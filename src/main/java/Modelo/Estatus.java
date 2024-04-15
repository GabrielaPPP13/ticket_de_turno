package Modelo;

public class Estatus {
    private int id_estatus;
    private String estatus;

    public int getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(int id_estatus) {
        this.id_estatus = id_estatus;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Estatus(int id_estatus, String estatus) {
        this.id_estatus = id_estatus;
        this.estatus = estatus;
    }
}
