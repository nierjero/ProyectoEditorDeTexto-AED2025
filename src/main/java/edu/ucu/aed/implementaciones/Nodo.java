package edu.ucu.aed.tda.lista.implementaciones;

import edu.ucu.aed.tda.lista.TDANodo;

public class Nodo<T extends Comparable<T>> implements TDANodo<T> {
    private T Dato;
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
