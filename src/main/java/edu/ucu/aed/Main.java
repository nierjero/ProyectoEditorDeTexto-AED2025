package edu.ucu.aed;

import edu.ucu.aed.clases.Documento;
import edu.ucu.aed.utils.FileUtils;

public class Main {
    public static void main(String[] args) {

        FileUtils.leerLineas("./test.txt", System.out::println);
        System.out.println();

        Documento doc = new Documento();

        System.out.println("=== Cargar documento ===");
        doc.cargarDesdeConsola();

        System.out.println("\n=== Mostrar líneas ===");
        doc.mostrarLineas();

        System.out.println("\n=== Contadores genéricos ===");
        doc.contadoresGenericos();

        System.out.println("\n=== Borrar palabras ===");
        doc.borrarPalabraConsola();

        System.out.println("\n=== Documento final ===");
        doc.mostrarLineas();

        System.out.println("\n=== Contadores genéricos finales ===");
        doc.contadoresGenericos();
    }
}