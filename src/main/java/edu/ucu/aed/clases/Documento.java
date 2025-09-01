package edu.ucu.aed.clases;
import edu.ucu.aed.implementaciones.ListaEnlazada;
import edu.ucu.aed.interfaces.TDANodo;

public class Documento {

    protected final ListaEnlazada<Linea> lineas = new ListaEnlazada<>();
    protected TDANodo<Linea> primeraLinea;

    public void agregarLineasComoNodo(String lineasDeTexto) {
        int limite_lineas = 11;
        if (primeraLinea.getDato() != null && primeraLinea.getDato().contadorPalabras() != 0) {

        }
    }

    public void mostrarLineas() {
        TDANodo<Linea> actual = primeraLinea;
        while (actual != null) {
            System.out.println(actual.getDato().getRenglon());
            actual = actual.getSiguiente();
        }
    }

    public int contadorLineas() {
        TDANodo<Linea> actual = primeraLinea;
        int contador = 0;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

}