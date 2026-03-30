package EsercizioGenercisIterator;

public class IspettoreMagazzino {

    public static int contaElementi(Scatola<?> scatola) {
        return scatola.getListaprodotti().size();
    }

    public static void sigillaProdotti(Scatola<? extends Prodotto> scatola) {
            for(Prodotto scatola10 : scatola.getListaprodotti())  {
                System.out.println(scatola10);
            }
    }


}
