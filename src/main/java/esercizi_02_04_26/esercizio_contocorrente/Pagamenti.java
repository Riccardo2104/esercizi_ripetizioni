package esercizi_02_04_26.esercizio_contocorrente;

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
        return super.getData().toString() + super.getImporto().toString() + "Stato operazione " +super.getStato().toString() +  " tipo: pagamenti";
    }
}
