package edu.ucu.aed.clases;

import edu.ucu.aed.implementaciones.ListaEnlazada;
import edu.ucu.aed.interfaces.TDANodo;

public class Linea {

    protected final ListaEnlazada<Palabra> palabras = new ListaEnlazada<>();
    protected TDANodo<Palabra> primeraPalabra;

    public void agregarPalabrasComoNodos(String parrafo) {
        if (parrafo == null || parrafo.isEmpty()) {
            return;
        }

        String[] palabrasArray = parrafo.trim().split("\\s+");

        for (String palabraTexto : palabrasArray) {
            Palabra nodo = new Palabra(palabraTexto);
            palabras.insertar(nodo);
        }

        primeraPalabra = palabras.getPrimero();
    }

    public void mostrarPalabras() {
        TDANodo<Palabra> actual = primeraPalabra;
        while (actual != null) {
            System.out.println(actual.getDato().getTexto());
            actual = actual.getSiguiente();
        }
    }
}
