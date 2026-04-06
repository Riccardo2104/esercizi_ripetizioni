package esercizi_02_04_26.esercizioRistorante.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ristorante<T extends Dipendenti> {
    /*non se renderla generica perchè se io voglio creare una lista di soli chef da aggiungere
     * */
    private Double incassogiorno;
    private List<Dipendenti> dipendenti = new ArrayList<>();
    private ArrayList<Scontrino> scontrini = new ArrayList<>();
    private List<Risultato> risultati = new ArrayList<>();
    private Double stipendigiorno;
    private Double spesegiorno;
    private Double mancegiorno;
    private String nome;
    private Double pagafissa;
    int transazionenumero = 0;


    public Ristorante(String nome, Double pagafissa) {
        this.nome = nome;
        this.pagafissa = pagafissa;
        this.incassogiorno = 0.0;
        this.stipendigiorno = 0.0;
        this.spesegiorno = 0.0;
        this.mancegiorno = 0.0;
    }

    public Ristorante(String nome, Double pagafissa, ArrayList<Dipendenti> dipendenti) {
        this.nome = nome;
        this.pagafissa = pagafissa;
        this.dipendenti = dipendenti;
        this.incassogiorno = 0.0;
        this.stipendigiorno = 0.0;
        this.spesegiorno = 0.0;

    }



    public Boolean pagare(Double somma, Double mancia) {
        if( somma > 0) {
            transazionenumero += 1;
            Scontrino scontrino = new Scontrino(somma, mancia, transazionenumero);
            scontrini.add(scontrino);
            return true;
        }
        return false;
    }
    /*chef e camerieri si divono le mancie al 50%
    *
    * come impediscono di riprintarmi lo scontrino gli passo l'oggetto risultato
    *
    * */
    public Risultato chiusuracassa() {
        /*devo avere il totale delle spese il totale dei guadagni e metterli nell oggetto risultato*/
        // riepilogo transazione
        LocalDate dataoggichiusura = LocalDate.now();
        for (Scontrino scontrinoNesimo : scontrini) {
            System.out.println(scontrinoNesimo);

        }


        for (Dipendenti dipendenteNesimo : dipendenti) {
            stipendigiorno = stipendigiorno + dipendenteNesimo.getPagafissa();
        }
        for(Scontrino scontrinoNesimo :scontrini) {

            mancegiorno  += scontrinoNesimo.getMancia();
            incassogiorno += scontrinoNesimo.getImportoPagare();
        }


        spesegiorno = mancegiorno + stipendigiorno;
        Risultato risultato = new Risultato(incassogiorno,spesegiorno, mancegiorno , dataoggichiusura);
        risultati.add(risultato);


        return  risultato;
    }

    public Risultato chiusuracassa(LocalDate dataspecificata) {
        /*devo avere il totale delle spese il totale dei guadagni e metterli nell oggetto risultato*/
        // riepilogo transazione

        for (Scontrino scontrinoNesimo : scontrini) {
            System.out.println(scontrinoNesimo);

        }


        for (Dipendenti dipendenteNesimo : dipendenti) {
            stipendigiorno = stipendigiorno + dipendenteNesimo.getPagafissa();
        }
        for(Scontrino scontrinoNesimo :scontrini) {

            mancegiorno  += scontrinoNesimo.getMancia();
            incassogiorno += scontrinoNesimo.getImportoPagare();
        }


        spesegiorno = mancegiorno + stipendigiorno;
        Risultato risultato = new Risultato(incassogiorno,spesegiorno, mancegiorno , dataspecificata);
        risultati.add(risultato);


        return  risultato;
    }



    public Boolean addDipendente(Dipendenti dipendente) {
        dipendenti.add(dipendente);
        if(dipendenti.contains(dipendente)) {
            return  true;
        }
        return false;
    }


    public Boolean addDipendenti(ArrayList<Dipendenti> dipendentesimo) {
        if (!(dipendentesimo.isEmpty())) {
            for(Dipendenti dipenteNesimo : dipendentesimo) {
                dipendenti.add(dipenteNesimo);
            }
            return true;
        }
        return false;
    }

    public Boolean pagaDipendenti(Risultato risultato) {
        // redistribuire le mance
        Integer checks = 0;
        Double mance = risultato.getMance();
        LocalDate dataoggi = LocalDate.now();
        for(Dipendenti dipendente : dipendenti) {
            if (dipendente instanceof Camerieri cameriere) {
                cameriere.settermancia(dataoggi, 0.5*risultato.getMance());
                checks += 1;
            }
            if (dipendente instanceof Chef chef) {
                chef.settermancia(dataoggi, 0.5*risultato.getMance());
                checks += 1;
            }

        }
        if (checks >= 2) {
            return true;
        }
        return false;

    }


    public List<Dipendenti> getDipendenti() {
        return dipendenti;
    }

    public void stampadipendenti() {
        for (Dipendenti dipendente :dipendenti) {
            System.out.print(dipendente);
        }
    }

    // setter and getter
    public void setPagafissa(Double pagafissa) {
        this.pagafissa = pagafissa;
    }

    public Double getPagafissa() {
        return pagafissa;
    }

}