package DEBEDE.models;

public class Empresa_Categoria {
    private Integer ID_Empresa_Categoria;
    private Integer ID_Empresa;
    private Integer ID_Categoria;

    //Constructores

    public Empresa_Categoria(Integer ID_Empresa_Categoria, Integer ID_Empresa, Integer ID_Categoria) {
        this.ID_Empresa_Categoria = ID_Empresa_Categoria;
        this.ID_Empresa = ID_Empresa;
        this.ID_Categoria = ID_Categoria;
    }

    //Getters

    public Integer getID_Empresa_Categoria() {
        return ID_Empresa_Categoria;
    }

    public Integer getID_Empresa() {
        return ID_Empresa;
    }

    public Integer getID_Categoria() {
        return ID_Categoria;
    }

    //Setters

    public void setID_Empresa_Categoria(Integer ID_Empresa_Categoria) {
        this.ID_Empresa_Categoria = ID_Empresa_Categoria;
    }

    public void setID_Empresa(Integer ID_Empresa) {
        this.ID_Empresa = ID_Empresa;
    }

    public void setID_Categoria(Integer ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }
}

