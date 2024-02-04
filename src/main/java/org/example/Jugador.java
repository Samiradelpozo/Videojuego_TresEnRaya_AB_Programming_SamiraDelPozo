package org.example;
import java.util.Scanner;

public class Jugador{
    public static void pedirNumero(String ficha, String [] tabla){
        // Pedir al jugador X que introduzca un número
        Scanner leerPosicion = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Jugador " + ficha + ": Introduce el número donde quieres que se coloque la " + ficha);
            numero = leerPosicion.nextInt();
            // Comprobar que número este entre 0 a 8
            if (numero < 0 || numero >= tabla.length ){
                System.out.println("Error: Por favor, introduce un número entre el 0 - 8. ¡Prueba de nuevo!");
                continue;
            }
            // Comprobar que el número no esté ocupado
            if (!tabla[numero].equals("_")){
                System.out.println("Error: El número introducido ya está ocupado. ¡Prueba de nuevo!");
            }
        } while(numero < 0 || numero >= tabla.length || !tabla[numero].equals("_"));
        tabla[numero] = ficha;
    }
}
