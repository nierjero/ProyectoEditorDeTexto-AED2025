package edu.ucu.aed.interfaces;

public interface TDAListaEnlazada<T extends Comparable<T>> {
    boolean insertar(T data);
    
    T buscar(Comparable<T> identificador);
    
    T eliminar(Comparable<T> identificador);
    
    String imprimir();
    
    String imprimir(String delimitador);
    
    int cantElementos();
    
    boolean esVacia();
    
    T buscarPorIndice(int indice);
    
}
