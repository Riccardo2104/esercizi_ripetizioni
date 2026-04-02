package esercizi_giorno_sucessivo.esercizioRistorantw;

public class Risultato {
    private final Double entrate;
    private final Double uscite;

    public Risultato(Double entrate, Double uscite) {
        this.entrate = entrate;
        this.uscite = uscite;
    }

    public Double getEntrate() {
        return entrate;
    }

    public Double getUscite() {
        return uscite;
    }
}
