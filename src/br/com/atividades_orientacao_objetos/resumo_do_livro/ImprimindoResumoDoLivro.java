package br.com.atividades_orientacao_objetos.resumo_do_livro;

public class ImprimindoResumoDoLivro {

    String titulo;
    String autor;
    int paginas;

    public void exibirInformacoes(){
        System.out.printf(" \"%s\" de %s com %s páginas", titulo, autor, paginas);
    }



}
