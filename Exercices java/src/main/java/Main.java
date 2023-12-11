import exercices.tp1.exercice1.CalculerMoyenne;
import exercices.tp1.exercice2.PrixTtc;
import exercices.tp1.exercices3.Palindrome;

public class Main {

    public static void main(String[] args) throws IllegalAccessException{
        int nombre = 121;
        Palindrome palindromeChecker = new Palindrome();
        if(palindromeChecker.estPalindrome(nombre)){
            System.out.println(nombre + "est un palindrome");
        }else {
            System.out.println(nombre + "n'est pas un plaindrome");
        }
    }
}
