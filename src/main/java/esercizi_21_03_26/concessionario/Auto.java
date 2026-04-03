package esercizi_21_03_26.concessionario;

public class Auto extends Veicoli {
    private String nomeModello;
    int tassoDeprezzamento = 10;
    private Boolean is_eletric;


    public Auto(int valore, String data_immatricolazione, String targa, String nomeModello) {
        super(valore, data_immatricolazione, targa);


    }

    public Boolean getIs_eletric() {
        return is_eletric;
    }


    /*ragioniamo su come voglio impostare la cosa:
     *
     * voglio un metodo che mi dica quando valga la macchina tenendo del conto del deprazzamento e del tipo
     * voglio un metodoc che semplicmeente mi calcoli il deprezzamento da togliere
     *
     *
     * */

    // mettere il tipo come boolean
    // lo spostato perchè diceva che è ricorsvo
    @Override
    public double getValore() {
        // per veicoli non elettrici
        int eta = this.get_eta();
        double valore_pre_deprezzamento = super.getValore();
        int tasso = tassoDeprezzamento;
        // calcolo tipo elettrico
        if (this.getIs_eletric() && valore_pre_deprezzamento < 5000) {
            double sconto_ulteriore = valore_pre_deprezzamento * 20 / 100;
            for (int i = 0; i < eta; i++) {

                valore_pre_deprezzamento = valore_pre_deprezzamento - valore_pre_deprezzamento * tasso / 100;
            }
            return valore_pre_deprezzamento - sconto_ulteriore;
        } else { // senza tipo elettrico
            for (int i = 0; i < eta; i++) {

                valore_pre_deprezzamento = valore_pre_deprezzamento - (valore_pre_deprezzamento * tasso / 100);
            }
            return valore_pre_deprezzamento;
        }


    }


}
