package DEBEDE.models;

public class Valoracion {
    private Integer ID_Valoracion;
    private Float cantidad_estrellas;
    private String desc_valoracion;
    private Integer ID_Usuario;
    private Integer ID_Empresa;

    //Constructor
   public Valoracion(Integer ID_Valoracion, Float cantidad_estrellas, String desc_valoracion, Integer ID_Usuario, Integer ID_Empresa) {
        this.ID_Valoracion = ID_Valoracion;
        this.cantidad_estrellas = cantidad_estrellas;
        this.desc_valoracion = desc_valoracion;
        this.ID_Usuario = ID_Usuario;
        this.ID_Empresa = ID_Empresa;
    }

    //Getters

    public Integer getID_Valoracion() {
        return ID_Valoracion;
    }

    public Float getCantidad_estrellas() {
        return cantidad_estrellas;
    }

    public String getDesc_valoracion() {
        return desc_valoracion;
    }

    public Integer getID_Usuario() {
        return ID_Usuario;
    }

    public Integer getID_Empresa() {
        return ID_Empresa;
    }
    //Setters

    public void setID_Valoracion(Integer ID_Valoracion) {
        this.ID_Valoracion = ID_Valoracion;
    }

    public void setCantidad_estrellas(Float cantidad_estrellas) {
        this.cantidad_estrellas = cantidad_estrellas;
    }

    public void setDesc_valoracion(String desc_valoracion) {
        this.desc_valoracion = desc_valoracion;
    }

    public void setID_Usuario(Integer ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public void setID_Empresa(Integer ID_Empresa) {
        this.ID_Empresa = ID_Empresa;
    }
}
