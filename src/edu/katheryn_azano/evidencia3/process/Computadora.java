package edu.katheryn_azano.evidencia3.process;

import java.util.Random;

class Computadora extends Jugador {
    static String[] simbolos = {"X", "O", "#", "*", "@", "&", "$", "!", "?", "+"};

    /**
     * Constructor
     */
    public Computadora(String simbolo) {
       //Genera un simbolo random para la computadora en cada partida
        super("Computadora", simbolos[new Random().nextInt(simbolos.length)]);
    }

    /**
     * Metodo jugada de la computadora para ir vs persona
     * @param tablero para las jugadas
     * @return en dado caso de que no se este en algun posible ganador generar un empate
     */
    public boolean jugada(Tablero tablero) {
        // Intentar ganar en la siguiente jugada
        if (realizarJugadaGanadora(tablero, getSimbolo())) {
            return true;
        }

        // Intentar bloquear al jugador humano
        if (realizarJugadaGanadora(tablero, getSimboloContrario())) {
            return true;
        }

        // Si no se encontraron jugadas ganadoras, realizar una jugada aleatoria
        return realizarJugadaAleatoria(tablero);
    }


    /**
     * Metodo para que en caso de que solo le falte un simbolo para
     * ganar, se enfoque de colocarlo ahi en caso de que no fuer bloqueado
     * por el jugador o en su turno solo falta esa casilla de maracar
     * @param tablero isntancia del tablero
     * @param simbolo de la computadora
     * @return true para realizar la jugada ganadora
     */
    private boolean realizarJugadaGanadora(Tablero tablero, String simbolo) {
        // Buscar una jugada ganadora
        for (int fila = 0; fila < tablero.getFilas(); fila++) {
            for (int columna = 0; columna < tablero.getColumnas(); columna++) {
                if (tablero.esCasillaVacia(fila, columna)) {
                    // Intentar realizar la jugada en esta casilla
                    tablero.marcarCasilla(fila, columna, simbolo);
                    if (tablero.hayGanador(simbolo)) {
                        // La jugada es ganadora, dejar la ficha en esta casilla y retornar true
                        return true;
                    }
                    // Deshacer la jugada para probar la siguiente casilla
                    tablero.limpiarCasilla(fila, columna);
                }
            }
        }

        // Si no hay una jugada ganadora, verificar si el oponente puede ganar en el siguiente movimiento y bloquearlo
        String simboloOponente = getSimboloContrario();
        for (int fila = 0; fila < tablero.getFilas(); fila++) {
            for (int columna = 0; columna < tablero.getColumnas(); columna++) {
                if (tablero.esCasillaVacia(fila, columna)) {
                    // Intentar realizar la jugada en esta casilla para bloquear al oponente
                    tablero.marcarCasilla(fila, columna, simboloOponente);
                    if (tablero.hayGanador(simboloOponente)) {
                        // Si el oponente puede ganar en su siguiente movimiento, bloquearlo
                        tablero.limpiarCasilla(fila, columna); // Deshacer la jugada del bloqueo
                        tablero.marcarCasilla(fila, columna, simbolo); // Realizar la jugada ganadora
                        return true;
                    }
                    // Deshacer la jugada para probar la siguiente casilla
                    tablero.limpiarCasilla(fila, columna);
                }
            }
        }
        // No se encontró una jugada ganadora
        return false;
    }

    /**
     *  Metodo para realizar una jugada aleatoria solo en una casilla vacia, sin necesidad
     *  de ir por ganar
     * @param tablero instancia del tablero
     * @return true para el movimiento
     */
    private boolean realizarJugadaAleatoria(Tablero tablero) {
        // Realizar una jugada aleatoria en una casilla vacía
        int fila, columna;
        do {
            fila = new Random().nextInt(tablero.getFilas());
            columna = new Random().nextInt(tablero.getColumnas());
        } while (!tablero.esCasillaVacia(fila, columna));

        // Realizar la jugada en el tablero
        tablero.marcarCasilla(fila, columna, getSimbolo());

        return true;
    }

    /**
     * Metodo para que la computadora obtenga el simbolo contrario
     * y no juege con el mismo
     * @return simbolo del jugador
     */
    private String getSimboloContrario() {
        // Obtener el símbolo contrario al de la computadora
        String simboloComputadora = getSimbolo();
        for (String simbolo : simbolos) {
            //verifica que en la lista de simbolos no salgan dos repetidos
            //(el del humano y la computadora)
            if (!simbolo.equals(simboloComputadora)) {
                return simbolo;
            }
        }
        return null; // Nunca debería llegar aquí
    }
}
