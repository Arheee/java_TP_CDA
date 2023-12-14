package Cours.polymorphisme;

public class Carre implements Forme{

    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double getCalculerAire() {
        return this.cote * this.cote;
    }
}
