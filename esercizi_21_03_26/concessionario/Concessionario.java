import java.util.ArrayList;

public class Concessionario {
private String nome_concessionario;
private String indirizzo;
private ArrayList<Veicoli> elenco_veicoli = new ArrayList<>();
public Concessionario(String nome_concessionario, String indirizzo, ArrayList<Veicoli> veicoli) {
    this.nome_concessionario = nome_concessionario;
    this.indirizzo = indirizzo;
    this.elenco_veicoli = veicoli;

}

public  int valore_inventario(ArrayList<Veicoli> elenco_veicoli) {
        // devo moltiplicare il prezzo aggiornato*tutte le macchine che ho
    int somma_prezzi = 0;
    for (Veicoli veicolo_n_esimo : elenco_veicoli) {
        somma_prezzi = veicolo_n_esimo.prezzo_base + somma_prezzi;
    }
    return  somma_prezzi;
}

public Boolean aggiungi_veicolo(Veicoli veicolo) {
    elenco_veicoli.add(veicolo);
    return true;
}


}
