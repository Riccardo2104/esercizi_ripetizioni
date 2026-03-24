package biblioteca;

import java.util.ArrayList;

public class Libro {
    private String titoloLibro;
    private ArrayList<String> autori = new ArrayList<>();
    private int numeroPagine;
    private String isbn10;
    private boolean inPrestito ;

    public Libro(String titoloLibro, ArrayList<String> autori, int numeroPagine, String isbn10, boolean inPrestito) {
        this.titoloLibro = titoloLibro;
        this.autori = autori;
        this.numeroPagine = numeroPagine;
        this.isbn10 = isbn10;
        this.inPrestito = inPrestito;
    }

    public Boolean add_autori(String titolo_libro, ArrayList<String> autori) {
        for (String autore : autori) {
            this.autori.add(autore);
            return true;
        }
        return null;
    }


    public String get_titolo_libro() {
            return this.titoloLibro;
    }
    public ArrayList<String> get_autori() {
            return this.autori;
    }
    public int get_numero_pagine() {
            return this.numeroPagine;
    }

    public boolean isInPrestito() {
        return inPrestito;
    }

    public void setInPrestito(Boolean inPrestito) {
        this.inPrestito = inPrestito;
    }

    @Override
    public boolean equals (Object other){
        Libro o = null;
        // verfico se il riferimento del ogetto su cui viene chiamato
        if (this == other) return true;
        if (other instanceof Libro) {
            o = (Libro) other;
        }
        else {
            return false;
        }

        return this.isbn10.equals(o.isbn10);
    }

    @Override
    public String toString() {
        return "Titolo del libro: " + titoloLibro + "," + " autore/i:" + autori + "," +" numero_pagine: " + numeroPagine;
    }

}
