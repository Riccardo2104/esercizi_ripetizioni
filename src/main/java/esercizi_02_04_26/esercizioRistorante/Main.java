package esercizi_02_04_26.esercizioRistorante;

import esercizi_02_04_26.esercizioRistorante.model.Camerieri;
import esercizi_02_04_26.esercizioRistorante.model.Chef;
import esercizi_02_04_26.esercizioRistorante.model.Dipendenti;
import esercizi_02_04_26.esercizioRistorante.model.Ristorante;
import esercizi_21_03_26.biblioteca.Libro;

import java.awt.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main(String[] args) {


        Ristorante ristorante = new Ristorante("Da paolini", 100.0);
        Chef chefgianni = new Chef("Gianni", ristorante);
        Camerieri camerierepaolo = new Camerieri("Paolo", ristorante);
        Dipendenti franco = new Dipendenti("Franco", ristorante);

        ristorante.pagare(100.0, 10.0);
        ristorante.pagare(100.0, 10.0);

        System.out.print(ristorante.chiusuracassa());
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
