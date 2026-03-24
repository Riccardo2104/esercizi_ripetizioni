package SmartHome;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TelevisoreSmart televisore1 = new TelevisoreSmart("12345678");

        TermostatoBase termostatoBase1 = new TermostatoBase("123443678");


        televisore1.accendi();
        termostatoBase1.accendi();





        ArrayList<Dispositivo> dispositivi = new ArrayList<>();


        dispositivi.add(televisore1);
        dispositivi.add(termostatoBase1);

        GestoreSmartHome gestoreCasa = new GestoreSmartHome(dispositivi);
        String stringa_vuota = "";


        try {
            gestoreCasa.salvaReportConsumi(stringa_vuota);
        } catch (IOException e) {
            System.out.print("Errore percorso vuoto di salvataggio" + e.getMessage());
        }






    }

}
