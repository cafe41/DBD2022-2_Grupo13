package DEBEDE.models;

public class Pais {
    private Integer ID_Pais;
    private String nombre_pais;
    private String idioma;
    private Integer ID_Region;

    //Constructor
    public Pais(Integer ID_Pais, String nombre_pais, String idioma, Integer ID_Region) {
        this.ID_Pais = ID_Pais;
        this.nombre_pais = nombre_pais;
        this.idioma = idioma;
        this.ID_Region = ID_Region;
    }

    //Getters

    public Integer getID_Pais() {
        return ID_Pais;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public String getIdioma() {
        return idioma;
    }

    public Integer getID_Region() {
        return ID_Region;
    }


    //Setters

    public void setID_Pais(Integer ID_Pais) {
        this.ID_Pais = ID_Pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setID_Region(Integer ID_Region) {
        this.ID_Region = ID_Region;
    }
}
