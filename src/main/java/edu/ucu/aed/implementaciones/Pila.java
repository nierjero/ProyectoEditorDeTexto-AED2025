package edu.ucu.aed.implementaciones;

import edu.ucu.aed.interfaces.TDANodo;
import edu.ucu.aed.interfaces.TDAPila;

public class Pila<T extends Comparable<T>> implements TDAPila<T> {
    protected TDANodo<T> superior;

    public Pila() {
        this.superior = null;
    }

    @Override
    public T tope() {
        if (superior == null) {
            return null;
        }
        return superior.getDato();
    }

    @Override
    public T sacar() {
        if (superior == null) {
            return null;
        }
        TDANodo<T> aSacar = superior;
        superior = superior.getSiguiente();
        return aSacar.getDato();
    }

    @Override
    public boolean insertar(T data) {
        if (superior == null) {
            superior = new Nodo<>(data);
        } else {
            TDANodo<T> segundoNodo = new Nodo<>(superior.getDato());
            TDANodo<T> nuevoSuperior = new Nodo<>(data);
            nuevoSuperior.setSiguiente(segundoNodo);
            segundoNodo.setSiguiente(superior.getSiguiente());
            superior = nuevoSuperior;
        }
        return true;
    }

    @Override
    public T buscar(Comparable<T> identificador) {
        return null;
    }

    @Override
    public T eliminar(Comparable<T> identificador) {
        return null;
    }

    @Override
    public String imprimir() {
        return "";
    }

    @Override
    public String imprimir(String delimitador) {
        return "";
    }

    @Override
    public int cantElementos() {
        return 0;
    }

    @Override
    public boolean esVacia() {
        return superior == null;
    }

    @Override
    public T buscarPorIndice(int indice) {
        return null;
    }
}
