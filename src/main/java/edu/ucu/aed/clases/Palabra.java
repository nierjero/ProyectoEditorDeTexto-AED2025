package edu.ucu.aed.clases;

public class Palabra implements Comparable<Palabra> {

    private String texto;

    public Palabra(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int compareTo(Palabra o) {
        return this.texto.compareTo(o.texto);
    }
}
