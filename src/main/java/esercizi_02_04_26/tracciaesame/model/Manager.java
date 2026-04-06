package esercizi_02_04_26.tracciaesame.model;


import java.time.LocalDate;
import java.util.Set;

public class Manager extends Dipendente {
    private final String ruolo = "Manager";
    private final Integer surplus = 1500;
    private final Double moltiplicatore = 1.5;

    public Manager(String nome, String cognome, int matricola, LocalDate dataassunzione, Float ral, Set<Competenza> competenzepossedute) {
        super(nome, cognome, matricola, dataassunzione, ral, competenzepossedute);
        super.setRuolo(ruolo);

    }

    @Override
    public double calcolaStipendio() {
        return super.getRal() + moltiplicatore * super.getSommaBnusprogetti() + super.calcolaAnzianita() * surplus;
    }
}
