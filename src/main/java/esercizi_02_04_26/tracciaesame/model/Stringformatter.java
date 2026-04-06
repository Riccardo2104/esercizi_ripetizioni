package esercizi_02_04_26.tracciaesame.model;

public class Stringformatter<T extends Object> {

    private T oggetto;

    public  String  formattaStringa(T oggetto) {
        String stringaProgetto = oggetto.toString();

        /*scorro tutta la lista e mi un salvo in un array di in*/

        int indexGraffaStart = stringaProgetto.indexOf("{");
        int indexGraffaEnd  = stringaProgetto.indexOf("}");


        if (indexGraffaStart != -1 && indexGraffaEnd != -1) {
            return stringaProgetto.substring(indexGraffaStart +1 , indexGraffaEnd);
        }
        return null;
    }
}
