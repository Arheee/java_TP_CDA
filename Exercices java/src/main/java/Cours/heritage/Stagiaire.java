package Cours.heritage;

import java.time.LocalDate;
import java.time.Period;

public class Stagiaire extends Collaborateur {

    public Stagiaire(String nom, String prenom, LocalDate dateNaissance, LocalDate debutContrat, LocalDate finContrat) {
        super(
                nom,
                prenom,
                dateNaissance,
                debutContrat,
                finContrat);

    }


    /**@
     * Indique que le stagiaire travaille
     */
    @Override
    public void travailler(){
        System.out.println(this.nom + this.prenom + " : ce stagiaire Travaille dur oulala");
    }


    public int getDureeStage(){
        return Period.between(this.debutContrat, this.finContrat).getDays();
    }

    @Override
    public void danserLaSamba(){
        System.out.println("DANSE LA SAMBAAA 🐱‍🏍");
    }

    @Override
    public  String toString() {
        return "Le stagiaire s'appelle " + this.nom + ' ' + this.prenom + "Il commence le " + this.debutContrat + " jusqu'au "
                + this.finContrat + " donc " + getDureeStage() + " jours";
    }
}
