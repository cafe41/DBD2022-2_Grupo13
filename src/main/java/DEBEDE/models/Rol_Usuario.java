package DEBEDE.models;

public class Rol_Usuario {
    private Integer ID_Rol_Usuario;
    private Integer ID_Rol;
    private Integer ID_Usuario;

    //Constructor


    public Rol_Usuario(Integer ID_Rol_Usuario, Integer ID_Rol, Integer ID_Usuario) {
        this.ID_Rol_Usuario = ID_Rol_Usuario;
        this.ID_Rol = ID_Rol;
        this.ID_Usuario = ID_Usuario;
    }

    //Getters
    public Integer getID_Rol_Usuario() {
        return ID_Rol_Usuario;
    }

    public Integer getID_Rol() {
        return ID_Rol;
    }

    public Integer getID_Usuario() {
        return ID_Usuario;
    }

    //Setters

    public void setID_Rol_Usuario(Integer ID_Rol_Usuario) {
        this.ID_Rol_Usuario = ID_Rol_Usuario;
    }

    public void setID_Rol(Integer ID_Rol) {
        this.ID_Rol = ID_Rol;
    }

    public void setID_Usuario(Integer ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }
}
