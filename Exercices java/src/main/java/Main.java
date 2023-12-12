import exercices.tp1.exercice3.Palindrome;
import exercices.tp1.exercice4.Doublon;
import exercices.tp1.exercice5.NombresTransformers;

public class Main {

    public static void main(String[] args) throws IllegalAccessException{

            String nbRomain = "MCMXCII";
            int valeur = NombresTransformers.calculerValeurRomain(nbRomain);
        System.out.println(nbRomain + " est " + valeur);

    }
}
