package esercizi_giorno_sucessivo.esercizio_contocorrente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class ContoCorrente  implements  Operazione  {

    private Double saldo;
    private String codiceIdentificativo;
    private String intestatario;
    private final int maxsaldo = 25;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private ArrayList<Transazioni> transazioni = new ArrayList<>();

    public ContoCorrente(Double saldo, String codiceIdentificativo, String intestatario) {
        this.saldo = saldo;
        this.codiceIdentificativo = codiceIdentificativo;
        this.intestatario = intestatario;
    }

    @Override
    public void stampaTransazioni() {
        for(Transazioni nEsimooperazione: transazioni) {
                System.out.println(nEsimooperazione);
        }

    }

    @Override
    public Boolean pagare(String codiceIdentificativo, Double amount, String data) {
        if (!(amount > (25/100*saldo))) {
           setSaldo(saldo -amount);
           Pagamenti pagamento = new Pagamenti(codiceIdentificativo,data,amount);
           transazioni.add(pagamento);
           return  true;
        }

        return false;
    }

    @Override
    public Boolean prelevare(Double importo) {
        if(saldo > 0 && saldo > importo) {
            setSaldo(saldo-importo);
            Prelievi prelievo = new Prelievi(importo);
            transazioni.add(prelievo);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deposito(Double importo) {
       if(importo >=1) {
           setSaldo(saldo+importo);
           Depositi deposito = new Depositi(importo);
           transazioni.add(deposito);
           return  true;
       }
       return false;

    }

    @Override
    public Transazioni filtraPerRangeDate(LocalDate startDate, LocalDate endDate) {
        ArrayList<Transazioni> transazioniTrovate = new ArrayList<>();
        for(Transazioni operazioneNesimo: transazioni) {
            if(operazioneNesimo.getData().isAfter(startDate) &&  operazioneNesimo.getData().isBefore(endDate)) {
                transazioniTrovate.add(operazioneNesimo);
            }
            if(!transazioniTrovate.isEmpty()) {
                return operazioneNesimo;
            }

        }
        return null;
    }

    @Override
    public Transazioni filtraPerRangeCifra(int cifraPartenza, int cifraDestinazione) {
        ArrayList<Transazioni> transazioniTrovate = new ArrayList<>();
        for(Transazioni operazioneNesimo: transazioni) {
            if(operazioneNesimo.getImporto() > (double) cifraPartenza && operazioneNesimo.getImporto() < (double) cifraDestinazione) {
                transazioniTrovate.add(operazioneNesimo);
            }
            if(!transazioniTrovate.isEmpty()) {
                return operazioneNesimo;
            }

        }
        return null;
    }
    // getter and setter
    public Double getSaldo() {
        return this.saldo;
    }

    public String getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public ArrayList<Transazioni> getOperazioni() {
        return transazioni;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setCodiceIdentificativo(String codiceIdentificativo) {
        this.codiceIdentificativo = codiceIdentificativo;
    }

    public void setIntestatario(String intestatario) {
        this.intestatario = intestatario;
    }

    public void setOperazioni(ArrayList<Transazioni> transazioni) {
        this.transazioni = transazioni;
    }
}
