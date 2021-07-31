package ac.id.mercubuana.prjkonversisuhu;

public class Suhu {

    double Celcius, Fahrenheit, Reamur, Kelvin;

    public double konversiCelciustoFahrenheit(double _celcius) {
        return (1.8 * _celcius) + 32;
    }

    public double konversiCelciustoReamur(double _celcius) {
        return 0.8 * _celcius;
    }

    public double konversiCelciustoKelvin(double _celcius) {
        return (1.8 * _celcius) + 32;
    }
}
