package esercizi_02_04_26.GestioneFlotta;

import esercizi_02_04_26.GestioneFlotta.model.Monopattino;

public class Main {

    static void main(String[] args) {
       /*
        /*creo un ogettto di floatta*/
//        esercizi_giorno_sucessivo.GestioneFlotta.model.AziendaNoleggio gestioneFlotta = new AziendaNoleggio("PincoPallinosrl");
//
//        Furgone furgoneDisel1 = new Furgone("ZA123BC", "Modello-ford", 1000);
//        Monopattino monopattino = new Monopattino("MONO01", "monolux-1");
//        Monopattino monopattino2 = new Monopattino("MONO02", "monolux-1");
//
//        ArrayList<MezziTrasporto> veicoli = new ArrayList<>();
//        veicoli.add(furgoneDisel1);
//        veicoli.add(monopattino);
//        veicoli.add(monopattino2);
//        gestioneFlotta.aggiungiVeicoli(veicoli);
//
//        /*   ma il fatto che li abbia messi a mano in ricarica è un errore o devo fare un if che controllo se
//         *   l'oggetto implementasse la funzionalità?
//         *
//         *
//         *  */
//        monopattino.effetuaRicarcia(60);
//        monopattino2.effetuaRicarcia(60);
//        System.out.println(gestioneFlotta.calcolaSpesaTotaliFlotta());
//
//        System.out.println(gestioneFlotta.cercaVeicoloPerTarga("MONO02").toString());

        test1();

    }

    static void test1() {
        final Monopattino monopattino1 = new Monopattino("MONO03","monolux-1");
        System.out.println(monopattino1);
        monopattino1.setFreni(1);

        System.out.println(monopattino1);

    }

}
