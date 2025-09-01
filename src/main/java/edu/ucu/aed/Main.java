package edu.ucu.aed;

import edu.ucu.aed.clases.Linea;
import edu.ucu.aed.utils.FileUtils;

public class Main {
    public static void main(String[] args) {

        FileUtils.leerLineas("./test.txt", System.out::println);
        System.out.println();

        String renglon1 = "Hola mundo desde Java";

        Linea linea = new Linea(renglon1);

        linea.agregarPalabrasComoNodos(renglon1);

        System.out.println("Palabras en la línea:");
        linea.mostrarPalabras();

    }
}