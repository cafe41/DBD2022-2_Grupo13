package DEBEDE.models;

public class Region {
    private Integer ID_Region;
    private String nombre_region;

    //Constructor

    public Region(Integer ID_Region, String nombre_region) {
        this.ID_Region = ID_Region;
        this.nombre_region = nombre_region;
    }

    //Getters

    public Integer getID_Region() {
        return ID_Region;
    }

    public String getNombre_region() {
        return nombre_region;
    }

    //Setters


    public void setID_Region(Integer ID_Region) {
        this.ID_Region = ID_Region;
    }

    public void setNombre_region(String nombre_region) {
        this.nombre_region = nombre_region;
    }
}
