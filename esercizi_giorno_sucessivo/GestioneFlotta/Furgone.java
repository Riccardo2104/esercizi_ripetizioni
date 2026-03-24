package GestioneFlotta;

public class Furgone extends MezziTrasporto {
    private final int baseCostoMensile = 100;
    private final double costoAkilometro = 0.05;
    private boolean isdisel = true;


    public Furgone(String targa, String modello,  double kilometriPercorsi, boolean isdisel) {
        super(targa, modello, kilometriPercorsi);

    }



    @Override
    public double CostoManutenzioneMensile() {
        return this.baseCostoMensile + (costoAkilometro*super.getChilometriPercorsi());
    }
}
