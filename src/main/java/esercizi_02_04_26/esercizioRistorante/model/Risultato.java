package esercizi_02_04_26.esercizioRistorante.model;

public class Risultato {
    private final double entrate;
    private final Double uscite;
    private final Double mance;
    private int risultato;


    public Risultato(Double entrate, Double uscite, Double mance) {
            this.entrate = entrate;
            this.uscite = uscite;
            this.mance = mance;
            this.risultato = (int) (this.entrate - this.uscite);
    }

    public Double getEntrate() {
        return entrate;
    }

    public Double getUscite() {
        return uscite;
    }


    @Override
    public String toString() {
        return "Risultato{" +
                "entrate=" + entrate +
                ", uscite=" + uscite +
                ", mance=" + mance +
                ", risultato=" + risultato +
                '}';
    }
}
