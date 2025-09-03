package edu.ucu.aed.ut02.tda.lista;

import edu.ucu.aed.implementaciones.ListaEnlazada;
import edu.ucu.aed.interfaces.TDAListaEnlazada;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDAListaEnlazadaTest extends Assertions {

    @Test
    public void testBuscarPorIndice() {
        TDAListaEnlazada<String> lista1 = new ListaEnlazada<>();

        String string1 = "Hola";
        String string2 = "Chau";

        lista1.insertar(string1);
        lista1.insertar(string2);

        assertEquals(lista1.buscarPorIndice(1), "Hola");
    }

}
