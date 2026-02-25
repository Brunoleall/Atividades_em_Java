package br.com.atividades_repeticoes;

import java.util.Scanner;

public class PulandoNumerosTerminamEm5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = 0;
        System.out.println("Digite um número:");
        numero = ler.nextInt();

        for(int i = 1; i <= numero; i++){
            i = i++;
            if( i % 10 == 5){
                continue;
            }
            System.out.println(i);
        }




    }
}
