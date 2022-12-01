package DEBEDE.models;

public class Favoritos_Empresa {
    private Integer ID_Favoritos_Empresa;
    private Integer ID_Favorito;
    private Integer ID_Empresa;

    //Constructor

    public Favoritos_Empresa(Integer ID_Favoritos_Empresa, Integer ID_Favorito, Integer ID_Empresa) {
        this.ID_Favoritos_Empresa = ID_Favoritos_Empresa;
        this.ID_Favorito = ID_Favorito;
        this.ID_Empresa = ID_Empresa;
    }

    //Getters

    public Integer getID_Favoritos_Empresa() {
        return ID_Favoritos_Empresa;
    }

    public Integer getID_Favorito() {
        return ID_Favorito;
    }

    public Integer getID_Empresa() {
        return ID_Empresa;
    }

    //Setters

    public void setID_Favoritos_Empresa(Integer ID_Favoritos_Empresa) {
        this.ID_Favoritos_Empresa = ID_Favoritos_Empresa;
    }

    public void setID_Favorito(Integer ID_Favorito) {
        this.ID_Favorito = ID_Favorito;
    }

    public void setID_Empresa(Integer ID_Empresa) {
        this.ID_Empresa = ID_Empresa;
    }
}
