package DesafioPoo02;

public class MainDesafio2 {
    public static void main(String[] args) {
        //1
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setTitular("Ingrid");
        contaBancaria.saldoDaConta();

        System.out.println(contaBancaria.getNumeroConta());
        System.out.println(contaBancaria.getSaldo());

        //2
        Idadepessoa idadePessoa = new Idadepessoa();
        idadePessoa.setIdade(19);
        idadePessoa.setNome("Bini");
        System.out.println(idadePessoa.getIdade());

        //3
        Produto produto = new Produto();
        produto.setNome("Teclado");
        produto.setPreco(800);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço normal: " + produto.getPreco());
        produto.aplicarDesconto(10);
        System.out.println("Preço com desconto " + produto.getPreco());

        //4
        Aluno aluno = new Aluno();
        aluno.setNome("Ingrid");
        aluno.calculandoMedia(5, 10, 10);

        //5
        Livro livro = new Livro();
        livro.setAutor("Inio Asano");
        livro.setTitulo("Boa noite punpun");
        livro.exibirDetalhes();







    }
}
