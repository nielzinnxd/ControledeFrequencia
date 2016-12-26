package preju.controledefrequencia;

import java.util.List;

import okhttp3.ResponseBody;
import preju.controledefrequencia.Beans.FrequenciaBean;
import preju.controledefrequencia.Beans.UsuarioBean;
import preju.controledefrequencia.Beans.UsuarioMatriculaBean;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by dleite on 07/11/2016.
 */
public interface JsonService {

    String BASE_URL_MATRICULA   = "http://mgappr9.magnasistemas.com.br/magna/frequencia.nsf/api/data/collections/name/"; //Lista
    String API_BASE_FREQUENCIA  = "http://mgappr9.magnasistemas.com.br/MAGNA/Frequencia.nsf/api/data/documents/unid/"; //Quinzena
    String API_BASE_URL_LOGIN   = "http://mgappr9.magnasistemas.com.br/magna/pessoal.nsf/api/data/collections/name/"; //Logon
    String API_BASE_POST_OK     = "http://mgappr9.magnasistemas.com.br/magna/frequencia.nsf/api/data/documents/unid/"; //Quinzena

    //BASE_URL_MATRICULA
    @GET("MPMatricula?count=50&")
    Call<List<UsuarioBean>> getListaFrequenciaByMatricula(@Query("category") String category);

    //API_BASE_FREQUENCIA
    @GET("{id}")
    Call<FrequenciaBean> getFrequenciaById(@Path("id") String id);

    //API_BASE_URL_LOGIN
    @GET("infocolabmobile?")
    Call<List<UsuarioMatriculaBean>> autenticaUsuario(@Query("category") String id);

    //API_BASE_POST_OK
    @POST("{id}?form=CF&computewithform=true")
    Call<ResponseBody>frequenciaOk(@Path("id") String id);
}

