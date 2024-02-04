package org.example;
public class TresEnRaya implements Juegos {
    @Override
    public void iniciarJuego() {
        Tablero tablero = new Tablero(); // Crear un nuevo tablero
        int jugadorXO = 0;  // Inicializar jugador
        String ficha;

        // Bucle que me devuelve true en cada vuelta a menos que haya un ganador o ya no haya espacios vacíos
        do {
            //1º Muestre la matriz de números
            Tablero.tablaNumeros();

            // 2º Pasar por parámetro si juega X u O
            if (jugadorXO % 2 == 0) {
                ficha = "X";
            } else {
                ficha = "O";
            }

            //3º Comprobar si hay ganador o si el tablero está lleno
            if (Ganador.hayGanador(tablero.getTabla())){
                break;
            }
            if (Ganador.tablaLlena(tablero.getTabla())) {
                System.out.println("¡GAME OVER!");
                break;
            }
            jugadorXO ++;

            //4º Pedir numero al jugedor (se le pasa la ficha, matriz vacía)
            Jugador.pedirNumero(ficha, tablero.getTabla());

            //5º Llamar a la funcion mostrarTablaSimbolos
            Tablero.mostrarTablaSimbolos(tablero.getTabla());

        } while(true);
    }

}