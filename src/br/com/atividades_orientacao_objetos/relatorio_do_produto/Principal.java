package br.com.atividades_orientacao_objetos.relatorio_do_produto;

public class Principal {
    public static void main(String[] args) {

        RelatorioDoProduto produto1 = new RelatorioDoProduto();

        produto1.nomeDoProduto = "Mouse Gamer";
        produto1.preco = 159.9;
        produto1.quantidade = 25;

        produto1.informacoesDoproduto();

    }
}
