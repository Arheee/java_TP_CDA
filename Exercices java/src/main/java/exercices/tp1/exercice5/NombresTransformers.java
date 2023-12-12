package exercices.TP1.exercice5;

import java.util.HashMap;

public  class NombresTransformers {

    public static  int calculerValeurRomain(String nombreRomain)  {
    int valeur = 0;

    if(nombreRomain.length() >15){
        throw new IllegalArgumentException("Le nombre romain ne peut pas exceder 15 caractères");
    }

    for( int index = 0; index < nombreRomain.length() ; index++){
        char symbole = nombreRomain.charAt(index);
        /**@charAt :
        méthode pour récupérer un caractère situé à une position spécifique
         */

        if (symbole == 'I'){
            valeur += 1;
        }else if(symbole == 'V'){
            valeur += 5;
        }else if(symbole == 'X'){
            valeur += 10;
        }else if(symbole == 'L'){
            valeur += 50;
        }else if(symbole =='C'){
            valeur += 100;
        }else if(symbole == 'D'){
            valeur += 500;
        }else if(symbole =='M'){
            valeur += 1000;
        }
    }
    if (nombreRomain.contains("IV") || nombreRomain.contains(("IX"))){
        valeur -= 2;
    }

    if(nombreRomain.contains("XL") || nombreRomain.contains("XC")){
        valeur -= 20;
    }

    if(nombreRomain.contains("CD") || nombreRomain.contains("CM")){
        valeur -= 200;
    }

    return valeur;
    }

    public static int avecHashMap(String nombre){
        HashMap<Character, Integer> nombreRomains = new HashMap<>();

        genererSymboleRomain(nombreRomains);

        int valeur = 0;

        for(int index = 0; index < nombre.length(); index ++){
            if (
                    index < nombre.length() - 1
                    && nombreRomains.get(nombre.charAt(index)) < nombreRomains.get(nombre.charAt(index + 1))
            ){
                valeur -= nombreRomains.get(nombre.charAt(index));
            } else {
                valeur += nombreRomains.get(nombre.charAt(index));
            }
        }
        return  valeur;
    }

    /**@genererSymboleRomain
     * Genère la liste ddes symboles romains
     */
    private static void genererSymboleRomain(HashMap<Character, Integer> nombreRomains) {
        nombreRomains.put('I', 1);
        nombreRomains.put('V', 5);
        nombreRomains.put('X', 10);
        nombreRomains.put('L', 50);
        nombreRomains.put('C', 100);
        nombreRomains.put('D', 500);
        nombreRomains.put('M', 1000);
    }
}


/**@
 Créer hashmap et equivalent en nb Romain
 Si on trouve le caractère voulu on retourne la valeur
 */
