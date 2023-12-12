package exercices.TP2;

public class Thermometre {
    private double temperatureInitial;
    private double celsius;

    public Thermometre(double temperatureInitial){
    this.temperatureInitial = temperatureInitial;
    }

    public Thermometre(){

    }

    public double getCelsius(){
        return temperatureInitial;
    }

    public double getFahrenheit(){
        return temperatureInitial * 1.8 + 32;
    }

    public double getKelvin(){
        return temperatureInitial + 273;
    }




}
