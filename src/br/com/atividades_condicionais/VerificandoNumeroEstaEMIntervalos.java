package br.com.atividades_condicionais;

import java.util.Scanner;

public class VerificandoNumeroEstaEMIntervalos {
    public static void main(String[] args) {
        double valorSolicitado;


        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do Empréstimo: ");
        valorSolicitado = ler.nextDouble();

        if( valorSolicitado >= 1000 && valorSolicitado <= 5000){
            System.out.println("O valor " + valorSolicitado + " foi aprovado!");
        } else {
            System.out.println("O valor " + valorSolicitado + " não está dentro do intervalo permitido para empréstimo.  ");
        }


    }
}
