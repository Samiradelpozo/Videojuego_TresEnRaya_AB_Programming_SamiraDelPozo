package org.example;

public class PrincipalTresEnRaya {
    public static void main(String[] args){
        //Introducción
        System.out.println("============================================================");
        System.out.println("                 3 EN RAYA - 2 JUGADORES");
        System.out.println("============================================================");
        System.out.println(" ");

        // Crear una instancia de Juego para iniciar el TresEnRaya
        Juegos juego = new TresEnRaya();
        juego.iniciarJuego();
    }
}