package edu.katheryn_azano.evidencia3.ui;

public class Idiomas {
    public static String MENU;
    public static String ERROR_GAMEMODE;
    public static String SELECCION_SIMBOLO;
    public static String ERROR_MOVIMIENTO;
    public static String ERROR_POSICION;
    public static String MOVIMIENTO;

    public static edu.katheryn_azano.reto9.ui.Idiomas getInstance(String idioma) {
        // Obtiene la instancia del idioma según el parámetro recibido
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion) {
            // Español
            case Textos.español:
                // Textos en español
                MENU = "Elige tu modo de juego: \n1. P vs P \n2. P vs Comp. \n0. Salir";
                ERROR_GAMEMODE = "Modo de juego no disponible";
                SELECCION_SIMBOLO = "Seleccione el simbolo con el que quieres jugar: ";
                MOVIMIENTO = "Ingrese la fila y la columna donde desea colocar su símbolo (separadas por un espacio): ";
                ERROR_MOVIMIENTO = "Movimiento inválido. Intente nuevamente.";
                ERROR_POSICION = "La casilla está ocupada. Intente nuevamente.";
            break;
            // Inglés
            case Textos.english:
                // Textos en inglés
                MENU = "Choose your game mode: \n1. P vs P \n2. P vs Comp. \n0. Exit ";
                ERROR_GAMEMODE = "The game mode is not available";
                SELECCION_SIMBOLO = "Choose the symbol you want to play with: ";
                MOVIMIENTO = "Enter the row and column where you want to place your symbol (separated by a space): ";
                ERROR_MOVIMIENTO = "Invalid move. Please try again.";
                ERROR_POSICION = "The cell is already occupied. Please try again.";
            break;

            default:
                // Hay una excepción si el idioma no está disponible
                throw new IllegalArgumentException("Idioma no disponible / Language not available");
        }
        return null;
    }
}

enum Textos {
    español, english
}
