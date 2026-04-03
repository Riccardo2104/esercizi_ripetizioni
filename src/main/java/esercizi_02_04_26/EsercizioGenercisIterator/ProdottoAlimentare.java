package esercizi_02_04_26.EsercizioGenercisIterator;

public class ProdottoAlimentare extends  Prodotto {
    private  final Boolean isAlimentare;
    public ProdottoAlimentare(String nome, boolean isdifettoso) {
        this.isAlimentare = true;
        super(nome, isdifettoso);
    }

    @Override
    public String toString() {
        return super.getNome() + isAlimentare;
    }


}
