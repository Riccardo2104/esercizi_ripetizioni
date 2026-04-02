package GestioneFlotta;

import java.util.ArrayList;

public class AziendaNoleggio {
private String nome;
private ArrayList<MezziTrasporto>  mezzi= new ArrayList<MezziTrasporto>();

    public AziendaNoleggio(String nome) {
        this.nome = nome;
    }

    public AziendaNoleggio(String nome, ArrayList<MezziTrasporto> mezzi) {
        this.nome = nome;
        this.mezzi = mezzi;
    }

    public double calcolaValoreInventarioVeicoli(){
        return 1.0;
    }

    public  MezziTrasporto  cercaVeicoloPerTarga(String targa) throws  IllegalArgumentException{
        for (MezziTrasporto mezzoNesimo : mezzi) {
            if (mezzoNesimo.getTarga().equals(targa)) {
                return mezzoNesimo;
            }
        }
        throw  new IllegalArgumentException("Il veicolo non esiste cambia veicolo");
    }

    public Boolean aggiungiVeicoli(ArrayList<MezziTrasporto> mezzi) {
        if (this.mezzi.addAll(mezzi)) {
            return true;
        }
        return false;
    }

    public Boolean aggiungiVeicolo(MezziTrasporto mezzo) {
        if(!(mezzi.contains(mezzo))) {
            mezzi.add(mezzo);
            return true;
        }
        return  null;

    }

    public double calcolaSpesaTotaliFlotta() {
        double somma = 0;
        for(MezziTrasporto mezzoNesimo : mezzi) {
            if (mezzoNesimo instanceof Furgone) {
                Furgone furgone = (Furgone) mezzoNesimo;
                somma = somma + furgone.CostoManutenzioneMensile();

            }
            else if(mezzoNesimo instanceof Monopattino) {
                Monopattino monopattino0 = (Monopattino) mezzoNesimo;
                somma = somma + monopattino0.CostoManutenzioneMensile();
            }
        }
        return  somma;
    }

    public void stampaVeicoli(){
        for(MezziTrasporto mezzoNesimo : mezzi) {
            System.out.println(mezzoNesimo);
        }
    }


}
