package esercizi_21_03_26.concessionario;

import java.time.Year;
import java.util.ArrayList;

 class Main {
    static void main() {
        // sistemare gestione delle date con giorno
        Year anno_immatricolazione = Year.of(2004);
        Auto auto_1 = new Auto(2000,"01-01-2003","FX234TR", "Ford Fiesta");

//        System.out.println("Valore della macchina " + String.format("%.2f",auto_1.getValore()));

        Auto auto_2 = new Auto(2000,"01-01-2003","GA881KP", "Pegout 308");

        // mi creo un arraylist di veicoli

       ArrayList<Veicoli> f = new ArrayList<>();
       f.add(auto_1);
       f.add(auto_2);


        Concessionario tozzi = new Concessionario("Tozzi", "Via trieste 795 Caronno", f);

       System.out.println(auto_1.get_eta());

//       tozzi.stampa_inventario();
       tozzi.vendi_veicolo(auto_1);
       tozzi.stampa_inventario();

      System.out.println(auto_1.calcolo_costo_assicurazione());




    }
}
