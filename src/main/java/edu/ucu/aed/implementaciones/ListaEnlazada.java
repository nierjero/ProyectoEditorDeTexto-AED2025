package edu.ucu.aed.implementaciones;
import edu.ucu.aed.interfaces.Lista;

public class ListaEnlazada<T extends Comparable<T>> implements Lista<T> {
    private edu.ucu.aed.interfaces.Nodo<T> primero;

    @Override
    public boolean insertar(T dato) {
        edu.ucu.aed.interfaces.Nodo<T> nuevo = new edu.ucu.aed.implementaciones.Nodo<T>(dato, null);
        if (primero == null) {
            primero = nuevo;
        } else {
            edu.ucu.aed.interfaces.Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        return true;
    }

    public edu.ucu.aed.interfaces.Nodo<T> getPrimero() {
        return primero;
    }
    public  void setPrimero(edu.ucu.aed.interfaces.Nodo<T> primero) {
        this.primero = primero;
    }
    @Override
    public T buscar(Comparable<T> identificador) {
        edu.ucu.aed.interfaces.Nodo<T> actualJota=primero;
        while(actualJota!=null && identificador.compareTo(actualJota.getDato())!=0) {
            actualJota= actualJota.getSiguiente();
        }
        if (actualJota==null) {
            return null;
        }
        else {
            return actualJota.getDato();

        }
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
        return false;
    }
}
