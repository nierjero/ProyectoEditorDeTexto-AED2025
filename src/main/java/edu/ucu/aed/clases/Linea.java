package edu.ucu.aed.clases;

import edu.ucu.aed.implementaciones.ListaEnlazada;
import edu.ucu.aed.interfaces.TDANodo;

public class Linea implements Comparable<Linea> {

    protected final ListaEnlazada<Palabra> palabras = new ListaEnlazada<>();
    protected TDANodo<Palabra> primeraPalabra;

    public void agregarPalabrasComoNodos(String renglon) {
        if (renglon == null || renglon.isEmpty()) {
            return;
        }

        String[] palabrasArray = renglon.trim().split("\\s+");

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

    public int contadorPalabras() {
        TDANodo<Palabra> actual = primeraPalabra;
        int contador = 0;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    private String renglon;

    public Linea(String renglon) {
        this.renglon = renglon;
    }

    public String getRenglon() {
        return renglon;
    }

    public void setRenglon(String renglon) {
        this.renglon = renglon;
    }

    @Override
    public int compareTo(Linea o) {
        return this.renglon.compareTo(o.renglon);
    }
}
