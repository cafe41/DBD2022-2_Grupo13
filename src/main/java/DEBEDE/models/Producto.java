package DEBEDE.models;

public class Producto {
    private String id;
    private String nombre;
    private int precio;
    private String fecha_vencimiento;
    private int categoria;

    // Constructor
    public Producto(String id, String nombre, int precio, String fecha_vencimiento, int categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_vencimiento = fecha_vencimiento;
        this.categoria = categoria;
    }

    // Getters
    public String getId_producto() {
        return id;
    }

    public String getNombre_producto() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getFvencimiento() {
        return fecha_vencimiento;
    }

    public int getCategoria() {
        return categoria;
    }

    // Setters
    public void setId_producto(String id) {
        this.id = id;
    }

    public void setNombre_producto(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setFvencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
