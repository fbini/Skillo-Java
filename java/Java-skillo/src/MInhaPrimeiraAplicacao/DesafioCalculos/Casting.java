package MInhaPrimeiraAplicacao2.ConceitosAula.DesafioCalculos;

public class Casting {
    public static void main(String[] args) {
        //2
        double dobroNumero = 10.50;
        int numeroInteiro = (int) dobroNumero;
        System.out.println(numeroInteiro);

        //3
        char umNumero = 'I';
        String palavra = "ingrid";
        System.out.println(umNumero + palavra);

        //4
        double precoProduto = 15.50;
        int precoProdutoInt = (int) precoProduto;
        int quantidade = 5;

        int multi = quantidade * precoProdutoInt ;
        System.out.println(multi);

        //5
        double valorEmDolares = 4.94;
        double valorReais = 4.00;
        double calculo = valorReais * valorEmDolares;
        System.out.println(calculo);

        //6
        double precoOriginal = 100.00;
        double percentualDesconto = 20;
        double comDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - comDesconto;
        System.out.println("Preço total com desconto: " + precoComDesconto);
        System.out.println(comDesconto);

    }
}
