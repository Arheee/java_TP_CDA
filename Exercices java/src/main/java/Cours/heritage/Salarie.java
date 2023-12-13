package Cours.heritage;

import java.time.LocalDate;

public class Salarie extends Collaborateur {
    public static final int HEURE_TRAVAILLEES_MENSUELLES_NORMALES = 151;
    private double tauxHoraireBrut;


    /**@
     * Ici la classe Salarie hérite de Personne , donc on n'oublie pas le super dans le constructeur
     * @param nom
     * @param prenom
     * @param dateNaissance
     * @param tauxHoraireBrut
     * @param debutContrat
     */
    public Salarie(String nom,
                   String prenom,
                   LocalDate dateNaissance,
                   double tauxHoraireBrut,
                   LocalDate debutContrat

                   ) {
        super(
                nom,
                prenom,
                dateNaissance,
                debutContrat,
                null
        );
        this.tauxHoraireBrut = tauxHoraireBrut;
        this.debutContrat = debutContrat;
    }

    public double getTauxHoraireBrut() {
        return this.tauxHoraireBrut;
    }

    public void setTauxHoraireBrut(double tauxHoraireBrut) throws IllegalArgumentException {
        if (tauxHoraireBrut <20){
            throw new IllegalArgumentException("On est pas en Afrique Radine");
        }
            this.tauxHoraireBrut = tauxHoraireBrut;

    }


    /**@
     * Paie le salarié en fonction du temps passé à travailler
     * @param heureTravaillees - double - Nombre d'heures
     * @return - Le salaire !
     */
    public double payerSalaireMensuelBrut(double heureTravaillees){
        if (heureTravaillees < 0){
            throw  new IllegalArgumentException("On est pas non plus chez les restos du coeur !");
        }
        if (estLicencie()){
            throw  new IllegalArgumentException("Qui est cette personne ?");
        }
        return calculerSalaire(heureTravaillees);
    }

    /**@
     * Calcul du salaire en fonction des heures travaillées.
     * Applique un taux spécifique aux effectué au delà de 151 heures.
     * @param heureTravaillees - double - nombre d'heures travaillées.
     * @return le salaire !
     */
    private double calculerSalaire(double heureTravaillees) {
        if(heureTravaillees > HEURE_TRAVAILLEES_MENSUELLES_NORMALES) {

            double salaire = 0;
            salaire += HEURE_TRAVAILLEES_MENSUELLES_NORMALES * this.tauxHoraireBrut;
            salaire += (heureTravaillees - HEURE_TRAVAILLEES_MENSUELLES_NORMALES) * this.tauxHoraireBrut;

            return salaire;
        }
            return heureTravaillees * this.tauxHoraireBrut;

        }
        

    public double payerSalaireMensuelBrut(){
       return this.payerSalaireMensuelBrut(HEURE_TRAVAILLEES_MENSUELLES_NORMALES);
    }
    @Override
    public void travailler(){
        System.out.println(this.nom + this.prenom + " Travaille dur oulala");
    }


    //Pour que l'affichage dans le main soit SEXYYYY
    @Override // redefinir
    public String toString(){
        return "Le salarié s'appelle " + this.nom + ' ' + this.prenom;
    }

    /**@
     * Le salarié danse la samba
     */
    @Override
    public void danserLaSamba(){
        System.out.println("DANSE LA SAMBAAA 🐱‍🏍");
    }
}
