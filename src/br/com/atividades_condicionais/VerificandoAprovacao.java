package br.com.atividades_condicionais;

import java.util.Scanner;

public class VerificandoAprovacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double media = 7;

        double nota1;
        double nota2;
        double nota3;


        System.out.println("Insira a Primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Insira a Segunda nota: ");
        nota2 = ler.nextDouble();
        System.out.println("Insira a Terceira nota: ");
        nota3 = ler.nextDouble();

        double mediaFinal = (nota1 + nota2 + nota3) / 3;

        if (mediaFinal >= 7) {
            System.out.println("Aprovado!\n" + "Sua média é: " + mediaFinal);
        } else if (mediaFinal < 7 && mediaFinal >= 5) {
            System.out.println("Em recuperação!\n" + "Sua média é: " + mediaFinal);
        } else {
            System.out.println("Reprovado!\n" + "Sua média é: " + mediaFinal);
        }


    }
}
