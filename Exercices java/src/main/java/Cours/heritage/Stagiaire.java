package Cours.heritage;

import java.time.LocalDate;

public class Stagiaire extends Personne{

    private  LocalDate debutStage;
    private  LocalDate finStage;
    public Stagiaire(String nom, String prenom, LocalDate dateNaissance, LocalDate debutStage, LocalDate finStage) {
        super(nom, prenom, dateNaissance);
        this.debutStage = debutStage;
        this.finStage = finStage;
    }

    public LocalDate getDebutStage() {
        return debutStage;
    }

    public void setDebutStage(LocalDate debutStage) {
        this.debutStage = debutStage;
    }

    public LocalDate getFinStage() throws Exception {
        if(finStage == null){
            throw  new Exception("Le stagiaire n'a pas fini son stage");
        }
        return this.finStage;
    }

    public void setFinStage(LocalDate finStage) {
        this.finStage = finStage;
    }

    public double heuresTravaille(double heuresStage){
        heuresStage = 0;
        heuresStage += heuresStage;
        System.out.println(getPrenom() + "a travaillé pendant son stage" + heuresStage + "heures");
        return heuresStage;
    }

    public boolean estLicencie(){
        if(this.finStage != null && finStage.isBefore(LocalDate.now())){
            throw  new IllegalArgumentException("Le stagiaire est viré");
        }
    return false;
    }

    @Override
    public  String toString() {
        return "Le stagiaire s'appelle " + this.nom + ' ' + this.prenom;
    }
}
