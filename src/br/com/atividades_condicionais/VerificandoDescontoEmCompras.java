package br.com.atividades_condicionais;

import java.util.Scanner;

public class VerificandoDescontoEmCompras {
    public static void main(String[] args) {

        double valorDaCompra;
        double desconto = 10.0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o valor da Compra? ");
        valorDaCompra = ler.nextDouble();

        if(valorDaCompra >= 100){
            double descontoFinal = valorDaCompra * (desconto/100.0);
            double valorFinal = valorDaCompra - descontoFinal;
            System.out.println("Desconto de 10% aplicado\nNovo valor: " + valorFinal);
        } else{
            System.out.println("Não obtem desconto\nValor final: " + valorDaCompra);
        }


    }
}
