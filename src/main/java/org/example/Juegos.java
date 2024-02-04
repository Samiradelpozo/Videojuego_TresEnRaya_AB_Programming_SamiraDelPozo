package org.example;
// Para cumplir el principio de abierto/cerrado
// Creo una clase llamada "Juegos" si quiero implemnetar un nuevo juego será más sencillo sin modificar los demás
public interface Juegos {
    void iniciarJuego();
}