package br.com.atividades_repeticoes;

public class SomaNumerosPares {
    public static void main(String[] args) {
        int num = 100;
        int soma = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                soma += i;
            }

        }
        System.out.println(soma);

    }
}