import java.time.Year;

public abstract class Veicoli {

    /*siccome la traccia dice esplicitamente che i veicoli hanno un anno di immatricolazione o dovuto considerare
    che abbiamo una targa
     */
    private int valore;
    private Year anno_immatricolazione;
    private String targa;


    public Veicoli(int valore, Year anno_immatricolazione, String targa){
        this.valore = valore;
        this.anno_immatricolazione = anno_immatricolazione;
        this.targa = targa;
    }


    // metodi

    // metodo per calcolare il prezzo getter


    public int getValore() {
        return valore;
    }

    public Year getAnno_immatricolazione() {
        return anno_immatricolazione;
    }

    public String getTarga() {
        return targa;
    }
}
