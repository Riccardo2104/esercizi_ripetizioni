package EsercizioGenercisIterator;

import java.util.ArrayList;

public class Scatola<T extends Prodotto> {


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
            for(T prodottonesimo: listaprodotti) {
                if (prodottonesimo.isIsdifettoso()){
                       return listaprodotti.remove(prodottonesimo);
                }
            }
            return false;
    }


    public void stampaProdotti() {
        for(T prodottonesimo: listaprodotti ) {
            System.out.println(prodottonesimo);
        }
    }

}
