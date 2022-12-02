package DEBEDE.models;

public class Rol {
    private Integer ID_Rol;
    private String tipo;
    private String descripcion;

    //Constructor

    public Rol(Integer ID_Rol, String tipo, String descripcion) {
        this.ID_Rol = ID_Rol;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    //Getters

    public Integer getID_Rol() {
        return ID_Rol;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }


    //Setters

    public void setID_Rol(Integer ID_Rol) {
        this.ID_Rol = ID_Rol;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
