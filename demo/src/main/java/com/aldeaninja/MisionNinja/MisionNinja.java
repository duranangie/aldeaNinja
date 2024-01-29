package com.aldeaninja.MisionNinja;

import java.sql.Date;

import com.aldeaninja.Ninja.Ninja;

public class MisionNinja extends Ninja {


    int id_ninja;
    int id_mision;
    Date fechaInicio;
    Date fechaFin;
    public MisionNinja(String nombreNinja, int rango, String aldea, int id_ninja, int id_mision, Date fechaInicio,
            Date fechaFin) {
        super(nombreNinja, rango, aldea);
        this.id_ninja = id_ninja;
        this.id_mision = id_mision;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
            
    }
    public int getId_ninja() {
        return id_ninja;
    }
    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }
    public int getId_mision() {
        return id_mision;
    }
    public void setId_mision(int id_mision) {
        this.id_mision = id_mision;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    }
    