package com.aldeaninja.Habilidad;

import com.aldeaninja.Ninja.Ninja;

public class Habilidad extends Ninja{
    int id;
    String nombraHabilidad;
    String descripcion;
    public Habilidad(String nombreNinja, int rango, String aldea, int id, String nombraHabilidad, String descripcion) {
        super(nombreNinja, rango, aldea);
        this.id = id;
        this.nombraHabilidad = nombraHabilidad;
        this.descripcion = descripcion;

        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombraHabilidad() {
        return nombraHabilidad;
    }
    public void setNombraHabilidad(String nombraHabilidad) {
        this.nombraHabilidad = nombraHabilidad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}