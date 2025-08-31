package edu.ucu.aed.implementaciones;

import edu.ucu.aed.interfaces.TDANodo;

public class Nodo<T extends Comparable<T>> implements TDANodo<T> {

    private final T Dato;
    private TDANodo<T> siguiente;

    public Nodo(T Dato, TDANodo<T> siguiente) {
            this.Dato=Dato;
            this.siguiente=siguiente;
    }

    @Override
    public TDANodo<T> getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(TDANodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public T getDato() {
        return Dato;
    }
}
