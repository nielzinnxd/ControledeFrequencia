package preju.controledefrequencia.Beans;

import java.io.Serializable;

/**
 * Created by dleite on 07/12/2016.
 */

public class UsuarioMatriculaBean implements Serializable {

    private String ShortNameColaborador;
    private  String Nome;
    private  String UserID;
    private  String TelCelular;
    private  String Ramal;
    private  String Superior;
    private   String EmailComercial;
    private  String Cargo;
    private  String Matricula;
    private String Departamento;

    public UsuarioMatriculaBean(){
    }

    public String getShortNameColaborador() {
        return ShortNameColaborador;
    }

    public void setShortNameColaborador(String shortNameColaborador) {
        ShortNameColaborador = shortNameColaborador;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getTelCelular() {
        return TelCelular;
    }

    public void setTelCelular(String telCelular) {
        TelCelular = telCelular;
    }

    public String getRamal() {
        return Ramal;
    }

    public void setRamal(String ramal) {
        Ramal = ramal;
    }

    public String getSuperior() {
        return Superior;
    }

    public void setSuperior(String superior) {
        Superior = superior;
    }

    public String getEmailComercial() {
        return EmailComercial;
    }

    public void setEmailComercial(String emailComercial) {
        EmailComercial = emailComercial;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
}