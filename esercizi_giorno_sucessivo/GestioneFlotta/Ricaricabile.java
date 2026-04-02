package GestioneFlotta;

public interface Ricaricabile {

    default void effetuaRicarcia(int minuti) {
        System.out.println("Ricarica in corso per " + minuti + " minuti");
    }
}
