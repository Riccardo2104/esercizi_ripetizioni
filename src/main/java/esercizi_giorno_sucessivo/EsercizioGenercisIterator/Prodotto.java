package esercizi_giorno_sucessivo.EsercizioGenercisIterator;

public abstract class Prodotto {
    private String nome;
    private boolean isdifettoso;

    public Prodotto(String nome, boolean isdifettoso) {
        this.nome = nome;
        this.isdifettoso = isdifettoso;
    }


    @Override
    public abstract String toString();


    // getter and setter
    public String getNome() {
        return nome;
    }

    public boolean isIsdifettoso() {
        return isdifettoso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIsdifettoso(boolean isdifettoso) {
        this.isdifettoso = isdifettoso;
    }
}
