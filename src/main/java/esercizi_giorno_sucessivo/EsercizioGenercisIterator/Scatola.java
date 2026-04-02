package esercizi_giorno_sucessivo.EsercizioGenercisIterator;

import java.util.ArrayList;
import java.util.Iterator;


public class Scatola<T extends Prodotto> {
    public static int globalcounter = 0;

    private ArrayList<T> listaprodotti = new ArrayList<>();




    public Scatola(ArrayList<T> listaprodotti) {
        this.listaprodotti = listaprodotti;
    }

    public Boolean aggiungi(T elemento) {
        return listaprodotti.add(elemento);
    }


    public T getContenuto(int index) {
        return listaprodotti.get(index);
    }

    public ArrayList<T> getListaprodotti() {
        return listaprodotti;
    }

    // voglio accedere ad
    public Boolean rimuoviDifettosi() {
        int var = Scatola.globalcounter;
        Iterator<T> cursore = listaprodotti.iterator();

        while(cursore.hasNext()) {
            T prodottoAttuale = cursore.next();
            if (prodottoAttuale.isIsdifettoso()){
                 cursore.remove();
                  var = var +1;

            }
        }
        if (var != 0) {
            return true;
        }


        return null;
    }


    public void stampaProdotti() {
        for(T prodottonesimo: listaprodotti ) {
            System.out.println(prodottonesimo);
        }
    }

}
