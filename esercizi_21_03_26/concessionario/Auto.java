import java.time.Year;

public class Auto extends Veicoli {
    private String nome_modello;
    int tasso_deprezzamento = 10;



    public Auto(int valore, Year anno_immatricolazione, String targa, String nome_modello) {
        super(valore,anno_immatricolazione, targa);


    }


    /*ragioniamo su come voglio impostare la cosa:
    *
    * voglio un metodo che mi dica quando valga la macchina tenendo del conto del deprazzamento e del tipo
    * voglio un metodoc che semplicmeente mi calcoli il deprezzamento da togliere
    *
    *
    * */


    // lo spostato perchè diceva che è ricorsvo
    double valore_pre_deprezzamento = super.getValore();
    @Override
    public double getValore() {
        // per veicoli non elettrici
        int eta = this.get_eta();
        String tipo = this.getTipo();
        int tasso = tasso_deprezzamento;
        // calcolo tipo elettrico
        if (tipo == "elettrico" && valore_pre_deprezzamento < 5000) {
            double sconto_ulteriore = valore_pre_deprezzamento*20/100;
            for (int i = 0; i < eta; i++) {

                valore_pre_deprezzamento = valore_pre_deprezzamento - valore_pre_deprezzamento * tasso;
            }
            return  valore_pre_deprezzamento - sconto_ulteriore;
        } else { // senza tipo elettrico
            for (int i = 0; i < eta; i++) {

                valore_pre_deprezzamento = valore_pre_deprezzamento - (valore_pre_deprezzamento * tasso/100);
            }
            return  valore_pre_deprezzamento;
        }

    }











}
