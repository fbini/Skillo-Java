package br.com.aplicacaoPoo.AtividadesPoo.DesafioPoo04.ConversaoDolar;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double dolar) {
        double real = 5.16;
        double resultadoConversao = dolar * real;
        System.out.println("O valor em reais é: R$ " + resultadoConversao);

    }


}
