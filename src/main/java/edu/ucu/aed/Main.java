package edu.ucu.aed;

import edu.ucu.aed.clases.Documento;
import edu.ucu.aed.utils.FileUtils;

public class Main {
    public static void main(String[] args) {
        
        FileUtils.leerLineas("./test.txt", System.out::println);
        System.out.println();
        
        Documento Documento1 = new Documento();
        
        Documento1.cargarDesdeConsola();
        Documento1.contadoresGenericos();
        Documento1.contarLineas();
        Documento1.borrarPalabraConsola();
        Documento1.cargarDesdeConsola();
        Documento1.mostrarLineas();
        Documento1.contadoresGenericos();
        Documento1.contarLineas();
        
    }
}