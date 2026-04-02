package esercizi_giorno_sucessivo.EsercizioGenercisIterator;

public class ProdottoElettronico extends  Prodotto{

   private final Boolean isElettronico;

    public ProdottoElettronico(String nome, boolean isdifettoso) {
        this.isElettronico = true;
        super(nome, isdifettoso);
    }

    @Override
    public String toString() {
        return super.getNome() + isElettronico;
    }





}
