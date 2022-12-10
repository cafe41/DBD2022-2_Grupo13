package DEBEDE.models;

import javax.swing.text.StyleContext;

public class Producto {
    private Integer ID_Producto;
    private String Nombre_Producto;
    private Integer Stock;

    private Integer Precio;
    private Integer EsExplicito;
    private String Descripcion;
    private String Link_pagina;
    private String Imagen_producto;
    private Integer ID_Empresa;


    // Constructor
    public Producto(Integer ID_Producto, String nombre_Producto, Integer stock, Integer precio ,Integer esExplicito, String descripcion, String link_pagina, String imagen_producto, Integer ID_Empresa) {
        this.ID_Producto = ID_Producto;
        Nombre_Producto = nombre_Producto;
        Stock = stock;
        Precio= precio;
        EsExplicito = esExplicito;
        Descripcion = descripcion;
        Link_pagina = link_pagina;
        Imagen_producto = imagen_producto;
        this.ID_Empresa = ID_Empresa;
    }

    // Getters
    public Integer getID_Producto() {
        return ID_Producto;
    }
    public String getNombre_Producto() {
        return Nombre_Producto;
    }
    public Integer getStock() {
        return Stock;
    }
    public Integer getPrecio() {
        return Precio;
    }
    public Integer getEsExplicito() {
        return EsExplicito;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public String getLink_pagina() {
        return Link_pagina;
    }
    public String getImagen_producto() {
        return Imagen_producto;
    }
    public Integer getID_Empresa() {
        return ID_Empresa;
    }

    // Setters
    public void setID_Producto(Integer ID_Producto) {
        this.ID_Producto = ID_Producto;
    }
    public void setNombre_Producto(String nombre_Producto) {
        Nombre_Producto = nombre_Producto;
    }
    public void setStock(Integer stock) {
        Stock = stock;
    }
    public void setPrecio(Integer precio) {
        Precio = precio;
    }
    public void setEsExplicito(Integer esExplicito) {
        EsExplicito = esExplicito;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public void setLink_pagina(String link_pagina) {
        Link_pagina = link_pagina;
    }
    public void setImagen_producto(String imagen_producto) {
        Imagen_producto = imagen_producto;
    }
    public void setID_Empresa(Integer ID_Empresa) {
        this.ID_Empresa = ID_Empresa;
    }
}
