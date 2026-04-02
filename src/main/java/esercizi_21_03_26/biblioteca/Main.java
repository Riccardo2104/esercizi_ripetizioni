package esercizi_21_03_26.biblioteca;
import java.util.ArrayList;
import java.util.List;

class Main {
    static void main() {

        // arraylist di autori
        // usiamo solo test libro
       //test();
       testPrestitoLibro();

    }
    public static void test() {
        ArrayList<String> autori_libro_1 = new ArrayList<>();
        autori_libro_1.add("Gesu");
        ArrayList<String> autori_libro_2 = new ArrayList<>();
        autori_libro_2.add("Paolo");
        autori_libro_2.add("Franceca");


        ArrayList<String> autori_libro_3 = new ArrayList<>();
        autori_libro_3.add("Marco");
        autori_libro_3.add("lucia");

        // autori per test metodo aggiungi libri
        ArrayList<String> autori_libro_4 = new ArrayList<>();
        autori_libro_4.add("Carlo");
        autori_libro_4.add("Francesco");

        ArrayList<String> autori_libro_5 = new ArrayList<>();
        autori_libro_5.add("Gianni");
        autori_libro_5.add("Emma");
        // test per i duplicati
        ArrayList<String> autori_libro_6 = new ArrayList<>();
        autori_libro_6.add("Gianni");
        autori_libro_6.add("Emma");


        // creo due libri
        Libro libro_1 = new Libro("La bibbia", autori_libro_1,300,"880471234X",
                false );
        Libro libro_2 = new Libro("I soldi del mondo", autori_libro_2, 200, "8817015432",
                false);

        // libro_da aggiungere
        Libro libro_3 = new Libro("Monopoly", autori_libro_3, 500, "8835936125",
                false);

        // creazione libri per aggiungi libri

        Libro libro_4 = new Libro("La storia dell'uomo", autori_libro_4, 250, "8806228716",
                false);
        Libro libro_5 = new Libro("Gli ufo e gli animali", autori_libro_5, 440, "8845298107",
                false);

        // test per duplicati aggiungi_libro  libro_6 è un altro riferimento di ogetto ma con gli stessi campi
        Libro libro_6 = new Libro("Gli ufo e gli animali", autori_libro_6,440, "8845298107",
                false);


        // arraylist di libri arrivati
        ArrayList<Libro> libri_arrivati = new ArrayList<>();
        libri_arrivati.add(libro_1);
        libri_arrivati.add(libro_2);

        // arraylist per test aggiungi libri con libro_4 e libro_5

        ArrayList<Libro> libri_4_5 = new ArrayList<>();
        libri_4_5.add(libro_4);
        libri_4_5.add(libro_5);

        // caricamento dei libri nella biblioteca
        Biblioteca biblioteca_1 = new Biblioteca("Mattei", "Via Padre viani 42 Rho",libri_arrivati);

        // biblioteca_1.stampa_libri_inventario();


        //test metodo aggiungi_libro aggiungndo libro 3
        biblioteca_1.aggiungi_libro_inventario(libro_3);



        // richiesta stampa per vedere se compare
        //biblioteca_1.stampa_libri_inventario();

        // test metodo aggiungi_libri devi aggiungi un arraylist con dentro i libri 4 e 5
//        biblioteca_1.aggiungi_libri_inventario(libri_4_5);
        // stampa dei libri

        // test per i duplicati di aggiungi_libro
        /*mettiamo caso che io ti do un riferimento ad un altro ogetto ma con gli stessi attributi io mi aspetto che quel libro
         * non venga aggiunto*/
        // biblioteca_1.aggiungi_libro_inventario(libro_6);


        biblioteca_1.aggiungi_libri_inventario(libri_4_5);
        biblioteca_1.stampa_libri_inventario();


    }

    public static void testPrestitoLibro() {

        /*
        * { creo una biblioteca
        *
        * creare una lista di autori
        *   creare una lista di libri con quegli autori
        *   aggiungere quei libri come non in prestito
        *   scegliere un libro da cambiare a prestito true
        *
        *   invocare sulla biblioteca il metodo prendi in prestito e mettelro a true
        *   invocare il metodo stampa inventario e verificare che il libro non sia più nel inventario
        * }
         */
        Biblioteca biblioteca = new Biblioteca("Paolini", "Via rossi 23 Milano");

        ArrayList<String> autoriLibroPrimoLevi = new ArrayList<>();
        autoriLibroPrimoLevi.add("Primo Levi");

        ArrayList<Libro> libri = new ArrayList<>();
        Libro libroPrimoLevi = new Libro("Se questo è un uomo", autoriLibroPrimoLevi, 200,
                "8817015432", false );
        ArrayList<String> autoriLibroGiosueCarducci = new ArrayList<>();
        autoriLibroGiosueCarducci.add("Giosue Carducci");

        Libro libroGiosueCarducci = new Libro("Juvenilia",autoriLibroGiosueCarducci, 300,
                "880471234X",
                false);

        biblioteca.aggiungi_libro_inventario(libroPrimoLevi);
        biblioteca.aggiungi_libro_inventario(libroGiosueCarducci);
        libroGiosueCarducci.setInPrestito(true);

        biblioteca.toString();

    }
}
