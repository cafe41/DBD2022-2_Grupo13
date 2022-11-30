package DEBEDE.models;

import java.util.Date;

public class Boleta {
    private String id_boleta;
    private String tipo_tarjeta;
    private String numero_tarjeta;
    private Integer monto;
    private Date fecha;
    private Integer id_usuario;
    private Integer id_empresa;

    // Constructor


    public Boleta(String id_boleta, String tipo_tarjeta, String numero_tarjeta, Integer monto, Date fecha, Integer id_usuario, Integer id_empresa) {
        this.id_boleta = id_boleta;
        this.tipo_tarjeta = tipo_tarjeta;
        this.numero_tarjeta = numero_tarjeta;
        this.monto = monto;
        this.fecha = fecha;
        this.id_usuario = id_usuario;
        this.id_empresa = id_empresa;
    }

    public String getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(String id_boleta) {
        this.id_boleta = id_boleta;
    }

    public String getTipo_tarjeta() {
        return tipo_tarjeta;
    }

    public void setTipo_tarjeta(String tipo_tarjeta) {
        this.tipo_tarjeta = tipo_tarjeta;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }
}