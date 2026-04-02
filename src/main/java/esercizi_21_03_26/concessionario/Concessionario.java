package esercizi_21_03_26.concessionario;

import java.util.ArrayList;

public class Concessionario {
private final String nome_concessionario;
private final String indirizzo;
private ArrayList<Veicoli> elenco_veicoli = new ArrayList<>();
private final ArrayList<Veicoli> veicoli_venduti = new ArrayList<>();
// overloading concessionario
public Concessionario(String nome_concessionario, String indirizzo) {
        this.nome_concessionario = nome_concessionario;
        this.indirizzo = indirizzo;

}


public Concessionario(String nome_concessionario, String indirizzo, ArrayList<Veicoli> veicoli) {
    this.nome_concessionario = nome_concessionario;
    this.indirizzo = indirizzo;
    this.elenco_veicoli = veicoli;

}

public double valore_inventario() {
        // devo moltiplicare il prezzo aggiornato*tutte le macchine che ho
    double somma_prezzi = 0;
    for (Veicoli veicolo_n_esimo : elenco_veicoli) {
        somma_prezzi = veicolo_n_esimo.getValore() + somma_prezzi;
    }
    return  somma_prezzi;
}

public Boolean aggiungi_veicolo(Veicoli veicolo) {
    elenco_veicoli.add(veicolo);
    return true;
}

public Boolean aggiungi_veicoli(ArrayList<Veicoli> veicoli) {
    elenco_veicoli.addAll(veicoli);
    return true;
}

public Boolean vendi_veicolo(Veicoli v) {

    Boolean valore = false;
    // semplicficare ncora
    if(elenco_veicoli.contains(v)) {
        veicoli_venduti.add(v);
        elenco_veicoli.remove(v);
        return true;
    }
    return  false;


}

public void stampa_inventario() {
    for(Veicoli v : this.elenco_veicoli) {
        System.out.println("Veicolo:"+ v);
    }
}




}
