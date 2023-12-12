package exercices.tp1.exercice4;

import java.util.HashMap;

public class Doublon {

    /**@param tableau
     * Avec des boucles for
     * La premiere parcourt chaque element du tableau
     * La deuxieme parcourt tout les element pour comparer avec l'emement actuel
     * @return true si oui sinon false
     */
    public static boolean estDoublon(int[] tableau){
        for (int index = 0; index < tableau.length - 1 ; index++){
            for (int indexD = index + 1; indexD < tableau.length; indexD++){
                if (tableau[index] == tableau[indexD]){
                    return true;
                }
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
            if (occurences.containsKey(nombre)){
                return true;
            }else{
                occurences.put(nombre, 1);
            }
        }
        return false;
    }
}
