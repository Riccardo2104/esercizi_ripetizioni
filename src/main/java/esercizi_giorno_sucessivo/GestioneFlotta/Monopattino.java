package esercizi_giorno_sucessivo.GestioneFlotta;

public class Monopattino extends MezziTrasporto implements Ricaricabile {
    private final int costoManutenzione = 15;
    private final boolean isEletric;

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
                        ", Alimentazione=" + "Elettrica";
    }
}
