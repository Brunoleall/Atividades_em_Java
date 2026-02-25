package br.com.atividades_condicionais;

import java.util.Scanner;

public class ComparandoDoisNumeros {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        numero1 = ler.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = ler.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais:  " + numero1);

        }


    }
}
