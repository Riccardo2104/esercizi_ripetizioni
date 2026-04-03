package esercizi_02_04_26.esercizio_contocorrente;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        /*
        * creo delle transazioni un deposito e
        * creo un arraylist di transazioni
        *
        * creo un oggetto conto corrente
        *
        * */
        Depositi deposito = new Depositi(232.0);
        ArrayList<Transazioni> transazioni = new ArrayList<>();

        transazioni.add(deposito);

        ContoCorrente contoCorrente = new ContoCorrente(0.0, "1234", "Riccardo");

        contoCorrente.stampaTransazioni();
        contoCorrente.deposito(232.0);
        contoCorrente.stampaTransazioni();



    }

}
