package Cours.polymorphisme;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){
        Carre leBeauCarre = new Carre(2);
        TriangleRectangle leBeauTriangle = new TriangleRectangle(3,5);
        Cercle leBeauCercle = new Cercle(5);

        /**@
         * ArrayList est une implémentation de List
         */
        List<Forme> mesSuperFormes = new ArrayList<>();
        mesSuperFormes.add(leBeauCarre);
        mesSuperFormes.add(leBeauCercle);
        mesSuperFormes.add(leBeauTriangle);

        for(Forme forme : mesSuperFormes){
            System.out.println("l'air est de " + forme.getCalculerAire());
        }
    }
}
