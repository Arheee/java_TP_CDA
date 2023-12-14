package Cours.polymorphisme;

public class TriangleRectangle implements Forme{

    private double longueur;
    private double largeur;

    public TriangleRectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double getCalculerAire() {
        return this.longueur * this.largeur /2;
    }
}
