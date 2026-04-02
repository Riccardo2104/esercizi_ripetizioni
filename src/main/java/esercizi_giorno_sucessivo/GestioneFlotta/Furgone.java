package esercizi_giorno_sucessivo.GestioneFlotta;

public class Furgone extends MezziTrasporto {
    private final int baseCostoMensile = 100;
    private final double costoAkilometro = 0.05;
    private final boolean isdisel;

    /*o mi faccio un attributo generico chiamato alimentazione e metto nelle classe astratta mi faccio un setter con una
    * stringa in cui viene indicato il tipo di alimentazione nella traccia ne ho o a disel o elettrici
    * quindi non avendo
    *
    * oppure faccio tipo alimentazione come Boolean e lo setto true false o null ma il problema è
        che alcuni ogetto non hanno un tipo di aliementazione e allora metto null però il true
        *
        * posso fare degli attributi astratti non definiti? in tutte e 3 le classi
        *
        *
        *
    *
    * */
    public Furgone(String targa, String modello) {
        this.isdisel = true;
        super(targa, modello);

    }

    public Furgone(String targa, String modello, double kilometriPercorsi) {
        this.isdisel = true;
        super(targa, modello, kilometriPercorsi);

    }


    @Override
    public double CostoManutenzioneMensile() {
        return this.baseCostoMensile + (costoAkilometro * super.getChilometriPercorsi());
    }

    @Override
    public String toString() {

        return
                "targa='" + super.getTarga() + '\'' +
                        ", modello='" + super.getModello() + '\'' +
                        ", chilometriPercorsi=" + super.getChilometriPercorsi() + '\'' +
                        ", Alimentazione=" + "Disel";
    }
}
