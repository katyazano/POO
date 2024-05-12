package edu.katheryn_azano.evidencia3.process;

class Tablero {
    private String[][] casillas;

    /**
     * Constructor
     */
    public Tablero() {
        casillas = new String[3][3];
        reiniciarTablero();
    }

    /**
     * Metodo para reiniciar el tablero en caso de volver a jugar
     */
    public void reiniciarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = " ";
            }
        }
    }

    /**
     * Metodo para mostrar el tablero en la
     * consola
     */
    public void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(casillas[i][j] + "| ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    /**
     * Metodo para marcar la casilla en el tablero
     * @param fila ingresada por usuario o marcado por computadora
     * @param columna ingresada por usuario o marcado por computadora
     * @param simbolo de la computadora o de los jugadores
     */
    public boolean marcarCasilla(int fila, int columna, String simbolo) {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3) {
            throw new IllegalArgumentException("Los índices de fila y columna están fuera de los límites del tablero.");
        }

        if (casillas[fila][columna].equals(" ")) {
            casillas[fila][columna] = simbolo;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para verificar si hay 3 simbolos iguales seguidos en alguna fila columna o
     * diagonal derecha o izquierda
     * @param simbolo del usuario o computadora
     * @return true de que si hay ganador o false si es empate
     */
    public boolean hayGanador(String simbolo) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (casillas[i][0].equals(simbolo) && casillas[i][1].equals(simbolo) && casillas[i][2].equals(simbolo)) {
                return true; // Tres símbolos seguidos en una fila
            }
        }

        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (casillas[0][i].equals(simbolo) && casillas[1][i].equals(simbolo) && casillas[2][i].equals(simbolo)) {
                return true; // Tres símbolos seguidos en una columna
            }
        }

        // Verificar diagonal principal
        if (casillas[0][0].equals(simbolo) && casillas[1][1].equals(simbolo) && casillas[2][2].equals(simbolo)) {
            return true; // Tres símbolos seguidos en la diagonal principal
        }

        // Verificar diagonal secundaria
        if (casillas[0][2].equals(simbolo) && casillas[1][1].equals(simbolo) && casillas[2][0].equals(simbolo)) {
            return true; // Tres símbolos seguidos en la diagonal secundaria
        }

        return false; // No se encontró un ganador
    }

    /**
     * Metodo para rectificar que ya esta lleno el
     * tablero y se puede terminar la partida
     * @return false si ya esta lleno, o true si aun faltan casillas
     */
    public boolean estaLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (casillas[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Para rectificar si la casilla esta vacia y puede ser
     * utilizada
     * @param fila ingresada por usuario o marcado por computadora
     * @param columna ingresada por usuario o marcado por computadora
     * @return la casilla vacia
     */
    public boolean esCasillaVacia(int fila, int columna) {
        return casillas[fila][columna].equals(" ");
    }

    /**
     * Metodo para limpiar la casilla al inciar nueva partida o juego
     * @param fila ingresada por usuario o marcado por computadora
     * @param columna ingresada por usuario o marcado por computadora
     */
    public void limpiarCasilla(int fila, int columna) {
        casillas[fila][columna] = " ";
    }


    /**
     * Obtener las filas
     */
    public int getFilas() {
        return casillas.length;
    }

    /**
     * Obtener las columnas
     */
    public int getColumnas() {
        return casillas[0].length;
    }
}

