package preju.controledefrequencia;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import preju.controledefrequencia.Beans.UsuarioBean;
import preju.controledefrequencia.Beans.UsuarioBeanDec;
import preju.controledefrequencia.Beans.UsuarioMatriculaBean;
import preju.controledefrequencia.Beans.UsuarioMatriculaBeanDec;
import preju.controledefrequencia.SharedPreferences.Grava;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dleite on 07/12/2016.
 */

public class Logon extends Activity {
    private AlertDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logon);

        final DetectaConexao detectaConexao = new DetectaConexao(this);

        final EditText et_login = (EditText) findViewById(R.id.editText_login);
        final EditText et_senha = (EditText) findViewById(R.id.et_senha);
        Button btn_entrar = (Button) findViewById(R.id.btn_entrar);
        CheckBox chkSalvar = (CheckBox) findViewById(R.id.chkSalvar);


        if (Grava.getSave(this).equals("SIM")) {
            chkSalvar.setChecked(true);
            et_login.setText(Grava.getUser(this));
            et_senha.setText(Grava.getSenha(this));
        }

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String senha = et_senha.getText().toString();
                final String userid = et_login.getText().toString();
                if (detectaConexao.isConnectingToInternet()) {
                    if (!userid.equals("") && !senha.equals("")) {
                        logar(userid, senha);
                    } else {
                        showDialog("Atenção", "Preencha os campos!");
                    }
                } else {
                    showDialog("Falha ao conectar", "Sem conexão com internet");
                }
            }
        });

    }
    //Autenticação e Criação de lista
    public void logar(final String login, final String senha) {
        exibeDialogProgress();
        Gson g = new GsonBuilder().registerTypeAdapter(UsuarioMatriculaBean.class, new UsuarioMatriculaBeanDec()).create();
        OkHttpClient defaultHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new BasicAuthInterceptor(login, senha))
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(1, TimeUnit.MINUTES)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JsonService.API_BASE_URL_LOGIN)
                .addConverterFactory(GsonConverterFactory.create(g))
                .client(defaultHttpClient)
                .build();

        JsonService service = retrofit.create(JsonService.class);
        final Call<List<UsuarioMatriculaBean>> usuarioLoginRequest = service.autenticaUsuario(login);
        usuarioLoginRequest.enqueue(new Callback<List<UsuarioMatriculaBean>>() {
                                        @Override
                                        public void onResponse
                                                (Call<List<UsuarioMatriculaBean>> call, Response<List<UsuarioMatriculaBean>> response) {

                                            if (response.isSuccessful()) {
                                                Log.e("Autenticação OK", "Dados do colaborador recebidos com sucesso");
                                                List<UsuarioMatriculaBean> dadosUsuario = response.body();

                                                for (UsuarioMatriculaBean usuario : dadosUsuario) {

                                                    CheckBox chkSalvar = (CheckBox) findViewById(R.id.chkSalvar);
                                                    Grava.setSenha(Logon.this, senha);
                                                    Grava.setUser(Logon.this, login);
                                                    Grava.setCargo(Logon.this, usuario.getCargo());
                                                    Grava.setDepartamento(Logon.this, usuario.getDepartamento());
                                                    Grava.setMatricula(Logon.this, usuario.getMatricula());

                                                    if (chkSalvar.isChecked()) {
                                                        Grava.setSave(Logon.this, "SIM");
                                                    } else {
                                                        Grava.setSave(Logon.this, "NÃO");
                                                    }
                                                }
                                                //NOVA REQUISIÇÃO PARA PREENCHER LISTA EM TEMPO DE CRIAÇÃO
                                                geraListaControleFrequencia(login, senha, Grava.getMatricula(Logon.this));
                                            } else {
                                                Log.e("Autenticação INVALIDA", "Ocorreu um erro ao Logar-se com: " + login + " - " + senha);
                                            }
                                        }

                                        @Override
                                        public void onFailure(Call<List<UsuarioMatriculaBean>> call, Throwable t) {
                                            fechaDialogProgress();
                                            showDialog("Atenção", "UserID ou Senha inválidos!");
                                        }
                                    }
        );
    }

    @Override
    protected void onStop() {
        super.onStop();
        CheckBox chkSalvar = (CheckBox) findViewById(R.id.chkSalvar);
        if (chkSalvar.isChecked()) {
            Grava.setSave(this, "SIM");
        }
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        CheckBox chkSalvar = (CheckBox) findViewById(R.id.chkSalvar);

        if (chkSalvar.isChecked()) {
            Grava.setSave(this, "SIM");
        }
        finish();
    }

    void geraListaControleFrequencia(String user, String senha, String matricula) {
        Gson g = new GsonBuilder().registerTypeAdapter(UsuarioBean.class, new UsuarioBeanDec()).create();

        OkHttpClient defaultHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new BasicAuthInterceptor(user, senha))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JsonService.BASE_URL_MATRICULA)
                .addConverterFactory(GsonConverterFactory.create(g))
                .client(defaultHttpClient)
                .build();

        JsonService service = retrofit.create(JsonService.class);
        final Call<List<UsuarioBean>> listaFrequenciaRequest = service.getListaFrequenciaByMatricula(matricula);

        listaFrequenciaRequest.enqueue(new Callback<List<UsuarioBean>>() {
            @Override
            public void onResponse(Call<List<UsuarioBean>> call, Response<List<UsuarioBean>> response) {

                if (response.isSuccessful()) {
                    Log.e("LISTA", "Dados de Freqûencia recebidos com sucesso");
                    List<UsuarioBean> users = response.body();

                    if (users.isEmpty()) {
                        fechaDialogProgress();

                        //Exibe lista
                        Intent intent = new Intent(Logon.this, ListaVazia.class);
                        startActivity(intent);

                    } else {
                        int cont = 0;
                        Intent intent = new Intent(Logon.this, Lista.class);
                        Bundle params = new Bundle();
                        for (UsuarioBean u : users) {

                            //Grava parametros para proxima Activity
                            double porcentagem = (((double) u.getTotal()) / ((double) u.getTotalHrsUteisMes())) * 100.0;
                            params.putString(cont + "_periodo", u.getPeriodo());
                            params.putDouble(cont + "_porcentagem", porcentagem);
                            params.putString(cont + "_status", u.getStatus());
                            params.putString(cont + "_id", u.getID());
                            params.putString(cont + "_meta", u.getTotal() + "/" + u.getTotalHrsUteisMes() + "hrs");

                            //POPULA LISTA DE FREQUÊNCIA
                            if (u.getTotal() > ((long) u.getTotalHrsUteisMes())) {
                                params.putString(cont + "_porcentagemFinal", String.format("%.2f", Double.valueOf(porcentagem)) + "%");
                            } else {
                                params.putString(cont + "_porcentagemFinal", String.format("%.2f", Double.valueOf(porcentagem)) + "%");
                            }
                            cont = cont + 1;
                        }

                        params.putInt("Cont", cont);
                        intent.putExtras(params);
                        fechaDialogProgress();
                        startActivity(intent);
                        overridePendingTransition(R.anim.res_anim_fadein, R.anim.res_anim_fadeout);


                    }

                } else {
                    Log.e("Erro", "Ocorreu um erro ao receber o  response");
                }
            }

            @Override
            public void onFailure(Call<List<UsuarioBean>> call, Throwable t) {
                Log.e("Erro", "Não conseguiu fazer o request");
            }
        });


    }

    void showDialog(String titulo, String msg) {
        AlertDialog.Builder dialogo = new AlertDialog.Builder(Logon.this);
        dialogo.setTitle(titulo);
        dialogo.setMessage(msg);
        dialogo.setNeutralButton("OK", null);
        dialogo.show();

    }

    public void exibeDialogProgress() {
        pDialog = new ProgressDialog(Logon.this);
        pDialog.setMessage("Carregando dados...");
        pDialog.setCancelable(false);
        pDialog.show();
    }

    public void fechaDialogProgress() {
        if (pDialog != null)
            pDialog.dismiss();
    }

    @Override
    protected void onDestroy() {
        CheckBox chkSalvar = (CheckBox) findViewById(R.id.chkSalvar);
        if (chkSalvar.isChecked()) {
            Grava.setSave(Logon.this, "SIM");
        } else {
            Grava.setSave(Logon.this, "NÃO");
        }
        super.onDestroy();
    }
}
