package Modelo;

public class Ticket {

    String id_ticket, curp, nombre, apellido_paterno, apellido_materno, correo, telefono1, telefono2, municipio, fecha_creacion, fecha_modifiacion, fecha_asignacion;
    int tramite, nivel_educativo, estatus, responsable;

    public Ticket(String id_ticket, String curp, int responsable, String nombre, String apellido_paterno, String apellido_materno, String correo, String telefono1, String telefono2, String municipio, String fecha_creacion, String fecha_modifiacion, String fecha_asignacion, int tramite, int nivel_educativo, int estatus) {
        this.id_ticket = id_ticket;
        this.curp = curp;
        this.responsable = responsable;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.correo = correo;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.municipio = municipio;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modifiacion = fecha_modifiacion;
        this.fecha_asignacion = fecha_asignacion;
        this.tramite = tramite;
        this.nivel_educativo = nivel_educativo;
        this.estatus = estatus;
    }

    public String getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(String id_ticket) {
        this.id_ticket = id_ticket;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_modifiacion() {
        return fecha_modifiacion;
    }

    public void setFecha_modifiacion(String fecha_modifiacion) {
        this.fecha_modifiacion = fecha_modifiacion;
    }

    public String getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(String fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

    public int getTramite() {
        return tramite;
    }

    public void setTramite(int tramite) {
        this.tramite = tramite;
    }

    public int getNivel_educativo() {
        return nivel_educativo;
    }

    public void setNivel_educativo(int nivel_educativo) {
        this.nivel_educativo = nivel_educativo;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

}
