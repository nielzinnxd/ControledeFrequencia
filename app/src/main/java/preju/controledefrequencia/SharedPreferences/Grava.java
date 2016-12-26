package preju.controledefrequencia.SharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;


/**
 * Created by dleite on 09/09/2016.
 */
public class Grava {

    static final String PREF_SENHA = "SENHA";
    static final String PREF_USER = "USER";
    static final String PREF_SAVE = "SAVE";
    static final String PREF_MATRICULA = "MATRICULA";
    static final String PREF_DEPARTAMENTO = "DEPARTAMENTO";
    static final String PREF_CARGO = "Cargo";
    static final String PREF_FREQUENCIAUID = "FREQUENCIAUID";
//    static final String PREF_HISTORICO = "HISTORICO";
    static final String PREF_LISTAFREQUENCIA = "LISTAFREQUENCIA";

    public static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setSenha(Context ctx, String senha) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_SENHA, senha);
        editor.commit();
    }

    public static String getSenha(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_SENHA, "SENHA");
    }

//
//    public static void setHistorico(Context ctx, String hist) {
//        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
//        editor.putString(PREF_HISTORICO, hist);
//        editor.commit();
//    }
//
//    public static String getHistorico(Context ctx) {
//        return getSharedPreferences(ctx).getString(PREF_HISTORICO, "HISTORICO");
//    }


    public static void setUser(Context ctx, String user) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_USER, user);
        editor.commit();
    }

    public static String getUser(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_USER, "USER");
    }


    public static void setSave(Context ctx, String save) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_SAVE, save);
        editor.commit();
    }

    public static String getSave(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_SAVE, "SAVE");
    }

    public static void setDepartamento(Context ctx, String DEPARTAMENTO) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_DEPARTAMENTO, DEPARTAMENTO);
        editor.commit();
    }

    public static String getDepartamento(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_DEPARTAMENTO, "DEPARTAMENTO");
    }

    public static void setCargo(Context ctx, String cargo) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_CARGO, cargo);
        editor.commit();
    }

    public static String getCargo(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_CARGO, "CARGO");
    }

    public static void setMatricula(Context ctx, String matricula) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_MATRICULA, matricula);
        editor.commit();
    }

    public static String getMatricula(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_MATRICULA, "MATRICULA");
    }

    public static void setFrequenciaId(Context ctx, String freq) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_FREQUENCIAUID, freq);
        editor.commit();
    }

    public static String getFrequenciaId(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_FREQUENCIAUID, "FREQUENCIAUID");
    }


    public static void limpa(Context ctx) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.clear();
        editor.commit();
    }




}
