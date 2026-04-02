package esercizi_giorno_sucessivo.esercizio_contocorrente;

import java.util.Date;

public class Depositi extends Transazioni {

    public final String tipo;
    public Depositi( Double importo) {
        super(importo);
        this.tipo = "deposito";

    }

    @Override
    public String toString() {
        return super.getData().toString() + super.getImporto().toString() + super.getStato().toString() + " tipo: deposito";
    }


}
