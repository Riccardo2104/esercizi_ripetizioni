import java.time.Year;

public class Moto extends Veicoli {
    private String nome_modello;
    int tasso_deprezzamento = 5 ;
    public Moto(String nome_veicolo, int prezzo_base, Year anno_immatricolazione, int costo_assicurazione, String tipo_veicolo, String nome_modello , int tasso_deprezzamento){
        this.nome_veicolo = nome_veicolo;
        this.prezzo_base = prezzo_base;
        this.anno_immatricolazione = anno_immatricolazione;
        this.costo_assicurazione = costo_assicurazione;
        this.tipo_veicolo = tipo_veicolo;
        this.nome_modello =nome_modello;
        this.tasso_deprezzamento = tasso_deprezzamento;

    }
    @Override
    public int calcolo_anni() {
        int anno_immatricolazione_veicolo = anno_immatricolazione.getValue();
        Year anno_corrente = Year.now();
        int anno_corrente_intero = anno_corrente.getValue();
        return anno_corrente_intero - anno_immatricolazione_veicolo;

    }
    @Override
    public int getPrezzo() {
        int eta = calcolo_anni();
        int prezzo_aggiornato = 0;
        /*$Prezzo = PrezzoBase x (1 - tasso)^{eta}/*/
        for (int i = 0; i < eta; i++) {
            prezzo_aggiornato = prezzo_base - prezzo_base * tasso_deprezzamento;

        }
        return  prezzo_aggiornato;
    }
    @Override
    public int costo_assicurazione() {
        int eta = calcolo_anni();
        int risultato = 0;
        risultato = eta * 100;
        if (risultato > 1000) {
            return 1000;
        }
        return  risultato;
    }
}

