package Modelo;

public class Administrador {
    private int id_administrador;
    private String user_name;
    private String contraseña;

    public Administrador(int id_administrador, String user_name, String contraseña) {
        this.user_name = user_name;
        this.contraseña = contraseña;
        this.id_administrador = id_administrador;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
