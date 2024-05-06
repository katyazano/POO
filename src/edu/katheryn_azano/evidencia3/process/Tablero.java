package edu.katheryn_azano.evidencia3.process;

class Tablero {
    private String[][] casillas;

    public Tablero() {
        casillas = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = " ";
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(casillas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean marcarCasilla(int fila, int columna, String simbolo) {
        if (casillas[fila][columna].equals(" ")) {
            casillas[fila][columna] = simbolo;
            return true;
        } else {
            return false;
        }
    }

    public boolean hayGanador(String simbolo) {
        // Implementar la lógica para verificar si hay un ganador
        return false;
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
}
