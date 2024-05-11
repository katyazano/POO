package edu.katheryn_azano.evidencia3.process;

class Tablero {
    private String[][] casillas;

    public Tablero() {
        casillas = new String[3][3];
        reiniciarTablero();
    }

    public void reiniciarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = " ";
            }
        }
    }

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

    public boolean esCasillaVacia(int fila, int columna) {
        return casillas[fila][columna].equals(" ");
    }

    public void limpiarCasilla(int fila, int columna) {
        casillas[fila][columna] = " ";
    }


    public int getFilas() {
        return casillas.length;
    }

    public int getColumnas() {
        return casillas[0].length;
    }
}

