package edu.ucu.aed;

import edu.ucu.aed.clases.Documento;
import edu.ucu.aed.implementaciones.Cola;
import edu.ucu.aed.interfaces.TDACola;
import edu.ucu.aed.utils.FileUtils;

public class Main {
    public static void main(String[] args) {

        FileUtils.leerLineas("./test.txt", System.out::println);
        System.out.println();

        TDACola<String> cola = new Cola<>();

        String string1 = "Hola";
        String string2 = "Chau";

        cola.ponerEnCola(string1);
        cola.ponerEnCola(string2);

        cola.imprimir("-");


    }
}