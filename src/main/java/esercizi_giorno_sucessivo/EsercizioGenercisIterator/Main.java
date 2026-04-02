package esercizi_giorno_sucessivo.EsercizioGenercisIterator;

import java.util.ArrayList;

public class Main {
    /*
    * creo un ogetto prodotto alimentare
    * creo un prodotto elettronico
    * creo un arraylist di prodotti con dentro sia elettronici che non
    *
    * creo un ogetto scatola gli passo l'arraylist di prodotti
    *
    * provo ad invocare il metodo per cancellare i difettosi per vedere se mi da il difetto
    *
    * */
    static void main(String[] args) {
        /*
        *
        ProdottoAlimentare pasta = new ProdottoAlimentare("pasta barilla", false);
        ProdottoElettronico computer = new ProdottoElettronico("Asus rog", true);
        ArrayList<Prodotto> prodtti = new ArrayList<>();
        prodtti.add(pasta);
        prodtti.add(computer);
        Scatola<Prodotto> prodotti = new Scatola<>(prodtti);
        prodotti.rimuoviDifettosi();
        prodotti.stampaProdotti();
        * */
        // test del ia
        ProdottoAlimentare arancia = new ProdottoAlimentare("arancia", false);
        ProdottoAlimentare banana = new ProdottoAlimentare("banana", false);
        ProdottoAlimentare mela = new ProdottoAlimentare("banana", true);

        ArrayList<ProdottoAlimentare> frutta = new ArrayList<>();
        Scatola<ProdottoAlimentare> prodottiAlimentariScatola = new Scatola<ProdottoAlimentare>(frutta);

        prodottiAlimentariScatola.aggiungi(arancia);
        prodottiAlimentariScatola.aggiungi(banana);
        prodottiAlimentariScatola.aggiungi(mela);

        IspettoreMagazzino.contaElementi(prodottiAlimentariScatola);

        prodottiAlimentariScatola.rimuoviDifettosi();

        IspettoreMagazzino.sigillaProdotti(prodottiAlimentariScatola);
    }

}
