package esercizi_02_04_26.tracciaesame.model;



import java.time.LocalDate;
import java.util.Set;

public class Manager  extends Dipendente {
    private final String ruolo = "Manager";
    private final Integer surplus = 1500;
    private final Double moltiplicatore = 1.5;
    public Manager(String nome, String cognome, int matricola, LocalDate dataassunzione, Float ral, Set<Competenza> competenzepossedute) {
        super(nome,cognome,matricola,dataassunzione,ral,competenzepossedute);
        super.setRuolo(ruolo);

    }



    // come ottengo il



    /*se partecipa a piuù progetti ciò significa ogni dipendente avra un arraylist di progetti
    * e
    *
    * */

    @Override
    public double calcolaStipendio() {

        // come ottengo il bonus semplicemente mi prendo l'id del progetto a cui lavora mi faccio un metodo stastico che mi da il bonus del progetto passato un ip
        return super.getRal() + moltiplicatore*super.getSommaBnusprogetti() + super.calcolaAnzianita()*surplus;
    }
}
