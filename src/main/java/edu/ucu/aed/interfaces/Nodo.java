package edu.ucu.aed.interfaces;

/**
 * Representa el nodo utilizado para implementar listas enlazadas
 */
public interface Nodo<T extends Comparable<T>> {
    Nodo<T> getSiguiente();

    void setSiguiente(Nodo<T> siguiente);

    T getDato();
}
