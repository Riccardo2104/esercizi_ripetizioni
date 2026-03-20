import java.util.ArrayList;

public class Main {
    public static void main() {

        // arraylist di autori
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
        libro libro_1 = new libro("La bibbia", autori_libro_1,300,"880471234X");
        libro libro_2 = new libro("I soldi del mondo", autori_libro_2, 200, "8817015432");

        // libro_da aggiungere
        libro libro_3 = new libro("Monopoly", autori_libro_3, 500, "8835936125");

        // creazione libri per aggiungi libri

        libro libro_4 = new libro("La storia dell'uomo", autori_libro_4, 250, "8806228716");
        libro libro_5 = new libro("Gli ufo e gli animali", autori_libro_5, 440, "8845298107");

        // test per duplicati aggiungi_libro  libro_6 è un altro riferimento di ogetto ma con gli stessi campi
        libro libro_6 = new libro("Gli ufo e gli animali", autori_libro_6,440, "8845298107");


        // arraylist di libri arrivati
        ArrayList<libro> libri_arrivati = new ArrayList<>();
        libri_arrivati.add(libro_1);
        libri_arrivati.add(libro_2);

        // arraylist per test aggiungi libri con libro_4 e libro_5

        ArrayList<libro> libri_4_5 = new ArrayList<>();
        libri_4_5.add(libro_4);
        libri_4_5.add(libro_5);

        // caricamento dei libri nella biblioteca
        biblioteca biblioteca_1 = new biblioteca("Mattei", "Via Padre viani 42 Rho",libri_arrivati);

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

}
