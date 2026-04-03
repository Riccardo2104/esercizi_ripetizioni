package esercizi_02_04_26.esercizioRistorante.model;

public class Chef  extends Dipendenti {

    public Chef(String nome, Ristorante ristorante) {
        super(nome, ristorante);
        super.setPrendeMancia(true);
    }
}
