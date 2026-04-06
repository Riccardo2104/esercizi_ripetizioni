package esercizi_02_04_26.esercizioRistorante.model;

import java.time.LocalDate;
import java.util.Hashtable;

public abstract class DipendenticonMancia extends Dipendenti {

    private Hashtable<LocalDate, Double> manceHistory = new Hashtable<>();

    public DipendenticonMancia(String nome, Ristorante ristorante) {
        super(nome, ristorante);
        super.setPrendeMancia(true);

    }

    public void settermancia(LocalDate datamancia, Double mancia) {
        manceHistory.put(datamancia,mancia);
    }


    @Override
    public Hashtable<LocalDate, Double> getGudagnogiorno(LocalDate data) {
         Hashtable<LocalDate, Double> mancetrovate = new Hashtable<>();
        for(LocalDate datedizionario :manceHistory.keySet()) {
            if(datedizionario.equals(data)) {
                mancetrovate.put(datedizionario,manceHistory.get(datedizionario));
            }
        }
        return mancetrovate;
    }
}
