package edu.ucu.aed.clases;
import edu.ucu.aed.implementaciones.ListaEnlazada;

public class Linea implements Comparable<Linea>  {

    private ListaEnlazada<Palabra> palabras = new ListaEnlazada<>();


    @Override
    public int compareTo(Linea o) {
        return 0;
    }
}
