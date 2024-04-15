package Modelo;

public class Responsable {
    private int id_responsable;
    private String responsable;

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Responsable(int id_responsable, String responsable) {
        this.id_responsable = id_responsable;
        this.responsable = responsable;
    }
}
