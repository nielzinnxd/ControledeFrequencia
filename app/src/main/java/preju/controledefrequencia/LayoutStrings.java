package preju.controledefrequencia;

/**
 * Created by dleite on 14/12/2016.
 */

public class LayoutStrings {
    private String quinzena;
    private double progressbar;
    private String status;
    private String hrs;
    private String porcento;

    public LayoutStrings(String quinz, double prog, String stat, String hr, String porcent) {
        this.quinzena = quinz;
        this.progressbar = prog;
        this.status=stat;
        this.porcento=porcent;
        this.hrs=hr;
    }

    public String getStatus() {
        return status;
    }

    public String getHrs() {
        return hrs;
    }

    public void setHrs(String hrs) {
        this.hrs = hrs;
    }

    public String getPorcento() {
        return porcento;
    }

    public void setPorcento(String porcento) {
        this.porcento = porcento;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuinzena() {
        return quinzena;
    }

    public void setQuinzena(String quinzena) {
        this.quinzena = quinzena;
    }

    public double getProgressbar() {
        return progressbar;
    }

    public void setProgressbar(int progressbar) {
        this.progressbar = progressbar;
    }
}