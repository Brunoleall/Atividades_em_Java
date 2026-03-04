package br.com.atividades_orientacao_objetos.relatorio_do_produto;

public class RelatorioDoProduto {

    String nomeDoProduto;
    double preco;
    int quantidade;

    public void informacoesDoproduto() {
        System.out.println("Produto: " + nomeDoProduto);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidade);

    }



}
