package DesafioPoo04.Temperatura;

public class TemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double resultadoCelsius = (celsius * 1.8) + 32;
        System.out.println("Celsius convertido para Fahrenheit é de: " + resultadoCelsius + " °F");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double resultadoFahrenheit = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit convertido para celsius é de: " + resultadoFahrenheit + " °C");
    }
}
