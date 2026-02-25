package br.com.atividades_repeticoes;

import java.util.Scanner;

public class TentativasDeLogin {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int senha = 2025;
        int tentativasMaxima = 3;
        int senhaUsuario;

        for (int i = 0; i <= tentativasMaxima; i++) {
            System.out.println("Digite a senha: ");
            senhaUsuario = ler.nextInt();
            if ( senhaUsuario == senha){
                System.out.println("Senha Correta. Acesso concebido!");
                break;
            }

            System.out.println("Senha incorreta. Você tem " + tentativasMaxima-- + " Tentativas");
        }







    }
}
