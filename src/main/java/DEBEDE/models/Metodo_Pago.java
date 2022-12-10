package DEBEDE.models;

import java.sql.Date;

public class Metodo_Pago {
    private Integer ID_Metodo_Pago;
    private String Tipo_Tarjeta;
    private String Numero_Tarjeta;
    private Date Fecha;
    private Integer ID_Usuario;

    //Constructor
    public Metodo_Pago(Integer ID_Metodo_Pago, String tipo_Tarjeta, String numero_Tarjeta, Date fecha, Integer ID_Usuario) {
        this.ID_Metodo_Pago = ID_Metodo_Pago;
        this.Tipo_Tarjeta = tipo_Tarjeta;
        this.Numero_Tarjeta = numero_Tarjeta;
        this.Fecha = fecha;
        this.ID_Usuario = ID_Usuario;
    }

    //Getters
    public Integer getID_Metodo_Pago() {
        return ID_Metodo_Pago;
    }

    public String getTipo_Tarjeta() {
        return Tipo_Tarjeta;
    }

    public String getNumero_Tarjeta() {
        return Numero_Tarjeta;
    }

    public Date getFecha() {
        return Fecha;
    }

    public Integer getID_Usuario() {
        return ID_Usuario;
    }

    //Setters
    public void setID_Metodo_Pago(Integer ID_Metodo_Pago) {
        this.ID_Metodo_Pago = ID_Metodo_Pago;
    }

    public void setTipo_Tarjeta(String tipo_Tarjeta) {
        Tipo_Tarjeta = tipo_Tarjeta;
    }

    public void setNumero_Tarjeta(String numero_Tarjeta) {
        Numero_Tarjeta = numero_Tarjeta;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public void setID_Usuario(Integer ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }
}
