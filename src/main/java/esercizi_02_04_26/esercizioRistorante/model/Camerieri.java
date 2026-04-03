package esercizi_02_04_26.esercizioRistorante.model;

public class Camerieri extends Dipendenti {


    public Camerieri(String nome, Ristorante ristorante) {
        super(nome, ristorante);
        super.setPrendeMancia(true);
    }
}
