package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nome_biblioteca;
    private String indirizzo;
    private ArrayList<Libro> inventario_libri_disponibili = new ArrayList<Libro>();

    public Biblioteca() {
    }

    public Biblioteca(String nome_biblioteca, String indirizzo) {
        this.nome_biblioteca = nome_biblioteca;
        this.indirizzo = indirizzo;
    }

    public Biblioteca(String nome_biblioteca, String indirizzo, ArrayList<Libro> inventario_libri_disponibili) {
        this.nome_biblioteca = nome_biblioteca;
        this.indirizzo = indirizzo;
        this.inventario_libri_disponibili = inventario_libri_disponibili;

    }

    // fare i metodi
    public void stampa_libri_inventario() {
        if (inventario_libri_disponibili.isEmpty()) {
            System.out.println("Nessun libro presente nel inventario");
        }
        for (Libro libro_n_esimo : inventario_libri_disponibili) {
            System.out.println("Stampa libro" + libro_n_esimo);
        }
    }

    public Boolean aggiungi_libro_inventario(Libro libro) {

        if (!(inventario_libri_disponibili.contains(libro))) {
            inventario_libri_disponibili.add(libro);
            return true;

        }
        return false;
    }

    public Boolean aggiungi_libri_inventario(ArrayList<Libro> libri) {
        // controllare se qui libri ci sono già
        Boolean valore = false;
        ArrayList<Integer> interi = new ArrayList<>();
        for (Libro libro_n_esimo : libri) {
            if (inventario_libri_disponibili.contains(libro_n_esimo)) {
                return false;
            } else {
                inventario_libri_disponibili.addAll(libri);
                valore = true;
            }
        }
        return valore;
    }

    public Boolean cerca_libro(String titolo) {
        // voglio trovare i titoli simili   Se scrivo La bibb voglio che mi stampi intendevi La bibbia?
        for (Libro libro_n_esimo : inventario_libri_disponibili) {
            if (inventario_libri_disponibili.contains(titolo)) {
                return true;
            } else {
                // provare a ottenere i like
                for (Libro libro_i_esimo : inventario_libri_disponibili) {
                    String titolo_n_esimo = libro_i_esimo.get_titolo_libro();

                    // mi prendo il titolo e devo scorrere tutto il titolo
                    for (int i = 0; i < titolo_n_esimo.length() && i <= 1; i++) {
                        // devo salvarmi il primo carattere
                        char primo = titolo_n_esimo.charAt(i);
                    }


                }
            }
            // trovare modo di ottenere tipo la like

        }
        return false;
    }

    public Boolean cerca_libri_disponibili(ArrayList<Libro> libri_da_cercare) {
        Boolean valore = false;
        ArrayList<Libro> libri_trovati = new ArrayList<>();
        for (Libro libri_n_esimo : libri_da_cercare) {
            if (inventario_libri_disponibili.contains(libri_n_esimo)) {
                libri_trovati.add(libri_n_esimo);
                valore = true;
            }
        }
        return valore;
    }

    public ArrayList<Libro> getInventario_libri_disponibili() {
        return inventario_libri_disponibili;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "inventario_libri_disponibili=" + inventario_libri_disponibili +
                '}';
    }
}

