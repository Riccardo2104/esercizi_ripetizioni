package GestioneFlotta;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {
        /*creo un ogettto di floatta*/
        AziendaNoleggio gestioneFlotta = new AziendaNoleggio("PincoPallinosrl");

        Furgone furgoneDisel1 = new Furgone("ZA123BC", "Modello-ford", 1000);
        Monopattino monopattino = new Monopattino("MONO01", "monolux-1");
        Monopattino monopattino2 = new Monopattino("MONO02", "monolux-1");

        ArrayList<MezziTrasporto> veicoli = new ArrayList<>();
        veicoli.add(furgoneDisel1);
        veicoli.add(monopattino);
        veicoli.add(monopattino2);
        gestioneFlotta.aggiungiVeicoli(veicoli);

        /*   ma il fatto che li abbia messi a mano in ricarica è un errore o devo fare un if che controllo se
         *   l'oggetto implementasse la funzionalità?
         *
         *
         *  */
        monopattino.effetuaRicarcia(60);
        monopattino2.effetuaRicarcia(60);
        System.out.println(gestioneFlotta.calcolaSpesaTotaliFlotta());

        gestioneFlotta.cercaVeicoloPerTarga("FANTASMA");

    }


}
