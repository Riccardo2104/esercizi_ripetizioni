package esercizi_21_03_26.concessionario;

import java.time.Year;
public class Moto extends Veicoli {
    private String nome_modello;
    int tasso_deprezzamento = 5 ;
    public Moto(int valore, String data_immatricolazione, String targa, String nome_modello){

        super(valore,data_immatricolazione,targa, nome_modello);

    }

    double valore_pre_deprezzamento = this.getValore();
    @Override
    public double getValore() {
        int eta = this.get_eta();
        int tasso = tasso_deprezzamento;

        // calcolo del valore
        for (int i = 0; i < eta; i++) {

            valore_pre_deprezzamento = valore_pre_deprezzamento - (valore_pre_deprezzamento * tasso/100);
        }
        return  valore_pre_deprezzamento;

    }

}

