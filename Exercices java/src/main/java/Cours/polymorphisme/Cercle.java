package Cours.polymorphisme;

public class Cercle implements Forme{

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double getCalculerAire() {
        return Math.PI * this.rayon * this.rayon;
    }
}
