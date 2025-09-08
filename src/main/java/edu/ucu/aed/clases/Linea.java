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
    
    public void mostrarLinea() {
        System.out.println(this.toString());
    }
    
    public boolean compararPalabras(Palabra p1, Palabra p2) {
        if (p1 == null || p2 == null) {
            return false;
        }
        return p1.getDato().equalsIgnoreCase(p2.getDato());
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
