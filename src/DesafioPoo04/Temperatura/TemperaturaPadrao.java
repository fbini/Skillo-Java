package DesafioPoo04.Temperatura;

public class TemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double resultadoCelsius = (celsius * 1.8) + 32;
        System.out.println("");
    }

    @Override
    public void fahrenheitParaCelsius() {

    }
}
