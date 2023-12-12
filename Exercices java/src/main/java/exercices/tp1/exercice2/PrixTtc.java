package exercices.TP1.exercice2;

public class PrixTtc {

    /**
     * Taux de TVA à 20%
     */
    public static final double TAUX_TVA = 1.20;

    public static double prixToutesTaxesComprises(int prixHorsTaxes) throws IllegalAccessException {


       verifierSiPrixHtPositif(prixHorsTaxes);

      return ajouterTvaAuPrix(prixHorsTaxes);
   }
   private static double ajouterTvaAuPrix(int prixHorsTaxes){
        return prixHorsTaxes * TAUX_TVA;
   }
    private static void verifierSiPrixHtPositif(float prixHorsTaxes) throws IllegalAccessException {
            if( prixHorsTaxes < 0 ) {
                throw new IllegalAccessException("Le prix HT saisi doit être un nombre positif.");
            }
    }


}
