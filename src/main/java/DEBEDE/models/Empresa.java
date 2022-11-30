package DEBEDE.models;

public class Empresa {
    private Integer id_empresa;
    private String nombre_empresa;
    private Boolean es_explicita;
    private Integer id_ranking;

    public Empresa(Integer id_empresa, String nombre_empresa, Boolean es_explicita, Integer id_ranking) {
        this.id_empresa = id_empresa;
        this.nombre_empresa = nombre_empresa;
        this.es_explicita = es_explicita;
        this.id_ranking = id_ranking;
    }

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public Boolean getEs_explicita() {
        return es_explicita;
    }

    public void setEs_explicita(Boolean es_explicita) {
        this.es_explicita = es_explicita;
    }

    public Integer getId_ranking() {
        return id_ranking;
    }

    public void setId_ranking(Integer id_ranking) {
        this.id_ranking = id_ranking;
    }
}

