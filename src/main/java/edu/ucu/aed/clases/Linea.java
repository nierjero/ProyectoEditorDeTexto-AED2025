package edu.ucu.aed.clases;

import edu.ucu.aed.implementaciones.ListaEnlazada;

public class Linea extends ListaEnlazada<Palabra> implements Comparable<Linea> {

    public Linea(String frase) {
        String[] palabras = frase.split("\\s+");
        for (String p : palabras) {
            insertar(new Palabra(p));
        }
    }

    public int contarPalabras() {
        return cantElementos();
    }

    @Override
    public String toString() {
        return imprimir(" ");
    }

    @Override
    public int compareTo(Linea o) {
        return 0;
    }
}
