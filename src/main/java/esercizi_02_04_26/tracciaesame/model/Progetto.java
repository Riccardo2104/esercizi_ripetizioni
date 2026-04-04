package esercizi_02_04_26.tracciaesame.model;



import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class Progetto {
    private Integer codiceIdentificato;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private Set<Competenza> competenzerichieste;
    private Float budgetallocato;
    private Integer percentualebonus;

    public Progetto(Integer codiceIdentificato, LocalDate dataInizio, LocalDate dataFine, Set<Competenza> competenzerichieste, Float budgetallocato, Integer percentualebonus) {
        this.codiceIdentificato = codiceIdentificato;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.competenzerichieste = competenzerichieste;
        this.budgetallocato = budgetallocato;
        this.percentualebonus = percentualebonus;
    }




    //getter



    public Integer getCodiceIdentificato() {
        return codiceIdentificato;
    }



    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public Set<Competenza> getCompetenzerichieste() {
        return competenzerichieste;
    }

    public Float getBudgetallocato() {
        return budgetallocato;
    }

    public Integer getPercentualebonus() {
        return percentualebonus;
    }
    //setter
    public void setCodiceIdentificato(Integer codiceIdentificato) {
        this.codiceIdentificato = codiceIdentificato;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Progetto progetto = (Progetto) o;
        return Objects.equals(codiceIdentificato, progetto.codiceIdentificato);
    }

}
