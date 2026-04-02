package GestioneFlotta;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {

        /*creo un ogettto di floatta*/



        AziendaNoleggio gestioneFlotta = new AziendaNoleggio("PincoPallinosrl");


        Furgone furgoneDisel1 = new Furgone("ZA123BC","Modello-ford",100);
        Monopattino monopattino = new Monopattino("MONO01", "monolux-1");
        Monopattino monopattino2 = new Monopattino("MONO02", "monolux-1");


        ArrayList<MezziTrasporto> mezzi = new ArrayList<>();
        mezzi.add(furgoneDisel1);
        mezzi.add(monopattino);
        mezzi.add(monopattino2);

        /*
        gestioneFlotta.aggiungiVeicoli(mezzi);
        monopattino.effetuaRicarcia(60);
        monopattino2.effetuaRicarcia(60);
        System.out.println(gestioneFlotta.CalcolaSpesaTotaliFlotta());
        */





    }



}
