package com.aldeaninja.Ninja;

import java.util.Scanner;

public class Ninja {
    int id;
    String nombreNinja;
    int rango;
    String aldea;

    public Ninja(String nombreNinja, int rango, String aldea) {
        this.id = id;
        this.nombreNinja = nombreNinja;
        this.rango = rango;
        this.aldea = aldea;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreNinja() {
        return nombreNinja;
    }

    public void setNombreNinja(String nombreNinja) {
        this.nombreNinja = nombreNinja;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    

   
}
public static void crearNinja() {


    Scanner sc=new Scanner (System.in); 
    System.out.println("Introduce el nombre del ninja");
    String nombreNinja=sc.nextLine();
    System.out.println("Introduce su aldea");
    String aldea=sc.nextLine();
    System.out.println("Introduce la rango del ninja");
    int rango=sc.nextInt();
   Ninja nwNinja= new Ninja(nombreNinja, rango,aldea);
   System.out.println("Se ha creado correctamente el ninja "+nwNinja.getNombreNinja());

   
}

}