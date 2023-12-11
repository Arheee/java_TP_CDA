package exercices.tp1.exercice2;

/**@
 * Écrivez un programme qui demande à l'utilisateur de saisir un prix HT, puis qui affiche le prix TTC correspondant. Le prix TTC est calculé en ajoutant la TVA au prix HT. La TVA est de 20%.
 *
 * Contraintes 🚨
 * Votre fonction prendra en paramètre un nombre float.
 * Le prix HT saisi doit être un nombre positif.
 * Le prx TTC est un nombre positif float.
 */
public class PrixTtc {

   public static double prixToutesTaxesComprises(double prixToutesTaxesComprises) throws IllegalAccessException {
       float prixHorsTaxes = 100;
       double tauxTva = 20;

       prixToutesTaxesComprises = prixHorsTaxes + (prixHorsTaxes*tauxTva);


       verifierSiPrixHtPositif(prixHorsTaxes);

      return prixToutesTaxesComprises;
   }
    private static void verifierSiPrixHtPositif(float prixHorsTaxes) throws IllegalAccessException {
            if( prixHorsTaxes < 0 ) {
                throw new IllegalAccessException("Le prix HT saisi doit être un nombre positif.");
            }
    }


}
