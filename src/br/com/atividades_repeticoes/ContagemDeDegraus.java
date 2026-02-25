package br.com.atividades_repeticoes;

import java.util.Scanner;

public class ContagemDeDegraus {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int degraus;

        System.out.println("Digite a quantidade de Degraus: ");
        degraus = ler.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);

        }
        System.out.println("Você chegou no topo!");
        ler.close();

    }
}
