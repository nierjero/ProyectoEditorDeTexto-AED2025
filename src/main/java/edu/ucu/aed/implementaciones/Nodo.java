package edu.ucu.aed.implementaciones;

public class Nodo<T extends Comparable<T>> implements edu.ucu.aed.interfaces.Nodo<T> {
    private final T Dato;
    private edu.ucu.aed.interfaces.Nodo<T> siguiente;

    public Nodo(T Dato, edu.ucu.aed.interfaces.Nodo<T> siguiente) {
            this.Dato=Dato;
            this.siguiente=siguiente;
    }

    @Override
    public edu.ucu.aed.interfaces.Nodo<T> getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(edu.ucu.aed.interfaces.Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public T getDato() {
        return Dato;
    }
}
