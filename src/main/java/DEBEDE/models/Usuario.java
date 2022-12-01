package DEBEDE.models;

import java.sql.Date;

public class Usuario {
    private Integer ID_Usuario;
    private String Nombre_Usuario;
    private String Nombre;
    private Date Fecha_Nacimiento;
    private String Contraseña;
    private String Correo;
    private Integer ID_Pago;

    public Usuario(Integer ID_Usuario, String nombre_Usuario, String nombre,
                   Date fecha_Nacimiento, String contraseña, String correo,
                   Integer ID_Pago) {
        this.ID_Usuario = ID_Usuario;
        Nombre_Usuario = nombre_Usuario;
        Nombre = nombre;
        Fecha_Nacimiento = fecha_Nacimiento;
        Contraseña = contraseña;
        Correo = correo;
        this.ID_Pago = ID_Pago;
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

    public String getContraseña() {
        return Contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public Integer getID_Pago() {
        return ID_Pago;
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

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setID_Pago(Integer ID_Pago) {
        this.ID_Pago = ID_Pago;
    }
}
