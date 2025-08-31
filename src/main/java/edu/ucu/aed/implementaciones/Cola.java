package edu.ucu.aed.implementaciones;

import edu.ucu.aed.interfaces.TDACola;
import edu.ucu.aed.interfaces.TDANodo;

public class Cola<T extends Comparable<T>> implements TDACola<T> {
    private TDANodo<T> inicio;
    private TDANodo<T> fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }
    @Override
    public T frente() {
        if (inicio == null) {
            return null;
        }
        return inicio.getDato();
    }

    @Override
    public T quitarDeCola() {
        if (inicio == null) {
            return null;
        }
        T dato = inicio.getDato();
        inicio = inicio.getSiguiente();
        if (inicio == null) {
            fin = null;
        }
        return dato;
    }

    @Override
    public boolean ponerEnCola(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
            return true;
        }
        fin.setSiguiente(nuevo);
        fin = nuevo;
        return true;
    }

    @Override
    public boolean insertar(T data) {
        return false;
    }

    @Override
    public T buscar(Comparable<T> identificador) {
        TDANodo<T> actual = inicio;

        while (actual != null && identificador.compareTo(actual.getDato()) != 0) {
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            return null;
        } else {
            return actual.getDato();
        }
    }

    @Override
    public T eliminar(Comparable<T> identificador) {
        return null;
    }

    @Override
    public String imprimir() {
        return imprimir(" ");
    }

    @Override
    public String imprimir(String delimitador) {
        TDANodo<T> actual = inicio;

        if (actual == null) {
            return "Lista vacía";
        }

        StringBuilder sb = new StringBuilder();

        while (actual != null) {
            if (sb.length() > 0) sb.append(delimitador);
            sb.append(actual.getDato());
            actual = actual.getSiguiente();
        }
        return sb.toString();    }

    @Override
    public int cantElementos() {
        TDANodo<T> nodo = inicio;
        int contador = 0;

        while (nodo != null) {
            contador++;
            nodo = nodo.getSiguiente();
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return inicio == null;
    }
}
