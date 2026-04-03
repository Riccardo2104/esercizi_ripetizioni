package esercizi_02_04_26.GestioneFlotta.service;

public interface Ricaricabile {

    default void effetuaRicarcia(int minuti) {
        System.out.println("Ricarica in corso per " + minuti + " minuti");
    }
}
