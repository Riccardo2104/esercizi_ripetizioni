package esercizi_02_04_26.esercizioRistorante;

import esercizi_02_04_26.esercizioRistorante.model.*;
import java.awt.*;
import java.time.LocalDate;

public class Main {
    static void main(String[] args) {


        Ristorante ristorante = new Ristorante("Da paolini", 100.0);
        Chef chefgianni = new Chef("Gianni", ristorante);
        Camerieri camerierepaolo = new Camerieri("Paolo", ristorante);
        Dipendenti franco = new Dipendenti("Franco", ristorante);

        ristorante.pagare(100.0, 10.0);
        ristorante.pagare(100.0, 10.0);

        Risultato risultato = ristorante.chiusuracassa();

        System.out.print(risultato);


        System.out.println(ristorante.pagaDipendenti(risultato));

        LocalDate dataoggi = LocalDate.now();
        System.out.println(franco.getGudagnogiorno(dataoggi));

        LocalDate datatransazione = LocalDate.of(2026,04,06);
        System.out.println(camerierepaolo.getGudagnogiorno(dataoggi));

        /*
        *  Pattern pattern = Pattern.compile("\\{([^}]*)\\}");
        Matcher matcher = pattern.matcher(ristorante.getDipendenti().toString());

        // matcher.find() salta in automatico la parola "Dipendenti" e si ferma solo sulle graffe!
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        *
        *
        * */





    }

}
