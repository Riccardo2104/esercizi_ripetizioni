package esercizi_giorno_sucessivo.esercizioRistorantw;

public class Camerieri extends  Dipedenti{
    private final int  pagafissa = 50;

    public Camerieri(String nome ) {
        super(nome);
        super.setPrendeMancia(true);

    }



}
