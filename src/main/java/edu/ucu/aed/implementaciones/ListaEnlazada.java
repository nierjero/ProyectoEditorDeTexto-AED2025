package edu.ucu.aed.implementaciones;
import edu.ucu.aed.interfaces.TDALista;
import edu.ucu.aed.interfaces.TDANodo;

public class ListaEnlazada<T extends Comparable<T>> implements TDALista<T> {
    private TDANodo<T> primero;

    @Override
    public boolean insertar(T dato) {
        TDANodo<T> nuevo = new edu.ucu.aed.implementaciones.Nodo<T>(dato, null);
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
    public  void setPrimero(TDANodo<T> primero) {
        this.primero = primero;
    }
    @Override
    public T buscar(Comparable<T> identificador) {
        TDANodo<T> actualJota=primero;
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
