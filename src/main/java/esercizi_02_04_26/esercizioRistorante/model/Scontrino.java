package esercizi_02_04_26.esercizioRistorante.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Scontrino {
    private final Double importoPagare;
    private final Double mancia;
    private final Double totale;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private LocalDate dataTransazione;
    private int numeroidentificativo;

    public Scontrino(Double importoPagare, Double mancia, int transazionenumero) {
        this.importoPagare = importoPagare;
        this.mancia = mancia;
        this.totale = this.importoPagare + this.mancia;
        this.dataTransazione = LocalDate.now();
        this.numeroidentificativo = transazionenumero;
    }

    public Double getTotale() {
        return totale;
    }


    public Double getMancia() {
        return mancia;
    }

    public Double getImportoPagare() {
        return importoPagare;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public LocalDate getDataTransazione() {
        return dataTransazione;
    }

    public int getNumeroidentificativo() {
        return numeroidentificativo;
    }

    @Override
    public String toString() {
        return "Scontrino{" +
                "dataTransazione=" + dataTransazione +
                ", importoPagare=" + importoPagare +
                ", numeroidentificativo=" + numeroidentificativo +
                '}';
    }
}
