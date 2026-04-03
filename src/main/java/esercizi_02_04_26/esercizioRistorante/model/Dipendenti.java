package esercizi_02_04_26.esercizioRistorante.model;

public class Dipendenti {
    /*
    * ho scelto di non usare la classe astratta perchè lui ha detto o sei uno chef o un cameriere o un dipendente
    * e se istanziare oggetti con una classe astratta non ho molto senso
    *
    *
    * */
    private final Double pagafissa;
    private String nome;
    private Boolean prendeMancia = false;


    public Dipendenti(String nome, Ristorante Z) {
        Double pagadipendenti = Z.getPagafissa();
        this.nome = nome;
        this.pagafissa =pagadipendenti;
        Z.addDipendente(this);

    }

    /*voglio lasciare la paga a final dopo   che l'oggetto è stato creato
    *
    *
    *
    *
    * */


    /*praticamente io devo renderli final nella creazione del costruttore*/

    // getter and setter


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPagafissa() {
        return pagafissa;
    }

    public void setPrendeMancia(Boolean prendeMancia) {
        this.prendeMancia = prendeMancia;
    }

    @Override
    public String toString() {
        return "Dipendenti{" +
                "pagafissa=" + pagafissa +
                ", nome='" + nome + '\'' +
                ", prendeMancia=" + prendeMancia +
                '}';
    }
}
