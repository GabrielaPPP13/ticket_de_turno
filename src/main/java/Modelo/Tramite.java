package Modelo;

public class Tramite {
    private int id_tramite;
    private String tramite;

    public int getId_tramite() {
        return id_tramite;
    }

    public void setId_tramite(int id_tramite) {
        this.id_tramite = id_tramite;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public Tramite(int id_tramite, String tramite) {
        this.id_tramite = id_tramite;
        this.tramite = tramite;
    }
}
