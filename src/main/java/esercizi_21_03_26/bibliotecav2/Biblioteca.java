package esercizi_21_03_26.bibliotecav2;

import java.util.ArrayList;

public class Biblioteca {
    private String nomeBiblioteca;
    private String indirizzo;
    private ArrayList<Libro> inventarioLibriDisponibili = new ArrayList<Libro>();

    public Biblioteca() {
    }

    public Biblioteca(String nomeBiblioteca, String indirzzo) {
       this.nomeBiblioteca = nomeBiblioteca;
       this.indirizzo = indirzzo;
    }

    public Biblioteca(String nomeBiblioteca, String indirizzo, ArrayList<Libro> inventarioLibriDisponibili) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.indirizzo = indirizzo;
        this.inventarioLibriDisponibili = inventarioLibriDisponibili;
    }

    public boolean aggiungiLibro(Libro libro) {
        if (!(inventarioLibriDisponibili.contains(libro))) {
            inventarioLibriDisponibili.add(libro);
            return true;
        }

        return false;
    }

    public Libro cercaLibro(String titoloLibro) {
        for(Libro libroNesimo : inventarioLibriDisponibili) {
            if (titoloLibro.equals(libroNesimo.getTitoloLibro()) && !libroNesimo.isInPrestito()) {
                return libroNesimo;
            }
        }
        return  null;
    }

    public ArrayList<Libro> cercaLibri(ArrayList<String> titoliLibri) {
        ArrayList<Libro> libriTrovati = new ArrayList<>();
        /*mi viene passata un arraylist di libri scorro e se trovo lo stesso isbn lo aggiungo un arraylist dei libri
        * trovati
        * */
        for(Libro libroNesimi: inventarioLibriDisponibili){
            if (titoliLibri.contains(libroNesimi.getTitoloLibro()) && !libroNesimi.isInPrestito()) {
                libriTrovati.add(libroNesimi);
                return libriTrovati;
            }

        }
        return null;
    }

    // non dando per scontato che il libro sia presente
    public boolean prendiInPrestito(Libro libroDaDarePrestito) {
        // controllo se il libro cè
        if (this.cercaLibro(libroDaDarePrestito.getTitoloLibro()).equals(libroDaDarePrestito)) {
            libroDaDarePrestito.setInPrestito(true);
            return  libroDaDarePrestito.isInPrestito();
        }
        return false;
    }

    public boolean restituisciLibro(Libro libroDaRestiure) {
            if(libroDaRestiure.isInPrestito()) {
                libroDaRestiure.setInPrestito(false);
                return !libroDaRestiure.isInPrestito();
            }

        return false;
    }

    //getter and setter
    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public ArrayList<Libro> getInventarioLibriDisponibili() {
        return inventarioLibriDisponibili;
    }

    // setter per comodità
    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
