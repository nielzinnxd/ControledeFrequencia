package preju.controledefrequencia;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ramotion.foldingcell.FoldingCell;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import preju.controledefrequencia.Beans.FrequenciaBean;
import preju.controledefrequencia.Beans.FrequenciaBeanDec;
import preju.controledefrequencia.Beans.UsuarioBean;
import preju.controledefrequencia.Beans.UsuarioBeanDec;
import preju.controledefrequencia.SharedPreferences.Grava;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Quinzena extends AppCompatActivity {
    private android.app.ProgressDialog pDialog;
    private Toolbar toolbar;
    boolean hideMenu = true;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String id = extras.getString("ID");
            Log.d("DOC ID ", "" + id);
            exibeDialogProgressLoadQuinzena();

            /////////////////////////////////////////////////
            //Grava ID do Documento para usar no método POST
            Grava.setFrequenciaId(Quinzena.this, id);
            ////////////////////////////////////////////////

            Gson g = new GsonBuilder().registerTypeAdapter(FrequenciaBean.class, new FrequenciaBeanDec()).create();

            OkHttpClient defaultHttpClient;
            defaultHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(
                            new Interceptor() {
                                @Override
                                public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
                                    Request request = chain.request().newBuilder()
                                            .addHeader("authorization", "Basic ZGxlaXRlOmxvdHVzbm90ZXM=")
                                            .addHeader("cache-control", "no-cache").build();
                                    return chain.proceed(request);
                                }
                            }).build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(JsonService.API_BASE_FREQUENCIA)
                    .addConverterFactory(GsonConverterFactory.create(g))
                    .client(defaultHttpClient)
                    .build();

            JsonService service = retrofit.create(JsonService.class);
            final Call<FrequenciaBean> ctrlFrequenciaRequest = service.getFrequenciaById(id); //ID DO DOCUMENTO DE FREQUÊNCIA
            ctrlFrequenciaRequest.enqueue(new Callback<FrequenciaBean>() {
                @Override
                public void onResponse(Call<FrequenciaBean> call, Response<FrequenciaBean> response) {

                    if (response.isSuccessful()) {

                        Log.e("OK", "Dados da Quinzena recebidos com sucesso");
                        FrequenciaBean users = response.body();


                        //Validação para exibir botão de OK
                        if ((users.getVerifica() == null) && users.getLiberaEmissao().equals("Sim") && users.getStatus().equals("Aberto")) {
                            hideMenu = false;
                            invalidateOptionsMenu();
                        }

                        ArrayList<Item> itemFrequenciaDia = new ArrayList<>();
                        if (users.getQUINZENA().equals("1")) {
                            itemFrequenciaDia.add(new Item(users.getME_1(), users.getMS_1(), users.getTE_1(), users.getTS_1(), users.getEE_1(), users.getES_1(), users.getE4_1(), users.getS4_1(), users.getE5_1(), users.getS5_1(), "1", users.getTotal_1(), users.getObs_1()));
                            itemFrequenciaDia.add(new Item(users.getME_2(), users.getMS_2(), users.getTE_2(), users.getTS_2(), users.getEE_2(), users.getES_2(), users.getE4_2(), users.getS4_2(), users.getE5_2(), users.getS5_2(), "2", users.getTotal_2(), users.getObs_2()));
                            itemFrequenciaDia.add(new Item(users.getME_3(), users.getMS_3(), users.getTE_3(), users.getTS_3(), users.getEE_3(), users.getES_3(), users.getE4_3(), users.getS4_3(), users.getE5_3(), users.getS5_3(), "3", users.getTotal_3(), users.getObs_3()));
                            itemFrequenciaDia.add(new Item(users.getME_4(), users.getMS_4(), users.getTE_4(), users.getTS_4(), users.getEE_4(), users.getES_4(), users.getE4_4(), users.getS4_4(), users.getE5_4(), users.getS5_4(), "4", users.getTotal_4(), users.getObs_4()));
                            itemFrequenciaDia.add(new Item(users.getME_5(), users.getMS_5(), users.getTE_5(), users.getTS_5(), users.getEE_5(), users.getES_5(), users.getE4_5(), users.getS4_5(), users.getE5_5(), users.getS5_5(), "5", users.getTotal_5(), users.getObs_5()));
                            itemFrequenciaDia.add(new Item(users.getME_6(), users.getMS_6(), users.getTE_6(), users.getTS_6(), users.getEE_6(), users.getES_6(), users.getE4_6(), users.getS4_6(), users.getE5_6(), users.getS5_6(), "6", users.getTotal_6(), users.getObs_6()));
                            itemFrequenciaDia.add(new Item(users.getME_7(), users.getMS_7(), users.getTE_7(), users.getTS_7(), users.getEE_7(), users.getES_7(), users.getE4_7(), users.getS4_7(), users.getE5_7(), users.getS5_7(), "7", users.getTotal_7(), users.getObs_7()));
                            itemFrequenciaDia.add(new Item(users.getME_8(), users.getMS_8(), users.getTE_8(), users.getTS_8(), users.getEE_8(), users.getES_8(), users.getE4_8(), users.getS4_8(), users.getE5_8(), users.getS5_8(), "8", users.getTotal_8(), users.getObs_8()));
                            itemFrequenciaDia.add(new Item(users.getME_9(), users.getMS_9(), users.getTE_9(), users.getTS_9(), users.getEE_9(), users.getES_9(), users.getE4_9(), users.getS4_9(), users.getE5_9(), users.getS5_9(), "9", users.getTotal_9(), users.getObs_9()));
                            itemFrequenciaDia.add(new Item(users.getME_10(), users.getMS_10(), users.getTE_10(), users.getTS_10(), users.getEE_10(), users.getES_10(), users.getE4_10(), users.getS4_10(), users.getE5_10(), users.getS5_10(), "10", users.getTotal_10(), users.getObs_10()));
                            itemFrequenciaDia.add(new Item(users.getME_11(), users.getMS_11(), users.getTE_11(), users.getTS_11(), users.getEE_11(), users.getES_11(), users.getE4_11(), users.getS4_11(), users.getE5_11(), users.getS5_11(), "11", users.getTotal_11(), users.getObs_11()));
                            itemFrequenciaDia.add(new Item(users.getME_12(), users.getMS_12(), users.getTE_12(), users.getTS_12(), users.getEE_12(), users.getES_12(), users.getE4_12(), users.getS4_12(), users.getE5_12(), users.getS5_12(), "12", users.getTotal_12(), users.getObs_12()));
                            itemFrequenciaDia.add(new Item(users.getME_13(), users.getMS_13(), users.getTE_13(), users.getTS_13(), users.getEE_13(), users.getES_13(), users.getE4_13(), users.getS4_13(), users.getE5_13(), users.getS5_13(), "13", users.getTotal_13(), users.getObs_13()));
                            itemFrequenciaDia.add(new Item(users.getME_14(), users.getMS_14(), users.getTE_14(), users.getTS_14(), users.getEE_14(), users.getES_14(), users.getE4_14(), users.getS4_14(), users.getE5_14(), users.getS5_14(), "14", users.getTotal_14(), users.getObs_14()));
                            itemFrequenciaDia.add(new Item(users.getME_15(), users.getMS_15(), users.getTE_15(), users.getTS_15(), users.getEE_15(), users.getES_15(), users.getE4_15(), users.getS4_15(), users.getE5_15(), users.getS5_15(), "15", users.getTotal_15(), users.getObs_15()));
                        } else if (users.getQUINZENA().equals("2")) {
                            itemFrequenciaDia.add(new Item(users.getME_16(), users.getMS_16(), users.getTE_16(), users.getTS_16(), users.getEE_16(), users.getES_16(), users.getE4_16(), users.getS4_16(), users.getE5_16(), users.getS5_16(), "16", users.getTotal_16(), users.getObs_16()));
                            itemFrequenciaDia.add(new Item(users.getME_17(), users.getMS_17(), users.getTE_17(), users.getTS_17(), users.getEE_17(), users.getES_17(), users.getE4_17(), users.getS4_17(), users.getE5_17(), users.getS5_17(), "17", users.getTotal_17(), users.getObs_17()));
                            itemFrequenciaDia.add(new Item(users.getME_18(), users.getMS_18(), users.getTE_18(), users.getTS_18(), users.getEE_18(), users.getES_18(), users.getE4_18(), users.getS4_18(), users.getE5_18(), users.getS5_18(), "18", users.getTotal_18(), users.getObs_18()));
                            itemFrequenciaDia.add(new Item(users.getME_19(), users.getMS_19(), users.getTE_19(), users.getTS_19(), users.getEE_19(), users.getES_19(), users.getE4_19(), users.getS4_19(), users.getE5_19(), users.getS5_19(), "19", users.getTotal_19(), users.getObs_19()));
                            itemFrequenciaDia.add(new Item(users.getME_20(), users.getMS_20(), users.getTE_20(), users.getTS_20(), users.getEE_20(), users.getES_20(), users.getE4_20(), users.getS4_20(), users.getE5_20(), users.getS5_20(), "20", users.getTotal_20(), users.getObs_20()));
                            itemFrequenciaDia.add(new Item(users.getME_21(), users.getMS_21(), users.getTE_21(), users.getTS_21(), users.getEE_21(), users.getES_21(), users.getE4_21(), users.getS4_21(), users.getE5_21(), users.getS5_21(), "21", users.getTotal_21(), users.getObs_21()));
                            itemFrequenciaDia.add(new Item(users.getME_22(), users.getMS_22(), users.getTE_22(), users.getTS_22(), users.getEE_22(), users.getES_22(), users.getE4_22(), users.getS4_22(), users.getE5_22(), users.getS5_22(), "22", users.getTotal_22(), users.getObs_22()));
                            itemFrequenciaDia.add(new Item(users.getME_23(), users.getMS_23(), users.getTE_23(), users.getTS_23(), users.getEE_23(), users.getES_23(), users.getE4_23(), users.getS4_23(), users.getE5_23(), users.getS5_23(), "23", users.getTotal_23(), users.getObs_23()));
                            itemFrequenciaDia.add(new Item(users.getME_24(), users.getMS_24(), users.getTE_24(), users.getTS_24(), users.getEE_24(), users.getES_24(), users.getE4_24(), users.getS4_24(), users.getE5_24(), users.getS5_24(), "24", users.getTotal_24(), users.getObs_24()));
                            itemFrequenciaDia.add(new Item(users.getME_25(), users.getMS_25(), users.getTE_25(), users.getTS_25(), users.getEE_25(), users.getES_25(), users.getE4_25(), users.getS4_25(), users.getE5_25(), users.getS5_25(), "25", users.getTotal_25(), users.getObs_25()));
                            itemFrequenciaDia.add(new Item(users.getME_26(), users.getMS_26(), users.getTE_26(), users.getTS_26(), users.getEE_26(), users.getES_26(), users.getE4_26(), users.getS4_26(), users.getE5_26(), users.getS5_26(), "26", users.getTotal_26(), users.getObs_26()));
                            itemFrequenciaDia.add(new Item(users.getME_27(), users.getMS_27(), users.getTE_27(), users.getTS_27(), users.getEE_27(), users.getES_27(), users.getE4_27(), users.getS4_27(), users.getE5_27(), users.getS5_27(), "27", users.getTotal_27(), users.getObs_27()));
                            itemFrequenciaDia.add(new Item(users.getME_28(), users.getMS_28(), users.getTE_28(), users.getTS_28(), users.getEE_28(), users.getES_28(), users.getE4_28(), users.getS4_28(), users.getE5_28(), users.getS5_28(), "28", users.getTotal_28(), users.getObs_28()));
                            itemFrequenciaDia.add(new Item(users.getME_29(), users.getMS_29(), users.getTE_29(), users.getTS_29(), users.getEE_29(), users.getES_29(), users.getE4_29(), users.getS4_29(), users.getE5_29(), users.getS5_29(), "29", users.getTotal_29(), users.getObs_29()));
                            itemFrequenciaDia.add(new Item(users.getME_30(), users.getMS_30(), users.getTE_30(), users.getTS_30(), users.getEE_30(), users.getES_30(), users.getE4_30(), users.getS4_30(), users.getE5_30(), users.getS5_30(), "30", users.getTotal_30(), users.getObs_30()));
                            itemFrequenciaDia.add(new Item(users.getME_31(), users.getMS_31(), users.getTE_31(), users.getTS_31(), users.getEE_31(), users.getES_31(), users.getE4_31(), users.getS4_31(), users.getE5_31(), users.getS5_31(), "31", users.getTotal_31(), users.getObs_31()));
                        } else if (users.getQUINZENA().equals("0")) {
                            itemFrequenciaDia.add(new Item(users.getME_1(), users.getMS_1(), users.getTE_1(), users.getTS_1(), users.getEE_1(), users.getES_1(), users.getE4_1(), users.getS4_1(), users.getE5_1(), users.getS5_1(), "1", users.getTotal_1(), users.getObs_1()));
                            itemFrequenciaDia.add(new Item(users.getME_2(), users.getMS_2(), users.getTE_2(), users.getTS_2(), users.getEE_2(), users.getES_2(), users.getE4_2(), users.getS4_2(), users.getE5_2(), users.getS5_2(), "2", users.getTotal_2(), users.getObs_2()));
                            itemFrequenciaDia.add(new Item(users.getME_3(), users.getMS_3(), users.getTE_3(), users.getTS_3(), users.getEE_3(), users.getES_3(), users.getE4_3(), users.getS4_3(), users.getE5_3(), users.getS5_3(), "3", users.getTotal_3(), users.getObs_3()));
                            itemFrequenciaDia.add(new Item(users.getME_4(), users.getMS_4(), users.getTE_4(), users.getTS_4(), users.getEE_4(), users.getES_4(), users.getE4_4(), users.getS4_4(), users.getE5_4(), users.getS5_4(), "4", users.getTotal_4(), users.getObs_4()));
                            itemFrequenciaDia.add(new Item(users.getME_5(), users.getMS_5(), users.getTE_5(), users.getTS_5(), users.getEE_5(), users.getES_5(), users.getE4_5(), users.getS4_5(), users.getE5_5(), users.getS5_5(), "5", users.getTotal_5(), users.getObs_5()));
                            itemFrequenciaDia.add(new Item(users.getME_6(), users.getMS_6(), users.getTE_6(), users.getTS_6(), users.getEE_6(), users.getES_6(), users.getE4_6(), users.getS4_6(), users.getE5_6(), users.getS5_6(), "6", users.getTotal_6(), users.getObs_6()));
                            itemFrequenciaDia.add(new Item(users.getME_7(), users.getMS_7(), users.getTE_7(), users.getTS_7(), users.getEE_7(), users.getES_7(), users.getE4_7(), users.getS4_7(), users.getE5_7(), users.getS5_7(), "7", users.getTotal_7(), users.getObs_7()));
                            itemFrequenciaDia.add(new Item(users.getME_8(), users.getMS_8(), users.getTE_8(), users.getTS_8(), users.getEE_8(), users.getES_8(), users.getE4_8(), users.getS4_8(), users.getE5_8(), users.getS5_8(), "8", users.getTotal_8(), users.getObs_8()));
                            itemFrequenciaDia.add(new Item(users.getME_9(), users.getMS_9(), users.getTE_9(), users.getTS_9(), users.getEE_9(), users.getES_9(), users.getE4_9(), users.getS4_9(), users.getE5_9(), users.getS5_9(), "9", users.getTotal_9(), users.getObs_9()));
                            itemFrequenciaDia.add(new Item(users.getME_10(), users.getMS_10(), users.getTE_10(), users.getTS_10(), users.getEE_10(), users.getES_10(), users.getE4_10(), users.getS4_10(), users.getE5_10(), users.getS5_10(), "10", users.getTotal_10(), users.getObs_10()));
                            itemFrequenciaDia.add(new Item(users.getME_11(), users.getMS_11(), users.getTE_11(), users.getTS_11(), users.getEE_11(), users.getES_11(), users.getE4_11(), users.getS4_11(), users.getE5_11(), users.getS5_11(), "11", users.getTotal_11(), users.getObs_11()));
                            itemFrequenciaDia.add(new Item(users.getME_12(), users.getMS_12(), users.getTE_12(), users.getTS_12(), users.getEE_12(), users.getES_12(), users.getE4_12(), users.getS4_12(), users.getE5_12(), users.getS5_12(), "12", users.getTotal_12(), users.getObs_12()));
                            itemFrequenciaDia.add(new Item(users.getME_13(), users.getMS_13(), users.getTE_13(), users.getTS_13(), users.getEE_13(), users.getES_13(), users.getE4_13(), users.getS4_13(), users.getE5_13(), users.getS5_13(), "13", users.getTotal_13(), users.getObs_13()));
                            itemFrequenciaDia.add(new Item(users.getME_14(), users.getMS_14(), users.getTE_14(), users.getTS_14(), users.getEE_14(), users.getES_14(), users.getE4_14(), users.getS4_14(), users.getE5_14(), users.getS5_14(), "14", users.getTotal_14(), users.getObs_14()));
                            itemFrequenciaDia.add(new Item(users.getME_15(), users.getMS_15(), users.getTE_15(), users.getTS_15(), users.getEE_15(), users.getES_15(), users.getE4_15(), users.getS4_15(), users.getE5_15(), users.getS5_15(), "15", users.getTotal_15(), users.getObs_15()));

                            itemFrequenciaDia.add(new Item(users.getME_16(), users.getMS_16(), users.getTE_16(), users.getTS_16(), users.getEE_16(), users.getES_16(), users.getE4_16(), users.getS4_16(), users.getE5_16(), users.getS5_16(), "16", users.getTotal_16(), users.getObs_16()));
                            itemFrequenciaDia.add(new Item(users.getME_17(), users.getMS_17(), users.getTE_17(), users.getTS_17(), users.getEE_17(), users.getES_17(), users.getE4_17(), users.getS4_17(), users.getE5_17(), users.getS5_17(), "17", users.getTotal_17(), users.getObs_17()));
                            itemFrequenciaDia.add(new Item(users.getME_18(), users.getMS_18(), users.getTE_18(), users.getTS_18(), users.getEE_18(), users.getES_18(), users.getE4_18(), users.getS4_18(), users.getE5_18(), users.getS5_18(), "18", users.getTotal_18(), users.getObs_18()));
                            itemFrequenciaDia.add(new Item(users.getME_19(), users.getMS_19(), users.getTE_19(), users.getTS_19(), users.getEE_19(), users.getES_19(), users.getE4_19(), users.getS4_19(), users.getE5_19(), users.getS5_19(), "19", users.getTotal_19(), users.getObs_19()));
                            itemFrequenciaDia.add(new Item(users.getME_20(), users.getMS_20(), users.getTE_20(), users.getTS_20(), users.getEE_20(), users.getES_20(), users.getE4_20(), users.getS4_20(), users.getE5_20(), users.getS5_20(), "20", users.getTotal_20(), users.getObs_20()));
                            itemFrequenciaDia.add(new Item(users.getME_21(), users.getMS_21(), users.getTE_21(), users.getTS_21(), users.getEE_21(), users.getES_21(), users.getE4_21(), users.getS4_21(), users.getE5_21(), users.getS5_21(), "21", users.getTotal_21(), users.getObs_21()));
                            itemFrequenciaDia.add(new Item(users.getME_22(), users.getMS_22(), users.getTE_22(), users.getTS_22(), users.getEE_22(), users.getES_22(), users.getE4_22(), users.getS4_22(), users.getE5_22(), users.getS5_22(), "22", users.getTotal_22(), users.getObs_22()));
                            itemFrequenciaDia.add(new Item(users.getME_23(), users.getMS_23(), users.getTE_23(), users.getTS_23(), users.getEE_23(), users.getES_23(), users.getE4_23(), users.getS4_23(), users.getE5_23(), users.getS5_23(), "23", users.getTotal_23(), users.getObs_23()));
                            itemFrequenciaDia.add(new Item(users.getME_24(), users.getMS_24(), users.getTE_24(), users.getTS_24(), users.getEE_24(), users.getES_24(), users.getE4_24(), users.getS4_24(), users.getE5_24(), users.getS5_24(), "24", users.getTotal_24(), users.getObs_24()));
                            itemFrequenciaDia.add(new Item(users.getME_25(), users.getMS_25(), users.getTE_25(), users.getTS_25(), users.getEE_25(), users.getES_25(), users.getE4_25(), users.getS4_25(), users.getE5_25(), users.getS5_25(), "25", users.getTotal_25(), users.getObs_25()));
                            itemFrequenciaDia.add(new Item(users.getME_26(), users.getMS_26(), users.getTE_26(), users.getTS_26(), users.getEE_26(), users.getES_26(), users.getE4_26(), users.getS4_26(), users.getE5_26(), users.getS5_26(), "26", users.getTotal_26(), users.getObs_26()));
                            itemFrequenciaDia.add(new Item(users.getME_27(), users.getMS_27(), users.getTE_27(), users.getTS_27(), users.getEE_27(), users.getES_27(), users.getE4_27(), users.getS4_27(), users.getE5_27(), users.getS5_27(), "27", users.getTotal_27(), users.getObs_27()));
                            itemFrequenciaDia.add(new Item(users.getME_28(), users.getMS_28(), users.getTE_28(), users.getTS_28(), users.getEE_28(), users.getES_28(), users.getE4_28(), users.getS4_28(), users.getE5_28(), users.getS5_28(), "28", users.getTotal_28(), users.getObs_28()));
                            itemFrequenciaDia.add(new Item(users.getME_29(), users.getMS_29(), users.getTE_29(), users.getTS_29(), users.getEE_29(), users.getES_29(), users.getE4_29(), users.getS4_29(), users.getE5_29(), users.getS5_29(), "29", users.getTotal_29(), users.getObs_29()));
                            itemFrequenciaDia.add(new Item(users.getME_30(), users.getMS_30(), users.getTE_30(), users.getTS_30(), users.getEE_30(), users.getES_30(), users.getE4_30(), users.getS4_30(), users.getE5_30(), users.getS5_30(), "30", users.getTotal_30(), users.getObs_30()));
                            itemFrequenciaDia.add(new Item(users.getME_31(), users.getMS_31(), users.getTE_31(), users.getTS_31(), users.getEE_31(), users.getES_31(), users.getE4_31(), users.getS4_31(), users.getE5_31(), users.getS5_31(), "31", users.getTotal_31(), users.getObs_31()));
                        }
                        ListView theListView = (ListView) findViewById(R.id.mainListView);


                        final ArrayList<Item> items = itemFrequenciaDia;

                        items.get(0).setRequestBtnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                            }
                        });

                        final FoldingCellListAdapter adapter = new FoldingCellListAdapter(Quinzena.this, items);

                        adapter.setDefaultRequestBtnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                            }
                        });

                        theListView.setAdapter(adapter);
                        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                                ((FoldingCell) view).toggle(false);
                                adapter.registerToggle(pos);
                            }
                        });

                    }
                } //OnResponse

                @Override
                public void onFailure(Call<FrequenciaBean> call, Throwable t) {

                }
            });
            fechaDialogProgressQuinzena();
        } //Extras ID != ""

    } //OnCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_quinzena, menu);
        if (!hideMenu) {
            inflater.inflate(R.menu.menu_ok_button, menu); //esconde item OK Button
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_sair) {
            finish();
            overridePendingTransition(R.anim.res_anim_fadein, R.anim.res_anim_fadeout);
        }
        if (id == R.id.action_ok) {
            openDialogOk();
        }

        return super.onOptionsItemSelected(item);
    }

    //Exibe Dialog Sim/Não
    void openDialogOk() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                Quinzena.this);
        alertDialogBuilder.setTitle("As informações estão corretas?");
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        //Requisição Post passando UniversalID do documento
                        /////////////////////////////////////////////////
                        frequenciaOk(Grava.getFrequenciaId(Quinzena.this));
                        Toast.makeText(getApplicationContext(), "Verificação realizada com sucesso!", Toast.LENGTH_SHORT).show();
                        Quinzena.this.finish();
                        /////////////////////////////////////////////////
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

    //MétodoPost usando ID do Doc como parametro
    public void frequenciaOk(String UIDfrequencia) {

        Gson g = new GsonBuilder().registerTypeAdapter(UsuarioBean.class, new UsuarioBeanDec()).create();
        OkHttpClient defaultHttpClient = new OkHttpClient.Builder()
                .addInterceptor(
                        new Interceptor() {
                            @Override
                            public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
                                MediaType mediaType = MediaType.parse("application/json");
                                RequestBody body = RequestBody.create(mediaType, "{\"Verifica\": \"OK\"}");
                                Request request = chain.request().newBuilder()
                                        .addHeader("authorization", "Basic ZGxlaXRlOmxvdHVzbm90ZXM=")
                                        .addHeader("cache-control", "no-cache")
                                        .addHeader("Content-Type", "application/json")
                                        .addHeader("x-http-method-override", "PATCH")
                                        .post(body)
                                        .build();

                                return chain.proceed(request);
                            }
                        }).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JsonService.API_BASE_POST_OK)
                .addConverterFactory(GsonConverterFactory.create(g))
                .client(defaultHttpClient)
                .build();

        JsonService service = retrofit.create(JsonService.class);
        Call<ResponseBody> postOK = service.frequenciaOk(UIDfrequencia);
        postOK.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                  System.out.println("Controle de Frequência verificado!");
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                t.printStackTrace();
            }
        });


    }

    @Override
    public void onBackPressed() {
      finish();
        overridePendingTransition(R.anim.res_anim_fadein, R.anim.res_anim_fadeout);
    }

    public void exibeDialogProgressLoadQuinzena() {
        pDialog = new ProgressDialog(Quinzena.this);
        pDialog.setMessage("Carregando dados...");
        pDialog.setCancelable(false);
        pDialog.show();
    }

    public void fechaDialogProgressQuinzena() {
        if (pDialog != null)
            pDialog.dismiss();
    }
}