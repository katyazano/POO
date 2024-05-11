package edu.katheryn_azano.evidencia3.ui;

public class Idiomas {
    public static String MENU;
    public static String ERROR_GAMEMODE;
    public static String SELECCION_SIMBOLO;
    public static String ERROR_MOVIMIENTO;
    public static String ERROR_POSICION;
    public static String FILA;
    public static String COLUMNA;
    public static String VOLVER_JUGAR;
    public static String COMIENZA;
    public static  String TERMINA_TURNO;
    public static  String TURNO;
    public static  String SIGUIENTE_TURNO;
    public static  String TURNO_COMPUTADORA;
    public static String FELICITACION;
    public static String COMPUTADORA_GANADORA;
    public static String EMPATE;
    public static String JUGADOR_1;
    public static String JUGADOR_2;
    public static String FINAL;
    public static String FIN_COMPUTADORA;
    public static String SIMBOLOS;
    public static String ERROR_SIMBOLO;
    public static String CONFIRMAR_SIMBOLO;

    public static Idiomas getInstance(String idioma) {
        // Obtiene la instancia del idioma según el parámetro recibido
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion) {
            // Español
            case Textos.español:
                // Textos en español
                MENU = "Elige tu modo de juego: \n1. P vs Computadora \n2. P vs P \n0. Salir";
                ERROR_GAMEMODE = "Modo de juego no disponible";
                SELECCION_SIMBOLO = "Seleccione el simbolo con el que quieres jugar: ";
                FILA = "Ingrese la fila deseada (1-3): ";
                COLUMNA = "Ingrese la columna deseada (1-3): ";
                ERROR_MOVIMIENTO = "Movimiento inválido. Intente nuevamente.";
                ERROR_POSICION = "La casilla está ocupada. Intente nuevamente.";
                VOLVER_JUGAR = "¿Desean volver a jugar? (s/n)";
                COMIENZA = "Comienza";
                TERMINA_TURNO = "termina turno";
                TURNO = "Tu turno: ";
                TURNO_COMPUTADORA = "Turno de la computadora: ";
                FELICITACION = "¡Felicidades, has ganado!";
                COMPUTADORA_GANADORA = "La computadora ha ganado. ¡Inténtalo de nuevo!";
                EMPATE ="El juego ha terminado en empate." ;
                SIGUIENTE_TURNO = "Es el turno de: ";
                JUGADOR_1 ="Ingrese el nombre del jugador 1: ";
                JUGADOR_2 ="Ingrese el nombre del jugador 2: ";
                FIN_COMPUTADORA = "Presione 'a' para ver el salón de la fama o 'b' para seguir jugando: ";
                FINAL = "Muchas gracias por jugar! Programa Terminado :)";
                SIMBOLOS = "X, O, #, *, @, &, $, !, ?, +";
                ERROR_SIMBOLO = "Opción inválida. Seleccionando símbolo por defecto";
                CONFIRMAR_SIMBOLO = "Has elegido el simbolo: ";
                break;
            // Inglés
            case Textos.english:
                // Textos en inglés
                MENU = "Choose your game mode: \n1. P vs Computer \n2. P vs P \n0. Exit ";
                ERROR_GAMEMODE = "The game mode is not available";
                SELECCION_SIMBOLO = "Choose the symbol you want to play with: ";
                FILA = "Enter the desired row (1-3):";
                COLUMNA = "Enter the desired column (1-3):" ;
                ERROR_MOVIMIENTO = "Invalid move. Please try again.";
                ERROR_POSICION = "The cell is already occupied. Please try again.";
                VOLVER_JUGAR = "Do you want to play again? (y/n)";
                COMIENZA = "Starts";
                TERMINA_TURNO = "end turn";
                TURNO = "Your turn: ";
                TURNO_COMPUTADORA = "Computer turn: ";
                FELICITACION = "Congratulations, you have won!";
                COMPUTADORA_GANADORA = "The computer has won. Try again!";
                EMPATE ="The game has ended in a tie." ;
                SIGUIENTE_TURNO = "it's the turn of: ";
                JUGADOR_1 ="Enter the name of player 1: ";
                JUGADOR_2 ="Enter the name of player 2: ";
                FIN_COMPUTADORA = "Press 'a' to see the hall of fame or 'b' to keep playing";
                FINAL = "Thank you very much for playing! Program Finished :)";
                SIMBOLOS = "X, O, #, *, @, &, $, !, ?, +";
                ERROR_SIMBOLO = "Invalid option. Selecting default symbol";
                CONFIRMAR_SIMBOLO = "You chose the symbol: ";
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