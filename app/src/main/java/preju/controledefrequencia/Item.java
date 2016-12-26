package preju.controledefrequencia;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Simple POJO model for example
 */
public class Item {

    private String primeiroPeriodoEntrada;
    private String primeiroPeriodoSaida;
    private String segundoPeriodoEntrada;
    private String segundoPeriodoSaida;
    private String terceiroPeriodoEntrada;
    private String terceiroPeriodoSaida;
    private String quartoPeriodoEntrada;
    private String quartoPeriodoSaida;
    private String quintoPeriodoEntrada;
    private String quintoPeriodoSaida;
    private String dia;
    private String totalHorasDia;
    private String totalHorasQuinzena;
    private String Observacao;

    private int requestsCount;




    private View.OnClickListener requestBtnClickListener;

    public Item() {
    }



    public Item(String primeiroPeriodoEntrada, String primeiroPeriodoSaida,
                String segundoPeriodoEntrada, String segundoPerioroSaida,
                String terceiroPeriodoEntrada, String terceiroPeriodoSaida,
                String quartoPeriodoEntrada, String quartoPeriodoSaida,
                String quintoPeriodoEntrada, String quintoPeriodoSaida,
                String dia, String total, String Observacao){

        this.Observacao=Observacao;
        this.dia = dia;
        this.totalHorasDia = total;
        this.primeiroPeriodoEntrada = primeiroPeriodoEntrada;
        this.primeiroPeriodoSaida = primeiroPeriodoSaida;

        this.segundoPeriodoEntrada = segundoPeriodoEntrada;
        this.segundoPeriodoSaida = segundoPerioroSaida;

        this.terceiroPeriodoEntrada = terceiroPeriodoEntrada;
        this.terceiroPeriodoSaida = terceiroPeriodoSaida;

        this.quartoPeriodoEntrada = quartoPeriodoEntrada;
        this.quartoPeriodoSaida = quartoPeriodoSaida;

        this.quintoPeriodoEntrada = quintoPeriodoEntrada;
        this.quintoPeriodoSaida = quintoPeriodoSaida;

    }

    // GETTERS - SETTERS

    public String getPrimeiroPeriodoEntrada() {
        return primeiroPeriodoEntrada;
    }

    public void setPrimeiroPeriodoEntrada(String primeiroPeriodoEntrada) {
        this.primeiroPeriodoEntrada = primeiroPeriodoEntrada;
    }

    public String getPrimeiroPeriodoSaida() {
        return primeiroPeriodoSaida;
    }

    public void setPrimeiroPeriodoSaida(String primeiroPeriodoSaida) {
        this.primeiroPeriodoSaida = primeiroPeriodoSaida;
    }

    public String getSegundoPeriodoEntrada() {
        return segundoPeriodoEntrada;
    }

    public void setSegundoPeriodoEntrada(String segundoPeriodoEntrada) {
        this.segundoPeriodoEntrada = segundoPeriodoEntrada;
    }

    public String getSegundoPeriodoSaida() {
        return segundoPeriodoSaida;
    }

    public void setSegundoPeriodoSaida(String segundoPerioroSaida) {
        this.segundoPeriodoSaida = segundoPerioroSaida;
    }

    public String getTerceiroPeriodoEntrada() {
        return terceiroPeriodoEntrada;
    }

    public void setTerceiroPeriodoEntrada(String terceiroPeriodoEntrada) {
        this.terceiroPeriodoEntrada = terceiroPeriodoEntrada;
    }

    public String getTerceiroPeriodoSaida() {
        return terceiroPeriodoSaida;
    }

    public void setTerceiroPeriodoSaida(String terceiroPeriodoSaida) {
        this.terceiroPeriodoSaida = terceiroPeriodoSaida;
    }

    public String getQuartoPeriodoEntrada() {
        return quartoPeriodoEntrada;
    }

    public void setQuartoPeriodoEntrada(String quartoPeriodoEntrada) {
        this.quartoPeriodoEntrada = quartoPeriodoEntrada;
    }

    public String getQuartoPeriodoSaida() {
        return quartoPeriodoSaida;
    }

    public void setQuartoPeriodoSaida(String quartoPeriodoSaida) {
        this.quartoPeriodoSaida = quartoPeriodoSaida;
    }

    public String getQuintoPeriodoEntrada() {
        return quintoPeriodoEntrada;
    }

    public void setQuintoPeriodoEntrada(String quintoPeriodoEntrada) {
        this.quintoPeriodoEntrada = quintoPeriodoEntrada;
    }

    public String getQuintoPeriodoSaida() {
        return quintoPeriodoSaida;
    }

    public void setQuintoPeriodoSaida(String quintoPeriodoSaida) {
        this.quintoPeriodoSaida = quintoPeriodoSaida;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTotalHorasDia() {
        return totalHorasDia;
    }

    public void setTotalHorasDia(String totalHorasDia) {
        this.totalHorasDia = totalHorasDia;
    }

    public String getTotalHorasQuinzena() {
        return totalHorasQuinzena;
    }

    public void setTotalHorasQuinzena(String totalHorasQuinzena) {
        this.totalHorasQuinzena = totalHorasQuinzena;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String observacao) {
        Observacao = observacao;
    }

    //
//    public Item(String quinzena, String pledgePrice, String fromAddress, String toAddress, int requestsCount, String date, String time, int dia, String entrada, String saida) {
//       this.entrada = entrada;
//        this.saida = saida;
//        this.quinzena = quinzena;
//        this.dia=dia;
//        this.pledgePrice = pledgePrice;
//        this.fromAddress = fromAddress;
//        this.toAddress = toAddress;
//        this.requestsCount = requestsCount;
//        this.date = date;
//        this.time = time;
//    }


    public int getRequestsCount() {
        return requestsCount;
    }

    public void setRequestsCount(int requestsCount) {
        this.requestsCount = requestsCount;
    }


    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener = requestBtnClickListener;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return true;

    }

    @Override
    public int hashCode() {
//        String quinzena = "daniel";
//        int result = quinzena != null ? quinzena.hashCode() : 0;
//        result = 31 * result + (primeiroPeriodoEntrada != null ? primeiroPeriodoEntrada.hashCode() : 0);
//        result = 31 * result + (segundoPeriodoEntrada != null ? segundoPeriodoEntrada.hashCode() : 0);
//        result = 31 * result + (terceiroPeriodoEntrada != null ? terceiroPeriodoEntrada.hashCode() : 0);
//        result = 31 * result + requestsCount;
//        result = 31 * result + (date != null ? date.hashCode() : 0);
//        result = 31 * result + (time != null ? time.hashCode() : 0);
        return 2;
    }


    /**
     * @return List of elements prepared for tests
     * @parama
     */
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();

//        Item item = new Item();
//        item.setDia("");
//        items.add(item);

        for(int  i=1; i<16; i++){
       //    RequestBody t = getLista();
            items.add(new Item("09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00",""+i,"08:00",""));
        }


        // items.add(new Item("09:00","12:00","13:00","18:00","","","","","","","1","08:00"));


        return items;

    }



}