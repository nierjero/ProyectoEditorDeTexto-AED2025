package edu.ucu.aed.interfaces;

public interface Pila<T extends Comparable<T>> extends Lista<T> {
    /**
     *
     * @return Retorna el último elemento agregado, sin removerlo.
     * Si la pila es vacía, retornar nulo
     */
    T tope();

    /**
     *
     * @return Retorna el último elemento agregado y lo remueve de la pila.
     * Si la pila es vacía, retornar nulo
     */
    T sacar();

}
