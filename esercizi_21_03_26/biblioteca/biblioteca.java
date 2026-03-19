import java.util.ArrayList;
import java.util.Objects;

public class biblioteca {
    private String nome_biblioteca;
    private String indirizzo;
    private ArrayList<libro> inventario_libri_disponibili = new ArrayList<libro>();
    // gestire la lista di libri come una lista di stringhe non dovevi gestrilo
    private ArrayList<libro> libri_in_prestito = new ArrayList<libro>();

    // overloading


    public biblioteca(String nome_biblioteca, String indirizzo,  ArrayList<libro> inventario_libri_disponibili) {
        this.nome_biblioteca = nome_biblioteca;
        this.indirizzo = indirizzo;
        this.inventario_libri_disponibili = inventario_libri_disponibili;
    }


    public biblioteca(String nome_biblioteca, String indirizzo, ArrayList<libro> inventario_libri_disponibili, ArrayList<libro> libri_in_prestito) {
            this.nome_biblioteca = nome_biblioteca;
            this.indirizzo = indirizzo;
            this.inventario_libri_disponibili = inventario_libri_disponibili;
            this.libri_in_prestito = libri_in_prestito;

    }

        // fare i metodi
        public void stampa_libri_inventario() {
           if (inventario_libri_disponibili.isEmpty()) {
                System.out.println("Nessun libro presente nel inventario");
           }


            for (libro libro : inventario_libri_disponibili) {
                System.out.println("Nome libro disponibile: " + libro);
            }
        }




        public Boolean aggiungi_libro_inventario(libro libro) {
            boolean valore = false;
            if (!(inventario_libri_disponibili.contains(libro))){
                    valore = true;

            }
            return valore;
        }
        public Boolean aggiungi_libri_inventario(ArrayList<libro> libri) {
            // controllare se qui libri ci sono già
            Boolean valore = false;
            ArrayList<Integer> interi = new ArrayList<>();
            for (libro libro_n_esimo : libri) {
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
        for (libro libro_n_esimo : inventario_libri_disponibili) {
                if (inventario_libri_disponibili.contains(titolo)) {
                    return true;
                }
                else {
                    // provare a ottenere i like
                    for (libro libro_i_esimo: inventario_libri_disponibili) {
                        String titolo_n_esimo = libro_i_esimo.get_titolo_libro();

                        // mi prendo il titolo e devo scorrere tutto il titolo
                        for (int i = 0; i < titolo_n_esimo.length() && i <=1; i++) {
                            // devo salvarmi il primo carattere
                            char primo = titolo_n_esimo.charAt(i);
                        }


                    }
                }
                // trovare modo di ottenere tipo la like

            }
            return  false;
        }
        public Boolean cerca_libri_disponibili(ArrayList<libro> libri_da_cercare) {
            Boolean valore = false;
            ArrayList<libro> libri_trovati = new ArrayList<>();
            for (libro libri_n_esimo : libri_da_cercare) {
                if (inventario_libri_disponibili.contains(libri_n_esimo)) {
                    libri_trovati.add(libri_n_esimo);
                    valore = true;
                }
            }
            return  valore;
        }
        // consapevole che non posso avere due harry potter
        public Boolean prendi_in_prestito(libro libro) {
            Boolean valore = false;
            // semplicficare ncora
            if(!inventario_libri_disponibili.contains(libro)) {
                libri_in_prestito.add(libro);
                inventario_libri_disponibili.remove(libro);
                return true;
            }
            return  false;
        }

        public Boolean restiusci_libro(libro libro) {
            if(libri_in_prestito.contains(libro)) {
                libri_in_prestito.remove(libro);
                inventario_libri_disponibili.add(libro);
                return true;
            }
            return false;
        }


}

