package com.example.dani.appexadt2_danisabbagh.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Municipios implements Serializable {
    private int id;
    private String nombreMunicipio;

    private ArrayList<Municipios> municipios;

    public Municipios(int id, String nombreMunicipio) {
        this.id = id;
        this.nombreMunicipio = nombreMunicipio;
    }

    public Municipios(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }
    public ArrayList<Municipios> getMunicipios(){
        return municipios;
    }
}
