package Cours.interfaces;

import java.time.LocalDate;

public abstract class Collaborateur implements Personne {
    protected String nom;
    protected String prenom;
    protected LocalDate dateDebutContrat;

    public LocalDate getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(LocalDate dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public LocalDate getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(LocalDate dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    protected LocalDate dateFinContrat;

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public String getPrenom() {
        return this.prenom;
    }

    @Override
    public String getNomComplet() {
        return this.nom + " " +this.prenom;
    }

    @Override
    public void setNom(String nouveauNom) {
         this.nom = nouveauNom;
    }

    @Override
    public void setPrenom(String nouveauPrenom) {
         this.prenom = nouveauPrenom;
    }

    public void licencier(LocalDate dateDeFin){
        this.dateFinContrat = dateDeFin;
        System.out.println(this.nom + this.prenom + "est viré.");
    }

    /**@
     * Le collaborateur travaille.
     */
    public void travailler(){
        System.out.println(this.getNom() + " " + this.getPrenom() + " travaille");
    }

    /**
     * Vérifie si le collaborateur est dans les effectifs
     * @return boolean - true s'il est encore dans les effectifs.
     */

    protected boolean estDansLesEffectifs(){
        return !( this.dateFinContrat != null && this.dateFinContrat.isBefore(LocalDate.now()));
    }
}
