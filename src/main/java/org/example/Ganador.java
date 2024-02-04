package org.example;

public class Ganador {
    public static boolean hayGanador(String[] tabla) {

        // Verificar filas
        if (tabla[0].equals(tabla[1]) && tabla[1].equals(tabla[2]) && !tabla[0].equals("_")) {
            System.out.println("¡Jugador " + tabla[0] + " gana!");
            return true;
        }
        if (tabla[3].equals(tabla[4]) && tabla[4].equals(tabla[5]) && !tabla[3].equals("_")) {
            System.out.println("¡Jugador " + tabla[3] + " gana!");
            return true;
        }
        if (tabla[6].equals(tabla[7]) && tabla[7].equals(tabla[8]) && !tabla[6].equals("_")) {
            System.out.println("¡Jugador " + tabla[6] + " gana!");
            return true;
        }

        // Verificar columnas
        if (tabla[0].equals(tabla[3]) && tabla[3].equals(tabla[6]) && !tabla[0].equals("_")) {
            System.out.println("¡Jugador " + tabla[0] + " gana!");
            return true;
        }
        if (tabla[1].equals(tabla[4]) && tabla[4].equals(tabla[7]) && !tabla[1].equals("_")) {
            System.out.println("¡Jugador " + tabla[1] + " gana!");
            return true;
        }
        if (tabla[2].equals(tabla[5]) && tabla[5].equals(tabla[8]) && !tabla[2].equals("_")) {
            System.out.println("¡Jugador " + tabla[2] + " gana!");
            return true;
        }

        // Verificar diagonales
        if (tabla[0].equals(tabla[4]) && tabla[4].equals(tabla[8]) && !tabla[0].equals("_")) {
            System.out.println("¡Jugador " + tabla[0] + " gana!");
            return true;
        }
        if (tabla[2].equals(tabla[4]) && tabla[4].equals(tabla[6]) && !tabla[2].equals("_")) {
            System.out.println("¡Jugador " + tabla[2] + " gana!");
            return true;
        }
        return false;
    }

    // Comprobar que cada valor de la Tabla es distinto "_"
    public static boolean tablaLlena(String[] tabla){
        if (!tabla[0].equals("_") && !tabla[1].equals("_") && !tabla[2].equals("_") && !tabla[3].equals("_") && !tabla[4].equals("_") &&
                !tabla[5].equals("_") && !tabla[6].equals("_") && !tabla[7].equals("_") && !tabla[8].equals("_")){
            System.out.println("¡Empate!");
            return true;
        }
        return false;
    }
}
