package esercizi_02_04_26.esercizio_contocorrente;

import java.time.LocalDate;

public interface Operazione {
    Boolean deposito(Double importo) ;

    Boolean prelevare(Double importo);

    Boolean pagare(String codiceIdentificativo, Double amount, String data);

    void stampaTransazioni();

    Transazioni filtraPerRangeDate(LocalDate startDate, LocalDate endDate);

    Transazioni filtraPerRangeCifra(int cifraPartenza, int cifraDestinazione);

}
