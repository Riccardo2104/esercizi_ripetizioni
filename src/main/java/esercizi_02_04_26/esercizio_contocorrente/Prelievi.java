package esercizi_02_04_26.esercizio_contocorrente;

public class Prelievi extends Transazioni {
    private final String tipo;

    public Prelievi(Double importo) {
        super(importo);
        this.tipo = "prelievo";

    }

    @Override
    public String toString() {
        return super.getData().toString() + super.getImporto().toString() +"Stato operazione: " + super.getStato().toString() + this.tipo;
    }
}
