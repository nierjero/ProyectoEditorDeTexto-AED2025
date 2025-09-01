package edu.ucu.aed.clases;

import edu.ucu.aed.implementaciones.ListaEnlazada;
import edu.ucu.aed.interfaces.TDANodo;

import java.util.Scanner;

public class Documento extends ListaEnlazada<Linea> {

    public void cargarDesdeConsola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un párrafo:");
        String parrafo = sc.nextLine();

        String[] palabras = parrafo.split("\\s+");
        StringBuilder lineaActual = new StringBuilder();
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            lineaActual.append(palabras[i]).append(" ");
            contador++;

            if (contador == 11 || i == palabras.length - 1) {
                insertar(new Linea(lineaActual.toString().trim()));
                lineaActual.setLength(0);
                contador = 0;
            }
        }
    }

    // Muestra todas las líneas numeradas
    public void mostrarLineas() {
        if (esVacia()) {
            System.out.println("El documento está vacío.");
            return;
        }

        int numero = 1;
        TDANodo<Linea> actual = getPrimero();
        while (actual != null) {
            System.out.println("Línea " + numero + ": " + actual.getDato());
            actual = actual.getSiguiente();
            numero++;
        }
    }

    // Devuelve cuántas líneas tiene el documento
    public int contarLineas() {
        return cantElementos();
    }


    @Override
    public String toString() {
        return imprimir("\n");
    }
}
