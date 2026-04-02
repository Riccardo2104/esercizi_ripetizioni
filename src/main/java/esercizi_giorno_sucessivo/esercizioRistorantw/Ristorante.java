package esercizi_giorno_sucessivo.esercizioRistorantw;

import java.util.ArrayList;

public class Ristorante<T extends Dipedenti> {

    private Double incassogiorno;
    private ArrayList<T> dipendenti = new ArrayList<>();
    private ArrayList<Scontrino> scontrini = new ArrayList<>();
    private Double uscitegiorno;
    private Double manciagiorno;


    public Ristorante(ArrayList<T> dipendenti) {
        this.dipendenti = dipendenti;
    }



    public Ristorante(ArrayList<Scontrino> scontrini, ArrayList<T> dipendenti, Double incassogiorno) {
        this.scontrini = scontrini;
        this.dipendenti = dipendenti;
        this.incassogiorno = incassogiorno;
    }

    public Boolean pagare(Double somma, Double mancia) {

        if( somma > 0) {
            this.incassogiorno = somma + mancia;
            Scontrino scontrino = new Scontrino(somma,mancia, this.incassogiorno);
            return true;
        }
        return false;
    }
    /*

     */
//    public  Risultato chisuracassa() {
//        Double incasso = 0.0;
//        Double spese = 0.0;
//        Double stipendi = 0.0;
//
//        /*le spese sono la somma delle paghe e delle mancie*/
//        for (Scontrino scontrino :scontrini) {
//            /*mi guardo il totale  e me li sommo*/
//            incasso =  incasso + scontrino.getTotale();
//
//        }
        /*le spese sono la somma delle paghe e delle mancie
        * scorro tutti i dipendenti e mi salvo la loro paga giornaliere
        *
        * */
    /*
    *   for( T d :dipendenti) {
             if (T instanceof Chef) {

             }
        }
    *
    * */



    }




    /*
    public chiusuradicassa(); // sul file
    public quantohaguadagno giorno();
     */


