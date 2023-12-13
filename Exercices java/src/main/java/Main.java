import exercices.TP1.exercice5.NombresTransformers;
import exercices.TP2.Thermometre;

public class Main {

    public static void main(String[] args) {

        Thermometre thermometreClient = new Thermometre();
        Thermometre thermometreClientb = new Thermometre(12);
        System.out.println("anglais " + thermometreClient.getFahrenheit());
        System.out.println("fr " + thermometreClientb.getCelsius());

    }
}
