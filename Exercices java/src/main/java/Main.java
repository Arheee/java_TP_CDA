import exercices.tp1.exercice1.CalculerMoyenne;
import exercices.tp1.exercice2.PrixTtc;

public class Main {

    public static void main(String[] args) throws IllegalAccessException{
        float prixHorsTaxes = 100;
        double tauxTva = 0.20;

        double prixToutesTaxesComprises = prixHorsTaxes + (prixHorsTaxes*tauxTva);
        System.out.println("le prix TTC est " + prixToutesTaxesComprises);
    }
}
