package edu.ucu.aed.ut02.tda.lista;

import edu.ucu.aed.implementaciones.Cola;
import edu.ucu.aed.interfaces.TDACola;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TDAColaTest extends Assertions {
    
    @Test
    public void testPonerEnCola() {
        TDACola<String> cola = new Cola<>();
        String string1 = "HOLA";
        
        cola.ponerEnCola(string1);
        
        assert (!cola.esVacia());
    }
    
    @Test
    public void testQuitarDeLaCola() {
        TDACola<String> cola = new Cola<>();
        String string1 = "Hola";
        
        cola.ponerEnCola(string1);
        cola.quitarDeCola();
        
        assert (cola.esVacia());
    }
    
    @Test
    public void testMostrarFrente() {
        TDACola<String> cola = new Cola<>();
        
        String string1 = "Hola";
        String string2 = "Chau";
        
        cola.ponerEnCola(string1);
        cola.ponerEnCola(string2);
        
        assert (cola.frente().equals(string1));
    }
    
    @Test
    public void testQuitarElementoColaVacia() {
        TDACola<String> cola = new Cola<>();
        
        cola.quitarDeCola();
        
        assert (cola.esVacia());
    }
    
    @Test
    public void testBuscarEnCola() {
        TDACola<String> cola = new Cola<>();
        
        String string1 = "Hola";
        String string2 = "Chau";
        
        cola.ponerEnCola(string1);
        cola.ponerEnCola(string2);
        
        assert (cola.buscar(string2).equals(string2));
    }
    
    @Test
    public void testBuscarAlgoQueNoTengaLaCola() {
        TDACola<String> cola = new Cola<>();
        
        String string1 = "Hola";
        
        assert (cola.buscar(string1) == null);
    }
    
    @Test
    public void testImprimirElementos() {
        TDACola<String> cola = new Cola<>();
        
        String string1 = "Hola";
        String string2 = "Chau";
        
        cola.ponerEnCola(string1);
        cola.ponerEnCola(string2);
        
        assertEquals(cola.imprimir("-"), "Hola-Chau");
    }
    
}
