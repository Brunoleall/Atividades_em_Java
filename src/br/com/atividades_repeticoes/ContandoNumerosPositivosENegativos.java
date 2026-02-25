package br.com.atividades_repeticoes;

import java.util.Scanner;

public class ContandoNumerosPositivosENegativos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int negativo = 0;
        int positivo = 0;

        while (true) {
            System.out.println("Digite um número ( ou 'fim' para encerrar)");
            String entrada = ler.nextLine();

            if (entrada.equals("fim")){
                break;
            }

            int numero = Integer.parseInt(entrada);

            if( numero > 0){
                positivo++;
            } else if( numero < 0){
                negativo++;
            }

        }
        System.out.println("Números positivos: " + positivo);
        System.out.println("Números negativos: " + negativo);

    }
}
