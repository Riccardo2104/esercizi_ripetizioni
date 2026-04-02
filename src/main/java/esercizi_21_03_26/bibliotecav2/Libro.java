package esercizi_21_03_26.bibliotecav2;

import java.util.ArrayList;
import java.util.Objects;

public class Libro {
    private String titoloLibro;
    private int numeroPagine;
    private ArrayList<String> listaAutori;
    private String isbn10;
    private boolean isInPrestito;

    public Libro() {}

    public Libro(String titoloLibro, int numeroPagine, ArrayList<String> listaAutori, String isbn10,
                 boolean isInPrestito) {
        this.titoloLibro = titoloLibro;
        this.numeroPagine = numeroPagine;
        this.listaAutori = listaAutori;
        this.isbn10 = isbn10;
        this.isInPrestito = isInPrestito;
    }

    public String getTitoloLibro() {
        return titoloLibro;
    }

    public void setTitoloLibro(String titoloLibro) {
        this.titoloLibro = titoloLibro;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public ArrayList<String> getListaAutori() {
        return listaAutori;
    }

    public void setListaAutori(ArrayList<String> listaAutori) {
        this.listaAutori = listaAutori;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public boolean isInPrestito() {
        return isInPrestito;
    }

    public void setInPrestito(boolean inPrestito) {
        isInPrestito = inPrestito;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titoloLibro='" + titoloLibro + '\'' +
                ", numeroPagine=" + numeroPagine +
                ", listaAutori=" + listaAutori +
                ", isbn10='" + isbn10 + '\'' +
                ", isInPrestito=" + isInPrestito +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn10, libro.isbn10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titoloLibro, numeroPagine, listaAutori, isbn10, isInPrestito);
    }
}
