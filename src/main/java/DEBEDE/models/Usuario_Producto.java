package DEBEDE.models;

import java.sql.Date;

public class Usuario_Producto {
    private Integer ID_Carrito;
    private Date fecha_creacion;
    private Integer ID_Usuario;
    private Integer ID_Producto;

    //Constructor

    public Usuario_Producto(Integer ID_Carrito, Date fecha_creacion, Integer ID_Usuario, Integer ID_Producto) {
        this.ID_Carrito = ID_Carrito;
        this.fecha_creacion = fecha_creacion;
        this.ID_Usuario = ID_Usuario;
        this.ID_Producto = ID_Producto;
    }
    //Getters

    public Integer getID_Carrito() {
        return ID_Carrito;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Integer getID_Usuario() {
        return ID_Usuario;
    }

    public Integer getID_Producto() {
        return ID_Producto;
    }
    //Setters

    public void setID_Carrito(Integer ID_Carrito) {
        this.ID_Carrito = ID_Carrito;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public void setID_Usuario(Integer ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public void setID_Producto(Integer ID_Producto) {
        this.ID_Producto = ID_Producto;
    }
}
