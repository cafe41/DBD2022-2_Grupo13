package DEBEDE.models;

public class Permiso {
    private Integer ID_Permiso;
    private String Descripcion_Permiso;

    //Constructor

    public Permiso(Integer ID_Permiso, String descripcion_Permiso) {
        this.ID_Permiso = ID_Permiso;
        this.Descripcion_Permiso = descripcion_Permiso;
    }


    //Getter

    public Integer getID_Permiso() {
        return ID_Permiso;
    }

    public String getDescripcion_Permiso() {
        return Descripcion_Permiso;
    }

    //Setter


    public void setID_Permiso(Integer ID_Permiso) {
        this.ID_Permiso = ID_Permiso;
    }

    public void setDescripcion_Permiso(String descripcion_Permiso) {
        Descripcion_Permiso = descripcion_Permiso;
    }
}
