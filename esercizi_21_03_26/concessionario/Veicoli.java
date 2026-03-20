import java.time.Year;

public abstract class Veicoli {
    private int prezzo_base;
    private Year anno_immatricolazione ;
    private int costo_assicurazione;
    private String tipo_veicolo;



    // voglio creare un veicolo senza usare classe padre

    public Veicoli(int prezzo_base, Year anno_immatricolazione, int costo_assicurazione) {
        this.prezzo_base = prezzo_base;
        this.anno_immatricolazione = anno_immatricolazione;
        this.costo_assicurazione = costo_assicurazione;
    }


    // metodi

    // metodo per calcolare il prezzo getter

    public int getPrezzo_base(){
        return  prezzo_base;
    }

    public Year getAnno_immatricolazione() {
        return  anno_immatricolazione;
    }


    public int getCosto_assicurazione() {
        return costo_assicurazione;
    }





}
