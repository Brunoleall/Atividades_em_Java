package br.com.atividades.variaveis.e.tipos;

public class ClassificacaoPorCategoria {
    public static void main(String[] args) {
        String produto = "Air Pods";
        double preco =  200.01;

        String categoria;
        if(preco <= 50.00) {
            categoria = "Econômico";
        } else if (preco >= 50.01 && preco <= 200.00) {
            categoria = "Intermediário";
        } else if ( preco >= 200.01){
            categoria = "Premium";
        } else {
            categoria = "Categoria Inválida!";
        }

        System.out.println("Nome do Produto: " + produto + "\nPreço: " + preco + "\nCategoria: " + categoria);





    }
}
