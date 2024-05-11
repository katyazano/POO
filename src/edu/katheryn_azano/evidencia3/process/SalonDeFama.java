package edu.katheryn_azano.evidencia3.process;

import edu.katheryn_azano.evidencia3.data.PuntajesJugador;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SalonDeFama {
    private static final int cantEspacios = 5;
    private List<PuntajesJugador> puntajes;

    public SalonDeFama(){
        puntajes = new ArrayList<>();
        cargarSalonFama();
    }

    /**
     * Metodo para leer los puntajes almacenados en el archivo y ordenarlos en la lista de
     * puntajes
     */
    public void cargarSalonFama(){
        try (BufferedReader bw = new BufferedReader(new FileReader("src/edu/katheryn_azano/evidencia3/resources/salonDefama.txt"))){
            puntajes = bw.lines()
                    .map(linea -> linea.split(","))
                    .map(datos -> new PuntajesJugador(datos[0], datos[1], Integer.parseInt(datos[2])))
                    .collect(Collectors.toList());
        }catch (IOException e){
            System.out.println("Error al cargar el salón de la fama: " + e.getMessage());
        }
    }

    /**
     * Metodo para guardar los lugares en el documento del salon de la fama
     * de manera que cuando se reinicie el programa no se pierdan los lugares
     */
    public void guardarSalonFama() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/edu/katheryn_azano/evidencia3/resources/salonDefama.txt"))) {
            puntajes.stream()
                    .map(puntaje -> puntaje.getNombre() + "," + puntaje.getSimbolo() + "," + puntaje.getPuntaje())
                    .forEach(linea -> {
                        try {
                            bw.write(linea);
                            bw.newLine();
                        } catch (IOException e) {
                            System.out.println("Error al guardar el salón de la fama: " + e.getMessage());
                        }
                    });
        } catch (IOException e) {
            System.out.println("Error al crear el BufferedWriter: " + e.getMessage());
        }
    }

    /**
     * Metodo para actualizar el salon de la fama con nuevos puntajes y compararlos
     * además de acomodarlo de manera descendente
     * @param nuevoPuntaje nuevo puntaje record del jugador
     */
    public void actualizarSalonDeLaFama(PuntajesJugador nuevoPuntaje, int victorias) {
        puntajes.removeIf(p -> p.equals(nuevoPuntaje));
        nuevoPuntaje.setPuntaje(victorias); // Actualiza el puntaje con el número de victorias
        puntajes.add(nuevoPuntaje);

        puntajes = puntajes.stream()
                //metodo para hacer la comparacion de los puntajes y ordenarlos de manera descendente
                .sorted(Comparator.comparingInt(PuntajesJugador::getPuntaje).reversed())
                //se limita al maximo de los espacios
                .limit(cantEspacios)
                .collect(Collectors.toList());
        guardarSalonFama();
    }

    /**
     * Metodo para mostrar el salon de la fama guardada en el archivo y ya
     * ordenado por su nombre, simbolo y puntaje
     */
    public void mostrarSalonDeLaFama() {
        System.out.println("Salón de la Fama:");
        IntStream.range(0, puntajes.size())
                .mapToObj(i -> String.format("%d. %s - %s - %d puntos", i + 1, puntajes.get(i).getNombre(),
                        puntajes.get(i).getSimbolo(), puntajes.get(i).getPuntaje()))
                .forEach(System.out::println);
    }
}
