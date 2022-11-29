
package DEBEDE.models;

public class Categoria {
    private String id;
    private String nombre;

    // Constructor
    public Categoria(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters
    public String getId_Categoria() {
        return id;
    }

    public String getNombre_Categoria() {
        return nombre;
    }

    // Setters
    public void setId_Categoria(String id) {
        this.id = id;
    }

    public void setNombre_Categoria(String nombre) {
        this.nombre = nombre;
    }

}
