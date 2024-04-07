package edu.katheryn_azano.reto9.ui;

public class Idiomas {
    public static String MENU;
    public static String LIBRO_SELECCIONADO;
    public static String LISTA_PALABRAS;
    public static String VECES;
    public static String GATO_CON_BOTAS;
    public static String TRES_CERDITOS;
    public static String PINOCHO;
    public static String GANSO_DE_ORO;
    public static String RICITOS;
    public static String ERROR_LIBRO;
    public static Idiomas getInstance(String idioma){
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion){
            // Español
            case Textos.A,a:
                MENU="Favor de escoger un libro: \n1.El ganso de oro \n2.El gato con botas \n3.Los 3 cerditos \n4.Pinocho \n5.Ricitos de oro";
                LIBRO_SELECCIONADO= "El libro seleccionado fue: ";
                LISTA_PALABRAS = "Las 10 palabras mas repetidas son: ";
                VECES = "veces";
                GANSO_DE_ORO = "El ganso de oro";
                GATO_CON_BOTAS = "El gato con botas";
                TRES_CERDITOS = "Los 3 cerditos";
                PINOCHO = "Pinocho";
                RICITOS = "Ricitos de oro";

                ERROR_LIBRO = "Libro no disponible";
                break;
            // Ingles
            case Textos.B,b:
                MENU="Please choose a book: \n1.Golden goose \n2.Puss in Boots \n3.The 3 little pigs \n4.Pinocchio \n5.Goldilocks";
                LIBRO_SELECCIONADO = "The selected book is: ";
                LISTA_PALABRAS = "The top 10 repeated words are: ";
                VECES = "times";
                GANSO_DE_ORO = "Golden goose";
                GATO_CON_BOTAS = "Puss in Boots";
                TRES_CERDITOS = "The 3 little pigs";
                PINOCHO = "Pinocchio";
                RICITOS = "Goldilocks";
                ERROR_LIBRO = "Book not available";
                break;
            default:
                throw new IllegalArgumentException("Idioma no disponible / Language not available");
        }
        return null;
    }
}
enum Textos{
    A,B,a,b
}

