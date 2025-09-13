package edu.ucu.aed.ut02.tda.lista;

import edu.ucu.aed.implementaciones.Pila;
import edu.ucu.aed.interfaces.TDAPila;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDAPilaTest extends Assertions {

    @Test
    public void testPonerEnLaPila() {
        TDAPila<String> pila = new Pila<>();
        String string1 = "Hola";

        pila.insertar(string1);

        assert (!pila.esVacia());
    }

    @Test
    public void testSacarDeLaPila() {
        TDAPila<String> pila = new Pila<>();
        String string1 = "Hola";

        pila.insertar(string1);
        assertEquals(pila.sacar(), string1);
    }
}