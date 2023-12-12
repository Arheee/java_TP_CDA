package exercices.tp1.exercice5;

import java.util.HashMap;

public  class NombresTransformers {

    public static  int calculerValeurRomain(String nombreRomain)  {
    int valeur = 0;


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

}




/**@
 *
private static <Hashmap> void remplirMap(Hashmap<Character, Integer> nombresRomains){
       nombresRomains.put('I', 1);
        nombresRomains.put('V', 5);
        nombresRomains.put('X', 10);
    }
  * @param nombresRomains
 * @param <Hashmap>
 */
