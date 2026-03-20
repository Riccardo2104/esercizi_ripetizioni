import java.util.ArrayList;

public class Concessionario {
private String nome_concessionario;
private String indirizzo;
private ArrayList<Veicoli> elenco_veicoli = new ArrayList<>();

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

public  double valore_inventario(ArrayList<Veicoli> elenco_veicoli) {
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


}
