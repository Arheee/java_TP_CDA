package Cours.heritage;

import java.time.LocalDate;
import java.time.Period;

public abstract class Collaborateur {
    protected String nom;
    protected String prenom;
    protected LocalDate dateNaissance;
    protected LocalDate debutContrat;
    protected LocalDate finContrat;

    /**@
     * Constructeur , on y met les attributs.
     *  puis this.nom et de même pour :
     * @param prenom
     * @param dateNaissance
     */
    public Collaborateur(String nom, String prenom, LocalDate dateNaissance, LocalDate debutContrat, LocalDate finContrat){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.debutContrat = debutContrat;
        this.finContrat = finContrat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**@
     * Affiche l'age, calculé à partir de la date de naissance et la date du jour.
     * @return int - age
     */
    public int getAge(){
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }

    /**@
     * La personne danse la samba
     */
    public abstract void danserLaSamba();
    public abstract void travailler();
    public void licencier(LocalDate dateDeFin){
        this.finContrat = dateDeFin;
        System.out.println(this.nom + this.prenom + " est une grosse m.... !");
    };

    /**@
     * Vérifie si la personne n'est plus présent dans l'entreprise.
     * @return TRUE si le salarié/stagiaire n'existe pas / est licencié.
     */
    protected boolean estLicencie() {
        return this.finContrat != null && finContrat.isBefore(LocalDate.now());
    }

    public LocalDate getDebutContrat() {
        return debutContrat;
    }

    public void setDebutContrat(LocalDate debutContrat) {
        this.debutContrat = debutContrat;
    }

    public LocalDate getFinContrat() throws Exception {
        if (finContrat == null){
            throw new Exception("Le collaborateur n'est pas encore licencié ! 👌");
        }

        return this.finContrat;
    }

    public void setFinContrat(LocalDate finContrat) {
        this.finContrat = finContrat;
    }
}
