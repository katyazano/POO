package edu.katheryn_azano.reto3.diccionario;

import edu.katheryn_azano.reto3.diccionario.process.Diccionario;
import static edu.katheryn_azano.reto3.diccionario.ui.CLI.launchApp;

public class Main {
    public static void main(String[] args) {
        String[] palabras ={"Casa","Calle","Comida","Agua","Tiempo","Amigo","Trabajo","Familia","Feliz","Escuela"};
        String[] significados ={"Edificación o lugar donde vive una persona o una familia",
                "Vía pública entre edificios o espacios urbanos destinada al tránsito de personas y vehículos",
                "Alimento que se ingiere para satisfacer el hambre y nutrir el cuerpo",
                "Sustancia líquida, inodora e insípida, indispensable para la vida de los seres vivos",
                "Magnitud física que permite ordenar la secuencia de los acontecimientos y medir su duración",
                "Persona a la que se tiene cariño, confianza y con la que se comparten experiencias y momentos",
                "Actividad que se realiza de manera habitual para obtener un salario o un beneficio",
                "Grupo de personas emparentadas entre sí que conviven bajo el mismo techo y comparten vínculos afectivos",
                "Estado de ánimo caracterizado por la alegría, la satisfacción y el bienestar emocional",
                "Institución educativa donde se imparte enseñanza a estudiantes, generalmente niños y adolescentes"};

        // Se crea una instancia de Diccionario con las palabras y significados proporcionados.
        Diccionario diccionario = new Diccionario(palabras,significados);
        try{
            launchApp(diccionario);
        } catch (Exception e){ //si el usuario ingresa una respuesta que no se puede procesar les arroja "Error inesperado"
            System.out.println("Error inesperado"+e);
        }
    }
}