package com.aldeaninja.Mision;

public class Mision {
    int id;
    String nombreMision;
    String descripcion;
    int rangoMision;
    Recompensa recompensa;
    public Mision(int id, String nombreMision, String descripcion, int rangoMision, Recompensa recompensa) {
        this.id = id;
        this.nombreMision = nombreMision;
        this.descripcion = descripcion;
        this.rangoMision = rangoMision;
        this.recompensa = recompensa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreMision() {
        return nombreMision;
    }
    public void setNombreMision(String nombreMision) {
        this.nombreMision = nombreMision;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getRangoMision() {
        return rangoMision;
    }
    public void setRangoMision(int rangoMision) {
        this.rangoMision = rangoMision;
    }
    public Recompensa getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(Recompensa recompensa) {
        this.recompensa = recompensa;
    }
 
    
}
