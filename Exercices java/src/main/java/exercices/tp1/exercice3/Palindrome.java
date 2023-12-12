package exercices.TP1.exercice3;

public class Palindrome {

    public static boolean estPalindrome(long nombre) {

        verifierSiNombreEstDeDeuxChiffres(nombre);

        long nombreInverse = renverserNombre(nombre);
        return nombre == nombreInverse;
        /**
         * Ex : 123 est renversé en 321
         *
         **/

    }

    private static long renverserNombre(long nombre) {
        long nombreInverse = 0;
        long nombreDeBase = nombre;

        while (nombreDeBase != 0){
            long reste = nombreDeBase % 10;
            nombreInverse = nombreInverse * 10 + reste;
            nombreDeBase = nombreDeBase / 10;
        }
        return nombreInverse;
    }

    private static void verifierSiNombreEstDeDeuxChiffres(long nombre) {
        if(nombre < 9){
            throw new IllegalArgumentException("Le nombre doit contenir au moins deux chiffres ");
        }
    }


}

