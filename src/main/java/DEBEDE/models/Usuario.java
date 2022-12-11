package DEBEDE.models;

import java.sql.Date;

public class Usuario {
    private Integer ID_Usuario;
    private String Nombre_Usuario;
    private String Nombre;
    private Date Fecha_Nacimiento;
    private String Contrasena;
    private String Correo;
    private Integer ID_Pais;

    public Usuario(Integer ID_Usuario, String nombre_Usuario, String nombre,
                   Date fecha_Nacimiento, String contrasena, String correo,
                   Integer ID_Pais) {
        this.ID_Usuario = ID_Usuario;
        this.Nombre_Usuario = nombre_Usuario;
        this.Nombre = nombre;
        this.Fecha_Nacimiento = fecha_Nacimiento;
        this.Contrasena = contrasena;
        this.Correo = correo;
        this.ID_Pais = ID_Pais;
    }

    //Getters
    public Integer getID_Usuario() {
        return ID_Usuario;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public String getCorreo() {
        return Correo;
    }

    public Integer getID_Pais() {
        return ID_Pais;
    }

    //Setters
    public void setID_Usuario(Integer ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        Nombre_Usuario = nombre_Usuario;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setID_Pais(Integer ID_Pais) {
        this.ID_Pais = ID_Pais;
    }
}
