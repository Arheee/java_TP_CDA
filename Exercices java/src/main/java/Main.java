import exercices.tp1.exercice3.Palindrome;
import exercices.tp1.exercice4.Doublon;

public class Main {

    public static void main(String[] args) throws IllegalAccessException{

            int[] monTableau = {1, 2, 3, 4, 6};
            boolean estDoublonAvecHashmap = Doublon.estDoublonAvecHashmap(monTableau);
            System.out.println("Le tableau contient des doublons : " + estDoublonAvecHashmap);

    }
}
