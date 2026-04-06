package esercizi_02_04_26.tracciaesame.model;

import java.time.LocalDate;
import java.util.Set;

public class Sviluppatore  extends  Dipendente{
    private final String ruolo = "Sviluppatore";
    private final Integer surplus = 1000;


    public Sviluppatore(String nome, String cognome, int matricola, LocalDate dataassunzione, Float ral,
                        Set<Competenza> competenzepossedute ) {
        super(nome, cognome, matricola, dataassunzione, ral, competenzepossedute);
        super.setRuolo(ruolo);
    }

    @Override
    public double calcolaStipendio() {
        return super.getRal() + super.getBonusprogetto() + super.calcolaAnzianita()*surplus;
    }


}

