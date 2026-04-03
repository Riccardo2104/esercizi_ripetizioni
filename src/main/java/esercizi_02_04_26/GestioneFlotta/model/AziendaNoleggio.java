package esercizi_02_04_26.GestioneFlotta.model;

import esercizi_02_04_26.GestioneFlotta.exception.VeicoloNonTrovatoException;

import java.util.ArrayList;
import java.util.List;

public class AziendaNoleggio {
    private final String nome;
    private List<MezziTrasporto> mezzi = new ArrayList<MezziTrasporto>();

    public AziendaNoleggio(String nome) {
        this.nome = nome;
    }

    public AziendaNoleggio(String nome, ArrayList<MezziTrasporto> mezzi) {
        this.nome = nome;
        this.mezzi = mezzi;
    }

    public double calcolaValoreInventarioVeicoli() {
        return 1.0;
    }

    public MezziTrasporto cercaVeicoloPerTarga(String targa) throws VeicoloNonTrovatoException {
        for (MezziTrasporto mezzoNesimo : mezzi) {
            if (mezzoNesimo.getTarga().equals(targa)) {
                return mezzoNesimo;
            }
        }
        throw new VeicoloNonTrovatoException("Il veicolo non esiste cambia veicolo");
    }

    public Boolean aggiungiVeicoli(ArrayList<MezziTrasporto> mezzi) {
        return this.mezzi.addAll(mezzi);
    }

    public Boolean aggiungiVeicolo(MezziTrasporto mezzo) {
        if (!(mezzi.contains(mezzo))) {
            mezzi.add(mezzo);
            return true;
        }
        return null;

    }

    public double calcolaSpesaTotaliFlotta() {
        double somma = 0;
        for (MezziTrasporto mezzoNesimo : mezzi) {
            somma += mezzoNesimo.CostoManutenzioneMensile();
        }
        return somma;
    }

    public void stampaVeicoli() {
        for (MezziTrasporto mezzoNesimo : mezzi) {
            System.out.println(mezzoNesimo);
        }
    }


}
