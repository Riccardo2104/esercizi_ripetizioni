package esercizio_contocorrente;

import java.time.LocalDate;

public interface Operazione {
    public Boolean deposito(Double importo) ;

    public Boolean prelevare(Double importo);

    public Boolean pagare(String codiceIdentificativo, Double amount, String data);

    public void stampaTransazioni();

    public Transazioni filtraPerRangeDate(LocalDate startDate, LocalDate endDate);

    public Transazioni filtraPerRangeCifra(int cifraPartenza, int cifraDestinazione);

}
