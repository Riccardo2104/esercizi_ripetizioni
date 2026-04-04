package esercizi_02_04_26.tracciaesame.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Gestionale {


    private String nomegestionale;
    private List<Dipendente> dipendenti = new ArrayList<>();
    private List<Progetto> progetti = new ArrayList<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static LocalDate dataoggi = LocalDate.now();

    public Gestionale(String nomegestionale) {
        this.nomegestionale = nomegestionale;
    }

    public Gestionale(String nomegestionale, List<Dipendente> dipendenti, List<Progetto> progetti) {
        this.nomegestionale = nomegestionale;
        this.dipendenti = dipendenti;
        this.progetti = progetti;
    }

    public boolean aggiungiDipendente(Dipendente dipendente) {
        if (!(dipendenti.contains(dipendente))) {
           dipendenti.add(dipendente);
            return true;
        }
        return  false;
    }

    public ArrayList<Dipendente> cercaDipendentiPerSkill(Set<Competenza> competenze ) {
        ArrayList<Dipendente> dipendentitrovatiperskill= new ArrayList<Dipendente>();


        // se tra tutte le competenze presenti nei dipdente se almeno uno di quelle è contenuta nelle competenze
        for(Competenza competenza : competenze) {
            for (Dipendente dipendenteNesimo : dipendenti) {
                if(dipendenteNesimo.getCompetenzepossedute().contains(competenza)) {
                    dipendentitrovatiperskill.add(dipendenteNesimo);
                }
            }
        }
        if(!dipendentitrovatiperskill.isEmpty()) {
            return dipendentitrovatiperskill;
        }
        return null;
    }







}
