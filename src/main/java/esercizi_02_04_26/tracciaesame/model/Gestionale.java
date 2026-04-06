package esercizi_02_04_26.tracciaesame.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Gestionale {


    private String nomegestionale;
    private List<Dipendente> dipendenti = new ArrayList<>();
    private List<Progetto> progetti = new ArrayList<>();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static LocalDate dataoggi = LocalDate.now();

    public Gestionale(String nomegestionale) {
        this.nomegestionale = nomegestionale;
    }

    public Gestionale(String nomegestionale, List<Progetto> progetti) {
        this.progetti = progetti;
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

    public ArrayList<Dipendente> cercaDipendentiPerSkill(Set<Competenza> competenza) {
        ArrayList<Dipendente> dipendentitrovatiperskill= new ArrayList<>();
        for(Dipendente dipendentenesimo:dipendenti) {
            Set <Competenza> setCompetenzeDipendenteNesimo = dipendentenesimo.getCompetenzepossedute();
            for(Competenza competenzaDipendente : setCompetenzeDipendenteNesimo) {
                for(Competenza competenzacercata : competenza) {
                    if (competenzaDipendente.equals(competenzacercata)) {
                        dipendentitrovatiperskill.add(dipendentenesimo);
                    }
                }
            }


        }
        if(!dipendentitrovatiperskill.isEmpty()) {
            return dipendentitrovatiperskill;
        }
        return  null;

    }

    public boolean assegnaProgetto(Dipendente dipendente, Progetto progetto) {
        /*passi
        * mi salvo le competenze possedute
        * mi chiedo se il dipendente ha le competenze richiesta dal progetto tutte
        * se si  gli assegno l'id del progetto e il bonus del progetto usando i getter di progetto
        * */
        Set <Competenza> competenzeDipendentePossedute = dipendente.getCompetenzepossedute();
        if(competenzeDipendentePossedute.containsAll(progetto.getCompetenzerichieste()) && this.getProgetti().contains(progetto)) {

            Double percentualeBonusProgettoDaassegnare = progetto.getPercentualebonus();
//            dipendente.setProgetto(progetto);
//            dipendente.setBonusprogetto(progetto.getPercentualebonus());
              dipendente.aggiungiaiprogettiacuipartecipa(progetto);
            return true;

        }

        return false;

    }


    public List<Progetto> getProgetti() {
        return progetti;
    }
}
