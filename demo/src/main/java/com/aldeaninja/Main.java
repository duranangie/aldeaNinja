package com.aldeaninja;

import java.io.IOException;
import java.util.Scanner;

import com.aldeaninja.Mision.Mision;
import com.aldeaninja.Ninja.Ninja;

public class Main {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        /*
         * crear un menu que tenga estas funcioaalidades liste todos los ninjas junto
         * sus habilidades ,Mostrar misiones disponibles para un ninja especifico,
         * Mostrar las misiones completadas
         * para ninja especifico, asignar una mision a un ninja , registrando fecha
         * inicio , marcar mision como completada, registrando fecha de finalizacion,
         * mostrar todas las misiones completadas(funcionalidad descrita en un archivo
         * de texto ), con los datos de la base de datos)
         * 
         */
        /*
         * The purpose of this program is to provide a simple way for users to interact
         * with the Nin
         */
        /*
         * ja framework from the command line. It allows users to create, train and
         * battle ninjas
         */
        /**/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome a la interface de java...");
        String action = "";
        while (!action.equalsIgnoreCase("quit")) {
            printMenu();
            action = scanner.nextLine().toLowerCase();
            performAction(action);
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n\n" + "---------------MENU----------------");
        System.out.println("1: Crear ninja.");
        System.out.println("2: Ver todos los ninjas con sus habilidades.");
        System.out.println("3: Mostrar misiones disponibles para un ninja.");
        System.out.println("4: Mostrar misiones completas para un ninja.");
        System.out.println("5: asignar una mision a un ninja , registrando fecha inicio.");
        System.out.println("6: mostrar todas las misiones completadas(funcionalidad en archivo de texto)");
        System.out.println("5: Salir.");
    }

    /**
     * @param action
     */
    private static void performAction(String action) {
            switch (action) {
                case "1":
                    Ninja.crearNinja();
                    break;

       

    }

}
}

  