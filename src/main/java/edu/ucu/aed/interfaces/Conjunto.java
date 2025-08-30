package edu.ucu.aed.interfaces;

/**
 * Representa un conjunto con sus operaciones vinculadas
 */
public interface Conjunto<T extends Comparable<T>> extends Lista<T> {
    /**
     * Realiza la unión del conjunto actual con "otroConjunto".
     * Se retorna un nuevo conjunto donde los elementos no están duplicados.
     */
    Conjunto<T> union(Conjunto<T> otroConjunto);

    /**
     * Realiza la intersección del conjunto actual con "otroConjunto".
     * Se retorna un nuevo conjunto donde los elementos no están duplicados.
     */
    Conjunto<T> interseccion(Conjunto<T> otroConjunto);

    /**
     * Realiza la diferencia del conjunto actual con "otroConjunto".
     * Se retorna un nuevo conjunto donde los elementos no están duplicados.
     */
    Conjunto<T> diferencia(Conjunto<T> otroConjunto);


}
