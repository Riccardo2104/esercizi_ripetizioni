package esercizi_giorno_sucessivo.SmartHome;

public class TermostatoBase extends Dispositivo {
    private double consumo;

    public TermostatoBase(String seriale) {
        super(seriale);
    }

    @Override
    public double calcoloConsumoDispositvo() {
        if (super.iseAcceso()) {
            this.setConsumo(50);
        }
        else {
            this.setConsumo(0);
        }

        return this.getConsumo();
    }


    private void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }
}
