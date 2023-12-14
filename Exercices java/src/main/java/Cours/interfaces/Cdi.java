package Cours.interfaces;

public class Cdi extends Collaborateur implements Remunerable{

    private  double tauxHoraire;
    @Override
    public void payer(int heures) {

        System.out.println("Salaire de cet homme : " + this.getTauxHoraire() * heures);
    }

    @Override
    public void payer() {
        System.out.println("Salaire de cet homme : " + this.getTauxHoraire() * this.NOMBRE_HEURES_MENSUELLES_NORMAL);

    }

    @Override
    public double getTauxHoraire() {
        return this.tauxHoraire;
    }

    public void setTauxHoraire(double nouveauTauxHoraire){
        this.tauxHoraire = nouveauTauxHoraire;
    }

    @Override
    public double calculerRemunerationHeureSupp(double heuresTravaillees) {

        double salaire = 0;
        salaire += NOMBRE_HEURES_MENSUELLES_NORMAL * this.getTauxHoraire();
        salaire += (heuresTravaillees - NOMBRE_HEURES_MENSUELLES_NORMAL) * this.getTauxHoraire();

        return salaire;
    }
}
