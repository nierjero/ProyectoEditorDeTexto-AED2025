package edu.ucu.aed;

import edu.ucu.aed.clases.Documento;
import edu.ucu.aed.utils.FileUtils;

public class Main {
    public static void main(String[] args) {

        FileUtils.leerLineas("./test.txt", System.out::println);
        System.out.println();

        Documento doc = new Documento();
        doc.cargarDesdeConsola();

        System.out.println("\n=== Documento generado ===");
        doc.mostrarLineas();

        System.out.println("\nCantidad de líneas: " + doc.contarLineas());
    }
}