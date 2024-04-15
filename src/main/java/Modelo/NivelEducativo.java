package Modelo;

public class NivelEducativo {
    private int id_nivel_educativo;
    private String nivel_educativo;

    public int getId_nivel_educativo() {
        return id_nivel_educativo;
    }

    public void setId_nivel_educativo(int id_nivel_educativo) {
        this.id_nivel_educativo = id_nivel_educativo;
    }

    public String getNivel_educativo() {
        return nivel_educativo;
    }

    public void setNivel_educativo(String nivel_educativo) {
        this.nivel_educativo = nivel_educativo;
    }

    public NivelEducativo(int id_nivel_educativo, String nivel_educativo) {
        this.id_nivel_educativo = id_nivel_educativo;
        this.nivel_educativo = nivel_educativo;
    }
}
