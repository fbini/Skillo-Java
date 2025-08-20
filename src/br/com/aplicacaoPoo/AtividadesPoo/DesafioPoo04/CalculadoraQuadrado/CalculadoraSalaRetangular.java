package br.com.aplicacaoPoo.AtividadesPoo.DesafioPoo04.CalculadoraQuadrado;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("A área é de: " + area + " cm²");
    }

    @Override
    public void calcularPerimetro(double perimetro) {
        double resultadoPerime = perimetro * perimetro;
        System.out.println("O perimetro é de " + resultadoPerime + " cm");

    }
}
