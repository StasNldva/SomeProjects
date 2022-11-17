package stas.neledva.temperconvert;

/**
 * @author Stas Neledva
 *
 */
public class TemperatureConverter {

    private final double celsius = 273.15;

    /**
     *
     * @param temperature any number, but not too longer (means, not BigInteger)
     * @return double type in Kelvin
     */
    public double celsiusToKelvin(double temperature) {
        //T(K) = T(C) + 273,15 (Celsius to Kelvin conversion)
        return temperature + celsius;
    }

    /**
     *
     * @param temperature any number, but not too longer (means, not BigInteger)
     * @return double type in Celsius
     */
    public double kelvinToCelsius(double temperature) {
        //T(C) = T(K) - 273,15 (conversion from Kelvin to Celsius)
        return temperature - celsius;
    }

    /**
     *
     * @param temperature any number, but not too longer (means, not BigInteger)
     * @return double type in Fahrenheit
     */
    public double celsiusToFahrenheit(double temperature) {
        //T(F) = 32 + (T(C) * 9/5) (Celsius to Fahrenheit conversion)
        return 32 + (temperature * 9/5);
    }

    /**
     *
     * @param temperature any number, but not too longer (means, not BigInteger)
     * @return double type in Celsius
     */
    public double fahrenheitToCelsius(double temperature) {
        //T(C) = 5/9 * (T(F) - 32) (Fahrenheit to Celsius conversion)
        return 5.0/9.0 * (temperature - 32.0);
    }

    /**
     *
     * @param temperature any number, but not too longer (means, not BigInteger)
     * @return double type in Newton
     */
    public double celsiusToNewton(double temperature) {
        //T(N) = T(C) * 33 / 100 (Celsius to Newton conversion)
        return temperature * 33 / 100;
    }

    /**
     *
     * @param temperature any number, but not too longer (means, not BigInteger)
     * @return double type in Celsius
     */
    public double newtonToCelsius(double temperature) {
        //T(C) = T(N) * 100 / 33 (Newton to Celsius conversion)
        return temperature * 100 / 33;
    }
}
