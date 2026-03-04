package br.com.atividades_orientacao_objetos.resumo_do_livro;

public class Principal {
    public static void main(String[] args) {

        ImprimindoResumoDoLivro livro1 = new ImprimindoResumoDoLivro();

        livro1.titulo = "O Guia do Mochileiro das Galáxias";
        livro1.autor = "Douglas Adams";
        livro1.paginas = 208;

        livro1.exibirInformacoes();



    }
}
