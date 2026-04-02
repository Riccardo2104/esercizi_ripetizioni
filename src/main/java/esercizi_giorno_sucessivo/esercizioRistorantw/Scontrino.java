package esercizi_giorno_sucessivo.esercizioRistorantw;

public class Scontrino {
        private final Double importoPagare;
        private final Double mancia;
        private final Double totale;


        public Scontrino(Double importoPagare, Double mancia, Double totale) {
            this.importoPagare = importoPagare;
            this.mancia = mancia;
            this.totale = this.mancia  + this.importoPagare;
        }

        public Double getTotale() {
            return totale;
        }
}
