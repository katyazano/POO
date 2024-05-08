package edu.katheryn_azano.evidencia3.process;

import edu.katheryn_azano.evidencia3.ui.Idiomas;

import java.util.Scanner;

class Persona extends Jugador {
    public Persona(String nombre, String simbolo) {
        super(nombre, simbolo);
    }

    /**
     * Metodo extendido de la clase Jugador, para las jugadas de los dos
     * jugadores (P vs P) o el jugador (P vs Comp) en cada partida
     * @param tablero
     */
    public void jugada(Tablero tablero){
        // Implementar la lógica de jugada de la persona
        Tablero tableroGato = new Tablero();
        Scanner scanner = new Scanner(System.in);
        boolean juegoEnCurso = true;
        while(juegoEnCurso){
            tableroGato.mostrarTablero();
            System.out.println("es el turno de: " + this.getNombre());
            System.out.println("Ingrese la fila deseada (1-3): ");
            int fila = scanner.nextInt();
            System.out.println("Ingrese la columna deseada (1-3): ");
            int columna = scanner.nextInt();

            //Para ajustar la columna y la fila ingresada de 1-3 a 0-2
            fila--;
            columna--;

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3){
                if(tableroGato.marcarCasilla(fila,columna,this.getSimbolo())){
                    if (tableroGato.hayGanador(this.getSimbolo())){
                        tableroGato.mostrarTablero();
                        System.out.println("Felicidades " + this.getNombre() + ", has ganado esta partida");
                        juegoEnCurso = false;
                    }else if (tableroGato.estaLleno()){
                        tableroGato.mostrarTablero();
                        System.out.println("¡Juego terminado, es un empate!");
                        juegoEnCurso = false;
                    }
                } else {
                    System.out.println("La casilla seleccionada esta ocupada, intente de nuevo");
                }
            }else {
                System.out.println("Ingresa una casilla valida (1-3)");
            }


        }

    }
}