package esercizi_21_03_26.bibliotecav2;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Main {

    static void main(String[] args){
            System.out.println(TestAggiungiLibro());  // true
    }
    // test generato manualmente
    public static boolean TestAggiungiLibro(){
        /* creo un autore
        creo un libro
        creando una biblioteca


        aggiungendoci un libro
      * */

        ArrayList<String> autoriLibroPrimoLevi = new ArrayList<>();
        autoriLibroPrimoLevi.add("Primo Levi");
        esercizi_21_03_26.bibliotecav2.Libro libroPrimoLevi = new Libro("Se questo è un uomo", 200,
                autoriLibroPrimoLevi,
                "8817015432", false );
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.setNomeBiblioteca("Biblioteca Mattei");
        biblioteca1.setIndirizzo("Via Gennaro 42 Milano ");
        biblioteca1.aggiungiLibro(libroPrimoLevi);

        Libro libro  = biblioteca1.cercaLibro("Se questo è un uomo");
        return  libro.equals(libroPrimoLevi);

      }

    @Test
    void aggiungiLibroTest() {
        Libro libro = new Libro();
        libro.setIsbn10("8817015432");
        Biblioteca biblioteca0 = new Biblioteca();
        biblioteca0.setNomeBiblioteca("Biblioteca Mattei");
        biblioteca0.setIndirizzo("Via Gennaro 42 Milano ");
        Assertions.assertTrue(biblioteca0.aggiungiLibro(libro));
    }


    @Test
    void cercaLibroTest() {
        // devo avere un libro in una biblioteca
        Libro libroSeQuestoUomo = new Libro();
        libroSeQuestoUomo.setTitoloLibro("Se questo è un uomo");
        libroSeQuestoUomo.setIsbn10("8817015432");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.aggiungiLibro(libroSeQuestoUomo);
        Assertions.assertNotNull(biblioteca.cercaLibro("Se questo è un uomo"));
    }

    @Test
    void cercaLibriTest() {
        Libro libroSeQuestoUomo = new Libro();
        libroSeQuestoUomo.setTitoloLibro("Se questo è un uomo");
        libroSeQuestoUomo.setIsbn10("8817015432");

        // secondo libro
        Libro libroOdiBarbare = new Libro();
        libroOdiBarbare.setTitoloLibro("Odi barbare");
        libroOdiBarbare.setIsbn10("8842559644");

        // libro che dovrebbe far fallire il test
        Libro libroIMalavoglia = new Libro();
        libroIMalavoglia.setTitoloLibro("I Malavoglia ");
        libroIMalavoglia.setIsbn10("8867582291");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.aggiungiLibro(libroSeQuestoUomo);
        biblioteca.aggiungiLibro(libroOdiBarbare);


        ArrayList<String> libriTitoli = new ArrayList<>();

        libriTitoli.add(libroSeQuestoUomo.getTitoloLibro());
        libriTitoli.add(libroOdiBarbare.getTitoloLibro());
//      libriTitoli.add(libroIMalavoglia.getTitoloLibro());


        Assertions.assertNotNull(biblioteca.cercaLibri(libriTitoli));



    }


    @Test
    void prendiInPrestitoTest() {
            // per prendere in prestito deve avere un libro che esista e che non sia in prestito
        /*   creo un ogetto libro
        *    creo un ogetto biblioteca
        *    creo un arraytlist di libri
        *    aggiungo il libro alla biblioteca
        *    lo prendo in prestito
        *     provo a riprenderlo in prestito
        * */
        Libro libroSeQuestoUomo = new Libro();
        libroSeQuestoUomo.setTitoloLibro("Se questo è un uomo");
        libroSeQuestoUomo.setIsbn10("8817015432");
        libroSeQuestoUomo.setInPrestito(false);

        Libro libroOdiBarbare = new Libro();
        libroOdiBarbare.setTitoloLibro("Odi barbare");
        libroOdiBarbare.setIsbn10("8842559644");
        libroSeQuestoUomo.setInPrestito(false);


        // creo un arraylist di libri
        ArrayList<Libro> libriNonPrestito = new ArrayList<>();
        libriNonPrestito.add(libroSeQuestoUomo);
        libriNonPrestito.add(libroOdiBarbare);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Mattei", "Via Gallani 42 Milano",
                libriNonPrestito);


        Assertions.assertTrue(biblioteca.prendiInPrestito(libroSeQuestoUomo));




    }

    @Test
    void restituisciLibroTest() {
        Libro libroSeQuestoUomo = new Libro();
        libroSeQuestoUomo.setTitoloLibro("Se questo è un uomo");
        libroSeQuestoUomo.setIsbn10("8817015432");
        libroSeQuestoUomo.setInPrestito(true);

        ArrayList<Libro> libriinPrestito = new ArrayList<>();
        libriinPrestito.add(libroSeQuestoUomo);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Mattei", "Via Gallani 42 Milano",
                libriinPrestito);

        Assertions.assertTrue(biblioteca.restituisciLibro(libroSeQuestoUomo));

    }
}
