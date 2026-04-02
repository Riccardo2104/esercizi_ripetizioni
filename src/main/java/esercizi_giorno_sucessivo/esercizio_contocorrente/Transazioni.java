package esercizi_giorno_sucessivo.esercizio_contocorrente;

import com.sun.source.tree.InstanceOfTree;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Transazioni {

    private Boolean stato;
    private LocalDate data;
    private final Double importo;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Transazioni(Double importo)  {

        this.stato = false;
        this.data = LocalDate.now();

        this.importo = importo;

    }

    public Transazioni(String dataString, Double importo)  {
        this.stato = false;
        this.data = LocalDate.parse(dataString,formatter);
        this.importo = importo;

    }

    @Override
    public abstract String toString();

    //getter and setter
    public Boolean getStato() {
        return stato;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getImporto() {
        return importo;
    }

    public void setStato(Boolean stato) {
        this.stato = stato;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
