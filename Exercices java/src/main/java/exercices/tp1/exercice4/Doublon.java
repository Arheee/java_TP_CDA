package exercices.TP1.exercice4;

import java.util.Arrays;
import java.util.HashMap;

public class Doublon {

    /**@param tableau
     * Avec des boucles for
     * La premiere parcourt chaque element du tableau
     * La deuxieme parcourt tout les element pour comparer avec l'emement actuel
     * @return true si oui sinon false
     */
    public static boolean estDoublon(int[] tableau){
        for (int indexPrincipal = 0; indexPrincipal < tableau.length - 1 ; indexPrincipal++){
            for (int indexComparatif = indexPrincipal + 1; indexComparatif < tableau.length; indexComparatif++){
                if (tableau[indexPrincipal] == tableau[indexComparatif]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean estDoublonAvecTrie(int[] tableau){
        Arrays.sort(tableau);
        /**@Arrays.sort :
         * Trie le tableau ex : 1, 2, 2, 3, 4, 4 etc
         */

        for(int index = 1; index < tableau.length; index ++){
            if(tableau[index] == tableau[index -1]){
                return true;
            }
        }
        return false;
    }

    /**@param tableauHashmap
     * Importe d'une calsse java hashmap utilisé pour stocker des paires
     * Le hashmap créer s'appel occurences
     * Création d'une boucle pour parcourir chaque element du tableau
     * occurence.containsKey => Trouve un doublon donc retourne true
     * occurence.put => ajout de l'element au hashmap avec une occurence de 1 car par de doublon trouvé
     * @return
     */
    public static boolean estDoublonAvecHashmap(int[] tableauHashmap){
        HashMap<Integer, Integer> occurences = new HashMap<>();
        for(int nombre : tableauHashmap){
            if (occurences.containsKey(nombre) && occurences.get(nombre) >= 1){
                return true;
            }
                occurences.put(nombre, occurences.getOrDefault(nombre, 0) + 1);
        }

        return false;
    }
}
