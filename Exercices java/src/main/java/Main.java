import exercices.TP1.exercice5.NombresTransformers;

public class Main {

    public static void main(String[] args) throws IllegalAccessException{

            String nbRomain = "IV";
            int valeur = NombresTransformers.calculerValeurRomain(nbRomain);
        System.out.println(nbRomain + " est " + valeur);

    }
}
