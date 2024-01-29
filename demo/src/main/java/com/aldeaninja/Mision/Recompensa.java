package com.aldeaninja.Mision;

public enum Recompensa{
    
    Diamante("inicial"),
    DiamantePlatino("secundario"),
    DiamanteOro("solucion"),
    Diamanteplus("intermedio"),
    Monedasdeoro("dificil");


    private String descripcion;

    private Recompensa(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
