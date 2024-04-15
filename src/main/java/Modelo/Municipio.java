package Modelo;

public class Municipio {
    private String id_municipio, municipio;

    public String getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(String id_municipio) {
        this.id_municipio = id_municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Municipio(String id_municipio, String municipio) {
        this.id_municipio = id_municipio;
        this.municipio = municipio;
    }
}
