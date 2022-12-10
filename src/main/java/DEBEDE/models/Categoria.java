package DEBEDE.models;

public class Categoria {
    private Integer ID_Categoria;
    private String Nombre_Categoria;
    private String Descripcion_Categoria;

    // Constructor
    public Categoria(Integer ID_Categoria, String nombre_Categoria, String descripcion_Categoria) {
        this.ID_Categoria = ID_Categoria;
        Nombre_Categoria = nombre_Categoria;
        Descripcion_Categoria = descripcion_Categoria;
    }

    // Getters
    public Integer getID_Categoria() {
        return ID_Categoria;
    }

    public String getNombre_Categoria() {
        return Nombre_Categoria;
    }

    public String getDescripcion_Categoria() {
        return Descripcion_Categoria;
    }

    // Setters
    public void setID_Categoria(Integer ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public void setNombre_Categoria(String nombre_Categoria) {
        Nombre_Categoria = nombre_Categoria;
    }

    public void setDescripcion_Categoria(String descripcion_Categoria) {
        Descripcion_Categoria = descripcion_Categoria;
    }
}
