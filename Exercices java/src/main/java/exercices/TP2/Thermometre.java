package exercices.TP2;

public class Thermometre {

    /**
     * Attributs
     */
    private double temperatureCelsius;

    /**
     *  Constructeur 1 : prend en paramètre la température
     * @param temperatureCelsius
     */
    public Thermometre(double temperatureCelsius){
    this.temperatureCelsius = temperatureCelsius;
    }

    /**
     * Constructeur 2 : si je note Thermometre sans params il appel celui ci
     * this(0) appel le premier et le mettra à 0
     * ça s'appelle une surcharge de constructeur.
     */
    public Thermometre(){
    this(0);
    }

    /**
     * Accesseurs
     * @return
     */

    public double getCelsius(){
        return this.temperatureCelsius;
    }
    public void setCelsius(double nouvelleTemperatureEnCelsius){
        this.temperatureCelsius = nouvelleTemperatureEnCelsius;
    }

    public double getFahrenheit(){
        return this.temperatureCelsius * 1.8 + 32;
    }
    public void setFahrenheit(double nouvelleTemperatureEnFahrenheit){
        this.temperatureCelsius = (nouvelleTemperatureEnFahrenheit - 32) / 1.8 ;
    }

    public double getKelvin(){
        return this.temperatureCelsius + 273.15;
    }
    public void setKelvin(double nouvelleTemperatureEnKelvin){
        this.temperatureCelsius = nouvelleTemperatureEnKelvin - 273.15;
    }

}
