package preju.controledefrequencia;

/**
 * Created by dleite on 16/12/2016.
 */

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class DetectaConexao {

    private Context context;

    DetectaConexao(Context context){
        this.context = context;
    }

    /**
     * Retorna se o app está conectado na internet
     * @return
     */
    public boolean isConnectingToInternet(){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}