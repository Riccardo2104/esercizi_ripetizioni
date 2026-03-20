import java.time.Year;

public abstract class Veicoli {

    /*siccome la traccia dice esplicitamente che i veicoli hanno un anno di immatricolazione o dovuto considerare
    che abbiamo una targa
     */
    protected int valore;
    protected Year anno_immatricolazione;
    protected String targa;


    public Veicoli(int valore, Year anno_immatricolazione, String targa){
        this.valore = valore;
        this.anno_immatricolazione = anno_immatricolazione;
        this.targa = targa;
    }


    // metodi

    // metodo per calcolare il prezzo getter



}
