package edu.ucu.aed;

import edu.ucu.aed.clases.Linea;
import edu.ucu.aed.utils.FileUtils;

public class Main {
    public static void main(String[] args) {

        FileUtils.leerLineas("./test.txt", x -> {
            System.out.println(x);
        });

        Linea linea = new Linea();

        String parrafo = "Hola mundo desde Java";

        linea.agregarPalabrasComoNodos(parrafo);

        System.out.println("Palabras en la línea:");
        linea.mostrarPalabras();

    }
}