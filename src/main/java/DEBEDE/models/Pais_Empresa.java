package DEBEDE.models;

public class Pais_Empresa {
    private Integer ID_Ranking;
    private Integer ID_Pais;
    private Integer ID_Empresa;

    //Constructor

    public Pais_Empresa(Integer ID_Ranking, Integer ID_Pais, Integer ID_Empresa) {
        this.ID_Ranking = ID_Ranking;
        this.ID_Pais = ID_Pais;
        this.ID_Empresa = ID_Empresa;
    }

    //Getters

    public Integer getID_Ranking() {
        return ID_Ranking;
    }

    public Integer getID_Pais() {
        return ID_Pais;
    }

    public Integer getID_Empresa() {
        return ID_Empresa;
    }

    //Setters

    public void setID_Ranking(Integer ID_Ranking) {
        this.ID_Ranking = ID_Ranking;
    }

    public void setID_Pais(Integer ID_Pais) {
        this.ID_Pais = ID_Pais;
    }

    public void setID_Empresa(Integer ID_Empresa) {
        this.ID_Empresa = ID_Empresa;
    }
}
