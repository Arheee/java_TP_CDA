### Diagramme UML fonctionnel et technique
title Thermomètre - Class Thermomètre

class ThermometreFonctionnel {
+ celsius : double
+ fahrenheit : double
+ kelvin : double
  }

class ThermometreTechnique{
- celsius : double
+ getCelsius()
+ getFahrenheit()
+ getKelvin()
+ setCelsius()
+ setFahrenheit()
+ setKelvin()

}