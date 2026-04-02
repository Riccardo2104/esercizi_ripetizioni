package esercizi_giorno_sucessivo.esercizio_contocorrente;

import java.util.Date;

public class Pagamenti extends Transazioni {
    private final String tipo;
    private String codiceDestinatario;

    public Pagamenti(String codiceDestinatario, Double importo) {
        super(codiceDestinatario,importo);
        this.tipo = "pagamenti";
    }

    public Pagamenti(String codiceDestinatario, String data, Double importo) {
        this.codiceDestinatario = codiceDestinatario;
        super(data, importo);
        this.tipo = "pagamenti";

    }

    @Override
    public String toString() {
        return super.getData().toString() + super.getImporto().toString() + super.getStato().toString() +  " tipo: pagamenti";
    }
}
