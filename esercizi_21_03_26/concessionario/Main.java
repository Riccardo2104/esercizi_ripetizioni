import java.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main() {

        Year anno_immatricolazione = Year.of(2004);
        Auto auto_1 = new Auto(2000,anno_immatricolazione,"FX234TR", "Ford Fiesta");
        System.out.println(auto_1.getValore());
        System.out.println(auto_1.get_eta());




    }
}
