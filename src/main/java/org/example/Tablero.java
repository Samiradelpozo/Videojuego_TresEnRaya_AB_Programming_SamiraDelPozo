package org.example;
public class Tablero{
    private String[] tabla;
    public Tablero(){
        tabla = new String[]{"_", "_", "_", "_", "_", "_", "_", "_", "_"}; //Se crea una matriz vacía que se llenará de X u O
    }
    public String[] getTabla(){
        return tabla;
    }
    static void tablaNumeros(){
        //Crear la matriz 3x3 de la posición a elegir (matriz[x][y])
        int matriz[][] = new int[3][3];
        matriz[0][0]=0;
        matriz[0][1]=1;
        matriz[0][2]=2;
        matriz[1][0]=3;
        matriz[1][1]=4;
        matriz[1][2]=5;
        matriz[2][0]=6;
        matriz[2][1]=7;
        matriz[2][2]=8;

        //Imprimir matriz por pantalla
        for (int x = 0; x < matriz.length; x++) {
            System.out.print("                     |");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("   ");
                }
            }
            System.out.println("|");
        }
    }

    // Crear la estructura de la matriz en blanco
    static void mostrarTablaSimbolos(String [] matrizSimbolo) {
        System.out.println(" | " + matrizSimbolo[0] + " | " + matrizSimbolo[1] + " | " + matrizSimbolo[2] + " | ");
        System.out.println(" | " + matrizSimbolo[3] + " | " + matrizSimbolo[4] + " | " + matrizSimbolo[5] + " | ");
        System.out.println(" | " + matrizSimbolo[6] + " | " + matrizSimbolo[7] + " | " + matrizSimbolo[8] + " | ");
    }
}
