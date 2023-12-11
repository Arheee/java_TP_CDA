package exercices.tp1.exercice1;

public class CalculerMoyenne {

    public static double getMoyenne(double[] notes) throws IllegalAccessException {

        verifierSiContientTroisNotes(notes);

        verifierSiNoteCorrectes(notes);

        return calculDeLaMoyenne(notes);

    }

    private static int calculDeLaMoyenne(double[] notes) {
        int somme = 0;
        for (double note : notes){
            somme += note;
        }
        return somme / notes.length;
    }

    private static void verifierSiNoteCorrectes(double[] notes) throws IllegalAccessException {
        for(double note: notes){
            if( note < 0 || note > 20){
                throw  new IllegalAccessException("les notes doivent être comprises entre 0 et 20");
            }
        }
    }

    private static  void verifierSiContientTroisNotes(double[] notes) throws IllegalAccessException{
        if(notes.length != 3){
            throw new IllegalAccessException("il doit y avoir 3 notes");
        }
    }
}
