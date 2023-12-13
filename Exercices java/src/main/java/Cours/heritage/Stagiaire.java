package Cours.heritage;

import java.time.LocalDate;
import java.time.Period;

public class Stagiaire extends Collaborateur {

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

    /**@
     * Indique que le stagiaire travaille
     */
    public void travailler(){
        System.out.println(getPrenom() + "a travaillé pendant son stage" );
    }

    /**@ Mets fin au stage
     */
    public void Licencier(){
        this.finStage = LocalDate.now();
        System.out.println(getPrenom() + "a mal fait son taff" );
    }
    public int getDureeStage(){
        return Period.between(this.debutStage, this.finStage).getDays();
    }

    @Override
    public  String toString() {
        return "Le stagiaire s'appelle " + this.nom + ' ' + this.prenom + "Il commence le " + this.debutStage + " jusqu'au " + this.finStage;
    }
    @Override
    public void danserLaSamba(){
        System.out.println("DANSE LA SAMBAAA 🐱‍🏍");
    }
}
