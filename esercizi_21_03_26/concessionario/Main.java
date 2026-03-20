import java.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main() {

        Year anno_immatricolazione = Year.of(2004);
        Auto auto_1 = new Auto(2000,anno_immatricolazione,"FX234TR", "Ford Fiesta");

//        System.out.println("Valore della macchina " + String.format("%.2f",auto_1.getValore()));

        Auto auto_2 = new Auto(2000,anno_immatricolazione,"GA881KP", "Pegout 308");

        // mi creo un arraylist di veicoli

       ArrayList<Veicoli> f = new ArrayList<>();
       f.add(auto_1);
       f.add(auto_2);


        Concessionario tozzi = new Concessionario("Tozzi", "Via trieste 795 Caronno", f);

        System.out.println(tozzi.valore_inventario());



    }
}
