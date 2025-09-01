package edu.ucu.aed.clases;

import edu.ucu.aed.implementaciones.Nodo;

public class Palabra extends Nodo<String> implements Comparable<Palabra> {
    public Palabra(String texto) {
        super(texto);
    }

    @Override
    public String toString() {
        return getDato();
    }

    @Override
    public int compareTo(Palabra o) {
        return 0;
    }
}
