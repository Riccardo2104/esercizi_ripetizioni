package esercizi_21_03_26.concessionario;

import java.time.Year;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public  class Veicoli {

    /*siccome la traccia dice esplicitamente che i veicoli hanno un anno di immatricolazione o dovuto considerare
    che abbiamo una targa
     */
    private final int valore;
    private final LocalDate data_immatricolazione;
    private final String targa;
    private int costo_assicurazione;



    public Veicoli(int valore, String data_immatricolazione, String targa){
        this.valore = valore;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.data_immatricolazione = LocalDate.parse(data_immatricolazione, formatter);
        this.targa = targa;


    }
    public Veicoli(int valore, String data_immatricolazione, String targa, String tipo){
        this.valore = valore;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.data_immatricolazione = LocalDate.parse(data_immatricolazione, formatter);
        this.targa = targa;
    }

    // metodi

    // metodo per calcolare il prezzo getter


    public double getValore() {
        return valore;
    }

    public int getAnno_immatricolazione() {
        return this.data_immatricolazione.getYear();

    }

    public int get_eta() {
        int anno_immatricolazione = this.getAnno_immatricolazione();
        int anno_corrente = LocalDate.now().getYear();
        return anno_corrente - anno_immatricolazione;
    }
    public String getTarga() {
        return targa;
    }





    public int calcolo_costo_assicurazione() {
        int eta = this.get_eta();
        int valore = this.valore;
        int costo_assicurazione = eta * valore;

        if (costo_assicurazione > 1000) {
             return costo_assicurazione = 1000;
        }
        else {
            return costo_assicurazione;
        }

    }






    @Override
    public boolean equals (Object other){
        Veicoli o = null;
        // verfico se il riferimento del ogetto su cui viene chiamato
        if (this == other) return true;
        if (other instanceof Veicoli) {
            o = (Veicoli) other;
        }
        else {
            return false;
        }

        return this.targa.equals(o.targa);
    }


    @Override
    public String toString() {
        return "Targa: " + this.targa + "," + " data_immatricolazione:" + this.data_immatricolazione + "," +" valore " + this.valore;
    }
}
