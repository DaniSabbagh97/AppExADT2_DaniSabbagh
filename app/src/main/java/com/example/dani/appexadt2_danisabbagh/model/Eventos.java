package com.example.dani.appexadt2_danisabbagh.model;

import java.io.Serializable;

public class Eventos implements Serializable {

    private int id;
    private String nombreEvento;
    private String nombreMunicipio;
    private String descripcion;
    private String fecha;
    private String hora;

    public Eventos(String nombreEvento, String nombreMunicipio, String descripcion, String fecha, String hora) {
        this.nombreEvento = nombreEvento;
        this.nombreMunicipio = nombreMunicipio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Eventos(int id, String nombreEvento, String nombreMunicipio, String descripcion, String fecha, String hora) {
        this.id = id;
        this.nombreEvento = nombreEvento;
        this.nombreMunicipio = nombreMunicipio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
