package br.com.atividades_repeticoes;

import java.util.Scanner;

public class CalculandoFatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int number;
        int fatorial = 1;
        System.out.println("Digite um número: ");
        number = ler.nextInt();

        for(int i = 1; i <= number; i++){
            fatorial *= i;

        }
        System.out.println(fatorial);


    }
}
