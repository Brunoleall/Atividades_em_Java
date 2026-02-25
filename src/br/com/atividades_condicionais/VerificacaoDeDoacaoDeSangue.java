package br.com.atividades_condicionais;

import java.util.Scanner;

public class VerificacaoDeDoacaoDeSangue {
    public static void main(String[] args) {
         int idade;
         double peso;

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual sua idade? ");
        idade = ler.nextInt();
        System.out.println("Qual seu peso? ");
        peso = ler.nextDouble();

        if(idade >= 18 && idade <= 65 && peso >= 50){
            System.out.println("Você pode doar sangue!");
        } else {
            System.out.println("Doador não é compatível");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos e mais de 50kg.");
        }



    }
}
