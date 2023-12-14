package Cours.interfaces;

import java.time.LocalDate;

public class Cdd extends Collaborateur implements Remunerable, Renouvelable{

    private double tauxHoraire;
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

    @Override
    public double calculerRemunerationHeureSupp(double heuresTravaillees) {
        double salaire = 0;
        salaire += NOMBRE_HEURES_MENSUELLES_NORMAL * this.getTauxHoraire();
        salaire += (heuresTravaillees - NOMBRE_HEURES_MENSUELLES_NORMAL) * this.getTauxHoraire();

        return salaire;
    }

    @Override
    public void prolongerContrat(LocalDate nouvelleDateDeFin) {
        this.dateFinContrat = nouvelleDateDeFin;
    }
}
