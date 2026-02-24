package br.com.atividades.variaveis.e.tipos;

public class ConversorDeMoedas {
    public static void main(String[] args) {

        double cotacao = 5.25;
        double valorReais = 451.50;

        double dolares = valorReais / cotacao;

        System.out.println("O valor em dólares é: " + dolares);



    }
}
