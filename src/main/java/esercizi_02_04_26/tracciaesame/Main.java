package esercizi_02_04_26.tracciaesame;
import esercizi_02_04_26.tracciaesame.model.*;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        /*testing del bonus
            mi creo un insieme di comeptenze
            mi creo un progetto con un quel insieme di competenze

            mi creo una competenza
            la aggiungo ad un set di competenze da passare ad un dipedente
            assegno a quel dipendente quel progetto perchè ad una di quelle di competenze
            verifica che il bonus di quel progetto venga calcolato nello stipendio

        * la aggiungo ad un set di competenze di u
        * */

        LocalDate dataassunzione = LocalDate.of(1998, 5, 14);;
        Competenza competenzaprogetto1n1 = new Competenza("Programmazione",789);
        Competenza competenzaprogetto1n2 = new Competenza("Progettazione impianti", 112);
        Competenza competenzaprogetto1n3 = new Competenza("Contabilità", 456);



        Set<Competenza> competenzeprogetto = new HashSet<>();
        competenzeprogetto.add(competenzaprogetto1n1);
        competenzeprogetto.add(competenzaprogetto1n2);
        competenzeprogetto.add(competenzaprogetto1n3);
        LocalDate datainizioprogetto = LocalDate.of(2026,02,01);
        LocalDate datafineprogetto = LocalDate.of(2026,04,01);
//
        Progetto progetto = new Progetto(113,datainizioprogetto,datafineprogetto,competenzeprogetto,
                2000f,10.0);
        Progetto progetto2 = new Progetto(115,datainizioprogetto,datafineprogetto,competenzeprogetto,
                4000f,20.0);
//        Competenza competenza1 = new Competenza("Contabilità",456);
//
//        Set<Competenza> competenzemario = new HashSet<>();
//        competenzemario.add(competenza1);
//
//        Manager mario = new Manager("Manager", "Mario", "Rossi", 123, dataassunzione, 23000f,  competenzemario,
//        progetto);
//
//        ArrayList<Dipendente> dipendenti = new ArrayList<>();
//        ArrayList<Progetto>  progetti = new ArrayList<>();
//
//
//
//        Gestionale gestionale = new Gestionale("Olivetti",dipendenti, progetti);

        // testing metodo aggiungi dipendenti
        /*creo un dipendente  e provo ad aggiungerlo*/
        Competenza competenza1 = new Competenza("Contabilità",456);




        Set<Competenza> competenzemario = new HashSet<>();
        competenzemario.add(competenza1);

        Manager mario = new Manager("Mario", "Rossi", 123, dataassunzione, 2300f,
                competenzemario);

        List<Progetto> progettidefault = new ArrayList<>();
        progettidefault.add(progetto);
        progettidefault.add(progetto2);
        Gestionale gestionale = new Gestionale("Olivetti", progettidefault);
        gestionale.aggiungiDipendente(mario);


//        System.out.print(gestionale.cercaDipendentiPerSkill(competenzeprogetto));
//        gestionale.assegnaProgetto(mario,progetto);


         Stringformatter stringformatter = new Stringformatter();


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Riccardo\\Documents\\ITS" +
                "\\Basi di programmazione in Java e strumenti per lo sviluppo\\esercizi_autodidatta" +
                "\\esercizi_ripetizioni" +
                "\\src\\main\\java\\esercizi_02_04_26\\tracciaesame\\model\\output.txt"))) {
            for(Progetto progettonesimo: gestionale.getProgetti()) {
                writer.write(stringformatter.formattaStringa(progettonesimo) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Set<Competenza> competenzesviluppatore = new HashSet<>();
        competenzesviluppatore.add(competenzaprogetto1n1);


        LocalDate dataAssunzioneSviluppatore = LocalDate.of(2002,05,01);
        Sviluppatore sviluppatore = new Sviluppatore("Paolo", "Franchini",999,
                dataAssunzioneSviluppatore,23000f,competenzeprogetto);

        gestionale.assegnaProgetto(sviluppatore,progetto);
        gestionale.assegnaProgetto(sviluppatore,progetto2);
//        System.out.print(sviluppatore.getProggettiacuipartecipa());
        System.out.print(mario.getProggettiacuipartecipa());

    }




}
