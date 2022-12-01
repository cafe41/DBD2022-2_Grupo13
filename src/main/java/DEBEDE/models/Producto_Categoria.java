package DEBEDE.models;

public class Producto_Categoria {
    private Integer ID_Producto_Categoria;
    private Integer ID_Producto;
    private Integer ID_Categoria;

    //Constructor

    public Producto_Categoria(Integer ID_Producto_Categoria, Integer ID_Producto, Integer ID_Categoria) {
        this.ID_Producto_Categoria = ID_Producto_Categoria;
        this.ID_Producto = ID_Producto;
        this.ID_Categoria = ID_Categoria;
    }

    //Getters

    public Integer getID_Producto_Categoria() {
        return ID_Producto_Categoria;
    }

    public Integer getID_Producto() {
        return ID_Producto;
    }

    public Integer getID_Categoria() {
        return ID_Categoria;
    }

    //Setters


    public void setID_Producto_Categoria(Integer ID_Producto_Categoria) {
        this.ID_Producto_Categoria = ID_Producto_Categoria;
    }

    public void setID_Producto(Integer ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public void setID_Categoria(Integer ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }
}
