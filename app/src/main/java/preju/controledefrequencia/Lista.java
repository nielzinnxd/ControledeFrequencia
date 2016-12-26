package preju.controledefrequencia;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import preju.controledefrequencia.Adapter.ListFrequenciaAdapter;
import preju.controledefrequencia.SharedPreferences.Grava;



/**
 * Created by dleite on 04/11/2016.
 */
public class Lista extends AppCompatActivity {
    ListFrequenciaAdapter listFrequenciaAdapter;
    private Toolbar toolbar;
    List<String> idOnList = new ArrayList<>();
    TextView cargo;
    TextView userID;
    TextView departamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        Bundle extras = getIntent().getExtras();
        List<LayoutStrings> listaDeFrequencia = new ArrayList<>();

        if (extras != null) {
            int cont = extras.getInt("Cont");
            for(int i= 0; i<cont; i++){
                //Grava id do documento para parametrizar a proxima activity
                idOnList.add(extras.getString(i+"_id"));
                listaDeFrequencia.add(new LayoutStrings(extras.getString(i+"_periodo"),
                        extras.getDouble(i+"_porcentagem"), extras.getString(i+"_status"),
                        extras.getString(i+"_meta"),extras.getString(i+"_porcentagemFinal")));
            }
            Log.e("OK","Dados para lista de frequencia recebidos com sucesso");
        }

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setDividerHeight(10);


        listFrequenciaAdapter = new ListFrequenciaAdapter(this, R.layout.lista_frequencia_custom, listaDeFrequencia);
        listView.setAdapter(listFrequenciaAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Lista.this, Quinzena.class);
                intent.putExtra("ID", idOnList.get(position));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_lista, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_sair_lista) {
            openDialogExit();
        }
        if (id == R.id.action_perfil_lista) {
            openDialogInfoColaborador();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        openDialogExit();
    }

    public void openDialogInfoColaborador() {
        Dialog dialog = new Dialog(this);
        dialog.getWindow().addFlags(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent);
        dialog.setContentView(R.layout.perfil);

        cargo = (TextView) dialog.findViewById(R.id.tv_cargo_colab);
        userID = (TextView) dialog.findViewById(R.id.tv_nome_colab);
        departamento = (TextView) dialog.findViewById(R.id.tv_colab_departamento);


        cargo.setText(Grava.getCargo(this));
        userID.setText(Grava.getUser(this));
        departamento.setText(Grava.getDepartamento(this));
        dialog.show();

    }

    void openDialogExit() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                Lista.this);
        alertDialogBuilder.setTitle("Deseja sair?");
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Lista.this.finish();
                        Intent intent = new Intent(Lista.this, Logon.class);
                        startActivity(intent);

                    }
                })
                .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        listFrequenciaAdapter.notifyDataSetChanged();
        super.onResume();
    }

    @Override
    protected void onPostResume() {
        listFrequenciaAdapter.notifyDataSetChanged();
        super.onPostResume();
    }





}




