package br.com.atividades_condicionais;

import java.util.Scanner;

public class VerificandoAcessoEPermissao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int codigoValido = 2023;
        int nivelDePermissao;
        int codDigitado;

        System.out.println("Digite o código de acesso: ");
        codDigitado = ler.nextInt();
        System.out.println("Digite o nível de permissão: ");
        nivelDePermissao = ler.nextInt();

        boolean codVerificado = codigoValido == codDigitado;
        boolean permissaoVrificado = nivelDePermissao == 1 || nivelDePermissao == 2 || nivelDePermissao == 3;

        if(codVerificado == true && permissaoVrificado == true){
            System.out.println("Acesso permitido. Bem-Vindo ao Sistema!");
        } else {
            if (!codVerificado){
                System.out.println("O código de acesso está inválido.");
            } else {
                if(permissaoVrificado == false){
                    System.out.println("O nível de permissão não é autorizado.");
                }

            }
        }

    }
}
