package esercizi_02_04_26.GestioneFlotta.model;

import esercizi_02_04_26.GestioneFlotta.service.Ricaricabile;

public class Monopattino extends MezziTrasporto implements Ricaricabile {
    private final int costoManutenzione = 15;
    private final boolean isEletric;
    private int freni = 0;



    public Monopattino(String targa, String modello) {
        super(targa, modello);
        this.isEletric = true;
    }


    public Monopattino(String targa, String modello, double kilometriPercorsi) {
        super(targa, modello, kilometriPercorsi);
        this.isEletric = true;
    }

    @Override
    public double CostoManutenzioneMensile() {
        return this.costoManutenzione;
    }

    @Override
    public String toString() {
        return
                "targa='" + super.getTarga() + '\'' +
                        ", modello='" + super.getModello() + '\'' +
                        ", chilometriPercorsi=" + super.getChilometriPercorsi() + '\'' +
                        ", Alimentazione=" + "Elettrica" +
                        ", Freni=" + this.freni;
    }


    public int getFreni() {
        return freni;
    }

    public void setFreni(int freni) {
        this.freni = freni;
    }
}
