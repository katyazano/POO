package edu.katheryn_azano.evidencia3.process;

import edu.katheryn_azano.evidencia3.data.PuntajesJugador;
import edu.katheryn_azano.evidencia3.ui.Idiomas;

import java.util.*;

public class JuegoGato {

    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private Idiomas idioma;
    private List<PuntajesJugador> salonFama;

    public JuegoGato(Idiomas idioma) {
        this.tablero = new Tablero();
        this.idioma = idioma;
        this.salonFama = new ArrayList<>();
        this.jugador1 = null;
        this.jugador2 = null;
    }

    /**
     * Metodo para generar el turno de manera aleatoria para el modo
     * Jugador vs Jugador
     */
    public static void generarTurnoPersona(String nombrejugador1, String nombrejugador2){
        Tablero tablero = new Tablero();
        Persona jugador1 = new Persona(nombrejugador1,"X");
        Persona jugador2 = new Persona(nombrejugador2,"0");
        Random random = new Random();
        boolean turnoJugador = random.nextBoolean();

        if (turnoJugador) {
            System.out.println("Comienza " + jugador1.getNombre() + " (" + jugador1.getSimbolo() + ").");
            jugador1.jugada(tablero);
        } else {
            System.out.println("Comienza " + jugador2.getNombre() + " (" + jugador2.getSimbolo() + ").");
            jugador2.jugada(tablero);
        }
    }

    /**
     * Metodo para generar el turno de manera aleatoria para el modo
     * Jugador vs Computadora
     */
    public static void generarTurnoComputadora(String nombrejugador){
        Tablero tablero = new Tablero();
        Persona jugador = new Persona(nombrejugador,"X");
        Persona computadora = new Persona("Computadora","0");
        Random random = new Random();
        boolean turnoJugador = random.nextBoolean();

        if (turnoJugador) {
            System.out.println("Comienza " + jugador.getNombre() + " (" + jugador.getSimbolo() + ").");
            jugador.jugada(tablero);
        } else {
            System.out.println("Comienza " + computadora.getNombre() + " (" + computadora.getSimbolo() + ").");
            computadora.jugada(tablero);
        }
    }



    public void mostrarTablero() {
        tablero.mostrarTablero();
    }

    public void mostrarSalonFama() {
        if (salonFama.isEmpty()) {
            System.out.println(idioma.getSalonFamaVacio());
        } else {
            System.out.println(idioma.getSalonFamaTitulo());
            for (int i = 0; i < salonFama.size() && i < 5; i++) {
                Puntaje puntaje = salonFama.get(i);
                System.out.println((i + 1) + ". " + puntaje.getNombre() + " (" + puntaje.getSimbolo() + "): " + puntaje.getPuntaje());
            }
        }
    }

    public void sumarPuntos(Jugador jugador) {
        jugador.sumarVictoria();
    }

    public void crearSalonFama() {
        // Implementar la lógica para crear el salón de la fama (lectura de archivo, base de datos, etc.)
    }

    public void iniciarJuego() {
        elegirIdioma();
        elegirModoJuego();
        iniciarPartida();
        jugarPartida();
        mostrarResultadosFinales();
    }

    private void elegirIdioma() {
        System.out.println(idioma.getElegirIdioma());
        int opcionIdioma = new Scanner(System.in).nextInt();
        if (opcionIdioma == 1) {
            idioma.setLocale(Locale.ENGLISH);
        } else if (opcionIdioma == 2) {
            idioma.setLocale(Locale.SPANISH);
        } else {
            System.out.println(idioma.getOpcionInvalida());
            elegirIdioma();
        }
    }

    private void elegirModoJuego() {
        System.out.println(idioma.getElegirModoJuego());
        int opcionModoJuego = new Scanner(System.in).nextInt();
        if (opcionModoJuego == 1) {
            jugador1 = crearJugadorPersona();
            jugador2 = new Computadora(elegirSimbolo());
        } else if (opcionModoJuego == 2) {
            jugador1 = crearJugadorPersona();
            jugador2 = crearJugadorPersona();
        } else {
            System.out.println(idioma.getOpcionInvalida());
            elegirModoJuego();
        }
    }

    private Jugador crearJugadorPersona() {
        System.out.println(idioma.getIngresarNombre());
        String nombre = new Scanner(System.in).nextLine();
        String simbolo = elegirSimbolo();
        return new Persona(nombre, simbolo);
    }

    private String elegirSimbolo() {
        List<String> simbolosDisponibles = new ArrayList<>();
        simbolosDisponibles.add("X");
        simbolosDisponibles.add("O");
        simbolosDisponibles.add("♥");
        simbolosDisponibles.add("♦");
        simbolosDisponibles.add("♣");
        simbolosDisponibles.add("♠");
        simbolosDisponibles.add("★");
        simbolosDisponibles.add("☮");
        simbolosDisponibles.add("☯");

        System.out.println(idioma.getElegirSimbolo());
        for (int i = 0; i < simbolosDisponibles.size(); i++) {
            System.out.print(simbolosDisponibles.get(i) + " ");
        }
        System.out.println();

        String simboloElegido = new Scanner(System.in).nextLine().toUpperCase();
        while (!simbolosDisponibles.contains(simboloElegido)) {
            System.out.println(idioma.getSimboloInvalido());
            System.out.println(idioma.getElegirSimbolo());
            for (int i = 0; i < simbolosDisponibles.size(); i++) {
                System.out.print(simbolosDisponibles.get(i) + " ");
            }
            System.out.println();
            simboloElegido = new Scanner(System.in).nextLine().toUpperCase();
        }
        return simboloElegido;
    }

    private void iniciarPartida() {
        int turno = (int) (Math.random() * 2) + 1;
        if (turno == 1) {
            System.out.println(idioma.getTurno(jugador1.getNombre()));
        } else {
            System.out.println(idioma.getTurno(jugador2.getNombre()));
        }
    }

    private void jugarPartida() {
        boolean terminarPartida = false;
        while (!terminarPartida) {
            mostrarTablero();

            if (turno == 1) {
                jugador1.jugar(tablero);
            } else {
                jugador2.jugar(tablero);
            }

            if (tablero.hayGanador(jugador1.getSimbolo())) {
                mostrarTablero();
                System.out.println(idioma.getGanador(jugador1.getNombre()));
                sumarPuntos(jugador1);
                terminarPartida = true;
            } else if (tablero.hayGanador(jugador2.getSimbolo())) {
                mostrarTablero();
                System.out.println(idioma.getGanador(jugador2.getNombre()));
                sumarPuntos(jugador2);
                terminarPartida = true;
            } else if (tablero.estaLleno()) {
                mostrarTablero();
                System.out.println(idioma.getEmpate());
                terminarPartida = true;
            }

            turno = (turno == 1) ? 2 : 1;
        }
    }
}