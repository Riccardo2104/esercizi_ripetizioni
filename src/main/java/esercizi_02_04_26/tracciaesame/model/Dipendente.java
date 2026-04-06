package esercizi_02_04_26.tracciaesame.model;

import esercizi_02_04_26.tracciaesame.model.*;



import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
    private Progetto progetto;
    private Integer bonusprogetto;

    public Dipendente(String nome, String cognome, int matricola, LocalDate dataassunzione, Float ral, Set<Competenza> competenzepossedute) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.dataassunzione = dataassunzione;
        this.ral = ral;
        this.stipendio = ral/13;
        this.competenzepossedute = competenzepossedute;
        this.anniServizio = this.calcolaAnzianita();
        this.progetto = null;
        this.bonusprogetto = null;
        this.ruolo = null;
    }



    public abstract Float calcolaStipendio();




    public int calcolaAnzianita() {
        LocalDate oggi = Gestionale.dataoggi;
        return Math.toIntExact(anniServizio = dataassunzione.until(oggi, ChronoUnit.YEARS));
    }




    //getter and setter

    public String getNome() {
        return nome;
    }

    public Float getRal() {
        return ral;
    }

    public Integer getBonusprogetto() {
        return bonusprogetto;
    }

    public Set<Competenza> getCompetenzepossedute() {
        return competenzepossedute;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBonusprogetto(Integer bonusprogetto) {
        this.bonusprogetto = bonusprogetto;
    }

    public void setProgetto(Progetto progetto) {
        this.progetto = progetto;
    }

    protected  void setRuolo(String ruolo) {
        this.ruolo = ruolo;
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
