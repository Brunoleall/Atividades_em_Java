package br.com.atividades_condicionais;

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        int senha = 348920;
        int digitadoPeloUsuario;

        Scanner ler = new Scanner(System.in);
        System.out.println("_________________________________________");
        System.out.println("Digite a Senha: ");
        System.out.println("_________________________________________");
        digitadoPeloUsuario = ler.nextInt();


        if (digitadoPeloUsuario == senha) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }


    }
}
