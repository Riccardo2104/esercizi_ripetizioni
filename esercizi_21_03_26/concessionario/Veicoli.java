import java.time.Year;

public abstract class Veicoli {

    /*siccome la traccia dice esplicitamente che i veicoli hanno un anno di immatricolazione o dovuto considerare
    che abbiamo una targa
     */
    private int valore;
    private Year anno_immatricolazione;
    private String targa;
    private int costo_assicurazione;
    private String tipo;


    public Veicoli(int valore, Year anno_immatricolazione, String targa){
        this.valore = valore;
        this.anno_immatricolazione = anno_immatricolazione;
        this.targa = targa;


    }
    public Veicoli(int valore, Year anno_immatricolazione, String targa, String tipo){
        this.valore = valore;
        this.anno_immatricolazione = anno_immatricolazione;
        this.targa = targa;
        this.tipo = tipo;
    }

    // metodi

    // metodo per calcolare il prezzo getter


    public double getValore() {
        return valore;
    }

    public Year getAnno_immatricolazione() {
        return anno_immatricolazione;
    }

    public int get_eta() {
        int anno_immatricolazione_veicolo = this.getAnno_immatricolazione().getValue();
        Year anno_corrente = Year.now();
        // mi salvo un intero del anno coorente
        int anno_corrente_intero = anno_corrente.getValue();
        return anno_corrente_intero - anno_immatricolazione_veicolo;
    }
    public String getTarga() {
        return targa;
    }

    public String getTipo() {
        return tipo;
    }

    public int calcolo_costo_assicurazione() {
        int eta = this.get_eta();
        return eta*100;
    }
}
