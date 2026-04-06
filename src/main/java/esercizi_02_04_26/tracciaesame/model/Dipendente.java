package esercizi_02_04_26.tracciaesame.model;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class Dipendente {
    private String ruolo;
    private String nome;
    private String cognome;
    private int matricola;
    private LocalDate dataassunzione;
    private Float ral;
    private Float stipendio;
    private Set<Competenza>  competenzepossedute;
    private long anniServizio;
    private List<Progetto> proggettiacuipartecipa;

    public Dipendente(String nome, String cognome, int matricola, LocalDate dataassunzione, Float ral, Set<Competenza> competenzepossedute) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.dataassunzione = dataassunzione;
        this.ral = ral;
        this.stipendio = ral/13;
        this.competenzepossedute = competenzepossedute;
        this.anniServizio = this.calcolaAnzianita();
        this.proggettiacuipartecipa = new ArrayList<>();
        this.ruolo = null;
    }



    public abstract double calcolaStipendio();




    public int calcolaAnzianita() {
        LocalDate oggi = Gestionale.dataoggi;
        return Math.toIntExact(anniServizio = dataassunzione.until(oggi, ChronoUnit.YEARS));
    }


    public Double getSommaBnusprogetti() {
        Double sommaBnusprogetti = 0.0;

        if(!proggettiacuipartecipa.isEmpty()) {
            for(Progetto p  :this.getProggettiacuipartecipa()) {
                sommaBnusprogetti = sommaBnusprogetti + p.getPercentualebonus();
            }
            return  sommaBnusprogetti;
        }
        return  null;
    }



    //getter and setter

    public String getNome() {
        return nome;
    }

    public Float getRal() {
        return ral;
    }

    public Set<Competenza> getCompetenzepossedute() {
        return competenzepossedute;
    }

    public List<Progetto> getProggettiacuipartecipa() {
        return proggettiacuipartecipa;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    protected  void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }


    public Boolean aggiungiaiprogettiacuipartecipa(Progetto progetto) {
        if(!proggettiacuipartecipa.contains(progetto)) {
            proggettiacuipartecipa.add(progetto);
            return  true;
        }

        return null;

    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", matricola=" + matricola +
                ", ruolo='" + ruolo + '\'' +
                '}';
    }
}
