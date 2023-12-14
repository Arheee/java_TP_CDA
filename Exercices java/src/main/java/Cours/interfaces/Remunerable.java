package Cours.interfaces;

public interface Remunerable {

    /**
     * Nombre d'heures travaillées pendant un mois,
     * pour une personne à 35h
     */
    public static final int NOMBRE_HEURES_MENSUELLES_NORMAL = 151;

    /**
     * Surcharge Overload
     * Paie un salarié en fonction de son taux
     * @param heures double - Nombre d'heures travaillées
     */
    public void payer(int heures);

    /**
     * Paie un salarié sur son taux horaires, sur une base de 151 heures.
     */
    public void payer();
    public double getTauxHoraire();
    public double calculerRemunerationHeureSupp(double heuresTravaillees);


}
