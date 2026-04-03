package esercizi_02_04_26.esercizio_contocorrente;

public class Depositi extends Transazioni {

    public final String tipo;
    public Depositi( Double importo) {
        super(importo);
        this.tipo = "deposito";

    }

    @Override
    public String toString() {
        String completato;
        if(super.getStato()) {
           completato = "completato";

        }
        return super.getData().toString() +" "+ super.getImporto().toString() + "Stato operazione: " + super.getStato() + " tipo: deposito";
    }


}
