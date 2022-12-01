package DEBEDE.models;

public class Ranking_Empresa {
    private Integer ID_Ranking;
    private Float cantidad_ventas;
    private Integer ranking;

    //Constructor

    public Ranking_Empresa(Integer ID_Ranking, Float cantidad_ventas, Integer ranking) {
        this.ID_Ranking = ID_Ranking;
        this.cantidad_ventas = cantidad_ventas;
        this.ranking = ranking;
    }

    //Getters

    public Integer getID_Ranking() {
        return ID_Ranking;
    }

    public Float getCantidad_ventas() {
        return cantidad_ventas;
    }

    public Integer getRanking() {
        return ranking;
    }

    //Setters

    public void setID_Ranking(Integer ID_Ranking) {
        this.ID_Ranking = ID_Ranking;
    }

    public void setCantidad_ventas(Float cantidad_ventas) {
        this.cantidad_ventas = cantidad_ventas;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
