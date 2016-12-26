package preju.controledefrequencia.Beans;

import java.io.Serializable;

/**
 * Created by dleite on 07/11/2016.
 */
public class UsuarioBean implements Serializable{


    private String Periodo;
    private String UserID;
    private String Matricula;
    private String ID;
    private String Status;
    private int TotalHrsUteisMes;
    private long Total;


        public UsuarioBean(){
       }

//    public Usuario(int id, String nome, int total, String periodo, String userID, String matricula, String unid, String status) {
//        this.id = id;
//        this.nome = nome;
//        this.total = total;
//        this.periodo = periodo;
//        this.userID = userID;
//        this.matricula = matricula;
//        this.unid = unid;
//        this.status = status;
//    }


    public int getTotalHrsUteisMes() {
        return TotalHrsUteisMes;
    }

    public void setTotalHrsUteisMes(int totalHrsUteisMes) {
        TotalHrsUteisMes = totalHrsUteisMes;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public long getTotal() {
        return Total;
    }

    public void setTotal(long total) {
        Total = total;
    }
}
