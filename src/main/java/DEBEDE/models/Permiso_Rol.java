package DEBEDE.models;

public class Permiso_Rol {
    private Integer ID_Permiso_Rol;
    private Integer ID_Permiso;
    private Integer ID_rol;

    //Constructor
    public Permiso_Rol(Integer ID_Permiso_Rol, Integer ID_Permiso, Integer ID_rol) {
        this.ID_Permiso_Rol = ID_Permiso_Rol;
        this.ID_Permiso = ID_Permiso;
        this.ID_rol = ID_rol;
    }
    //Getters

    public Integer getID_Permiso_Rol() {
        return ID_Permiso_Rol;
    }

    public Integer getID_Permiso() {
        return ID_Permiso;
    }

    public Integer getID_rol() {
        return ID_rol;
    }

    //Setters


    public void setID_Permiso_Rol(Integer ID_Permiso_Rol) {
        this.ID_Permiso_Rol = ID_Permiso_Rol;
    }

    public void setID_Permiso(Integer ID_Permiso) {
        this.ID_Permiso = ID_Permiso;
    }

    public void setID_rol(Integer ID_rol) {
        this.ID_rol = ID_rol;
    }
}
