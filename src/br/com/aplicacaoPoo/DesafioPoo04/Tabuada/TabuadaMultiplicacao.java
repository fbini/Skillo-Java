package br.com.aplicacaoPoo.DesafioPoo04.Tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero){
        for(int i = 1; i <= 10; i++ ){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}
