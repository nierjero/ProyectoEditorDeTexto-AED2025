package edu.ucu.aed.implementaciones;

import edu.ucu.aed.interfaces.TDAListaEnlazada;
import edu.ucu.aed.interfaces.TDANodo;

public class ListaEnlazada<T extends Comparable<T>> implements TDAListaEnlazada<T> {
    private TDANodo<T> primero;

    @Override
    public boolean insertar(T dato) {
        TDANodo<T> nuevo = new Nodo<>(dato);
        if (primero == null) {
            primero = nuevo;
        } else {
            TDANodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        return true;
    }

    public TDANodo<T> getPrimero() {
        return primero;
    }

    /**
     * public  void setPrimero(TDANodo<T> primero) {
     * this.primero = primero;
     * }
     */

    @Override
    public T buscar(Comparable<T> identificador) {

        TDANodo<T> actual = primero;

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
        if (primero == null) {
            return null;
        }

        if (identificador.compareTo(primero.getDato()) == 0) {
            T borrado = primero.getDato();
            primero = primero.getSiguiente();
            return borrado;
        }

        TDANodo<T> actual = primero;

        while (actual.getSiguiente() != null &&
                identificador.compareTo(actual.getSiguiente().getDato()) != 0) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() == null) {
            return null;
        } else {
            T borrado = actual.getSiguiente().getDato();
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return borrado;
        }
    }

    @Override
    public String imprimir() {
        TDANodo<T> actual = primero;

        if (actual == null) {
            return "Lista vacía";
        }

        StringBuilder sb = new StringBuilder();

        while (actual != null) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(actual.getDato());
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }

    @Override
    public String imprimir(String delimitador) {
        TDANodo<T> actual = primero;

        if (actual == null) {
            return "Lista vacía";
        }

        StringBuilder sb = new StringBuilder();

        while (actual != null) {
            if (sb.length() > 0) sb.append(delimitador);
            sb.append(actual.getDato());
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }

    @Override
    public int cantElementos() {
        if (primero == null) {
            return 0;
        }

        TDANodo<T> actual = primero;
        int contador = 0;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    }

    @Override
    public T buscarPorIndice(int indice) {
        TDANodo<T> actual = primero;
        int contador = -1;

        while (actual != null) {
            contador++;
            if (contador == indice) {
                return actual.getDato();
            }
        }
        return null;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }
}
