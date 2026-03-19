import java.util.ArrayList;

public class libro {
    private String titolo_libro;
    private ArrayList<String> autori = new ArrayList<>();
    private int numero_pagine;
    private String isbn_10;
    public libro(String titolo_libro, ArrayList<String> autori, int numero_pagine, String isbn_10) {
        this.titolo_libro = titolo_libro;
        this.autori = autori;
        this.numero_pagine = numero_pagine;
        this.isbn_10 = isbn_10;
    }

    public Boolean add_autori(String titolo_libro, ArrayList<String> autori) {
        for (String autore : autori) {
            this.autori.add(autore);
            return true;
        }
        return null;
    }


    public String get_titolo_libro() {
            return this.titolo_libro;
    }
    public ArrayList<String> get_autori() {
            return this.autori;
    }
    public int get_numero_pagine() {
            return this.numero_pagine;
    }


    @Override
    public boolean equals (Object other){
        libro o = null;
        // verfico se il riferimento del ogetto su cui viene chiamato
        if (this == other) return true;
        if (other instanceof libro) {
            o = (libro) other;
        }
        else {
            return false;
        }

        return this.isbn_10.equals(o.isbn_10);
    }

    @Override
    public String toString() {
        return "Titolo del libro: " + titolo_libro + "," + " autore/i:" + autori + "," +" numero_pagine: " + numero_pagine;
    }

}
