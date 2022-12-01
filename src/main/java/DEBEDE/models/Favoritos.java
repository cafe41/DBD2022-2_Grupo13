package DEBEDE.models;

public class Favoritos {
        private Integer ID_Favorito;

        private Integer ID_Usuario;

    public Favoritos(Integer ID_Favorito, Integer ID_Usuario) {
        this.ID_Favorito = ID_Favorito;
        this.ID_Usuario = ID_Usuario;
    }

    public Integer getID_Favorito() {
        return ID_Favorito;
    }

    public Integer getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Favorito(Integer ID_Favorito) {
        this.ID_Favorito = ID_Favorito;
    }

    public void setID_Usuario(Integer ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }
}


