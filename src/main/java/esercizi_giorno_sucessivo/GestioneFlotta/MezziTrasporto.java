package esercizi_giorno_sucessivo.GestioneFlotta;

import java.util.Objects;

public abstract class MezziTrasporto {
    private final String targa;
    private final String modello;
    private final double chilometriPercorsi;

    /*
    *
     * eccezionalmente non lo uso per il prof ma è una soluzione che ha senso
    * dice che eriditano qualcosa in più che agi ogetti non appartiene
    /*
    protected enum Alimentazione {
        Disel,
        Elettrica

    }
    */
    public MezziTrasporto(String targa, String modello) {

        if (targa.isEmpty()) {
            throw new IllegalArgumentException("Targa vuota non è possibile inserire una targa vuota");
        }
        this.targa = targa;
        this.modello = modello;
        this.chilometriPercorsi = 0.0;

    }


    public MezziTrasporto(String targa, String modello, double chilometriPercorsi) {

        if (targa.isEmpty()) {
            throw new IllegalArgumentException("Targa vuota non è possibile inserire una targa vuota");
        }
        this.targa = targa;
        this.modello = modello;
        this.chilometriPercorsi = chilometriPercorsi;

    }


    // metodi astratti

    public abstract double CostoManutenzioneMensile();


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MezziTrasporto that)) return false;
        return Objects.equals(targa, that.targa);
    }

    @Override
    public String toString() {
        return
                "targa='" + targa + '\'' +
                        ", modello='" + modello + '\'' +
                        ", chilometriPercorsi=" + chilometriPercorsi;
    }

    // getter and setter
    public String getTarga() {
        return targa;
    }

    public double getChilometriPercorsi() {
        return chilometriPercorsi;
    }

    public String getModello() {
        return modello;
    }


}
