package edu.ucu.aed.clases;

import edu.ucu.aed.implementaciones.ListaEnlazada;
import edu.ucu.aed.interfaces.TDANodo;

import java.util.ArrayList;
import java.util.Scanner;

public class Documento extends ListaEnlazada<Linea> {

    public void cargarDesdeConsola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un párrafo:\n");
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

    public int contarLineas() {
        return cantElementos();
    }

    public void contadoresGenericos() {
        int totalLineas = contarLineas();
        int totalPalabras = 0;

        TDANodo<Linea> actual = getPrimero();
        while (actual != null) {
            totalPalabras += actual.getDato().contarPalabras();
            actual = actual.getSiguiente();
        }

        System.out.println("Cantidad de líneas: " + totalLineas);
        System.out.println("Cantidad de palabras: " + totalPalabras);
    }

    public void borrarPalabraConsola() {

        //da un error si no le pasamos nada por consola
        if (esVacia()) {
            System.out.println("El documento está vacío.");
            return;
        }

        //se fija en lo que escribis
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué palabra quiere borrar?");
        String palabraABorrar = sc.nextLine().trim();

        //instancia los arrays
        ArrayList<TDANodo<Linea>> lineasCoinciden = new ArrayList<>();
        ArrayList<Integer> indicesLineas = new ArrayList<>();

        TDANodo<Linea> actualLinea = getPrimero();
        int numeroLinea = 1;

        boolean soloUnaLinea = actualLinea.getSiguiente() == null;

        //recorre la lista de lineas
        while (actualLinea != null) {
            Linea linea = actualLinea.getDato();
            boolean encontrada = false;
            TDANodo<Palabra> actualPalabra = linea.getPrimero();

            //recorre la lista de palabras y si la encuentra sale estableciendo en true
            while (actualPalabra != null) {
                if (actualPalabra.getDato().getDato().equalsIgnoreCase(palabraABorrar)) {
                    encontrada = true;
                    break;
                }
                actualPalabra = actualPalabra.getSiguiente();
            }

            //si la encuentra la agrega con el numero de la linea
            if (encontrada) {
                lineasCoinciden.add(actualLinea);
                indicesLineas.add(numeroLinea);
            }
            actualLinea = actualLinea.getSiguiente();
            numeroLinea++;
        }

        //si no hay listas con esa palabra tira el error
        if (lineasCoinciden.isEmpty()) {
            System.out.println("La palabra \"" + palabraABorrar + "\" no se encontró en el documento.");
            return;
        }

        //pregunta por consola en que linea esta la palabra que quiere borrar
        if (!soloUnaLinea) {
            System.out.println("¿En qué línea está el \"" + palabraABorrar + "\" que quiere borrar?");
        }
        for (int i = 0; i < lineasCoinciden.size(); i++) {
            if (!soloUnaLinea) {
                System.out.println((i + 1) + ". " + lineasCoinciden.get(i).getDato());
            }
        }

        //segun la opcion que hace
        int opcionLinea = 1;
        if (lineasCoinciden.size() > 1) {
            System.out.print("Elija el número de línea: ");
            opcionLinea = sc.nextInt();
            sc.nextLine();
        }

        //elige la linea y le saca 1 para que coincida con el nro del array
        Linea lineaElegida = lineasCoinciden.get(opcionLinea - 1).getDato();

        ArrayList<TDANodo<Palabra>> palabrasCoinciden = new ArrayList<>();
        ArrayList<Integer> posiciones = new ArrayList<>();
        TDANodo<Palabra> actualPalabra = lineaElegida.getPrimero();

        int posicion = 1;

        //recorre
        while (actualPalabra != null) {
            if (actualPalabra.getDato().getDato().equalsIgnoreCase(palabraABorrar)) {
                palabrasCoinciden.add(actualPalabra);
                posiciones.add(posicion);
            }
            actualPalabra = actualPalabra.getSiguiente();
            posicion++;
        }

        if (palabrasCoinciden.size() == 1) {
            lineaElegida.eliminar(palabrasCoinciden.get(0).getDato());
            System.out.println("Palabra \"" + palabraABorrar + "\" borrada automáticamente.");
        } else {
            if (soloUnaLinea) {
                System.out.println("¿En qué posición de la primera linea está el \"" + palabraABorrar + "\" que quiere borrar?");
                for (int i = 0; i < posiciones.size(); i++) {
                    System.out.println((i + 1) + ". Posición " + posiciones.get(i));
                }
            } else {
                System.out.println("¿En qué posición está el \"" + palabraABorrar + "\" que quiere borrar?");
                for (int i = 0; i < posiciones.size(); i++) {
                    System.out.println((i + 1) + ". Posición " + posiciones.get(i));
                }
            }

            System.out.print("Elija la posición: ");

            int opcionPos = sc.nextInt();
            sc.nextLine();

            TDANodo<Palabra> palabraABorrarNodo = palabrasCoinciden.get(opcionPos - 1);
            lineaElegida.eliminar(palabraABorrarNodo.getDato());

            System.out.println("Palabra \"" + palabraABorrar + "\" borrada correctamente.");
        }
    }

    @Override
    public String toString() {
        return imprimir("\n");
    }
}
