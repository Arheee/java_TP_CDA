package exercices.tp1.exercices3;

public class Palindrome {

    public boolean estPalindrome(int nombre) throws  IllegalAccessException{
    int nombreDeBase = nombre;
    int nombreInverse = 0;

    while (nombre > 0){
        int reste = nombre % 10;
        nombreInverse = nombreInverse * 10 + reste;
        nombre = nombre / 10;
    }
    return nombreDeBase == nombreInverse;

    }

    private static void verifierSiLeNombreEstPositif(int nombre) throws IllegalAccessException{
        if(nombre < 0){
        System.out.println("Le nombre doit être supérieur à 0 stp");
        }
    }


}

