package esercizi_giorno_sucessivo.esercizioRistorantw;

public abstract class Dipedenti {

    private final int pagafissa;
    private final String nome;
    private Boolean prendeMancia = false;

    public Dipedenti(String nome) {
        this.nome = nome;
        this.pagafissa = 100;
    }

    public void setPrendeMancia(Boolean prendeMancia) {
        this.prendeMancia = prendeMancia;
    }


}
