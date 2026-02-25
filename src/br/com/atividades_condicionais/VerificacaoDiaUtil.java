package br.com.atividades_condicionais;

import java.util.Scanner;

public class VerificacaoDiaUtil {
    public static void main(String[] args) {

        String diaInformado;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        diaInformado = ler.nextLine();

       if(diaInformado.equals("segunda") || diaInformado.equals("terca") || diaInformado.equals("quarta") || diaInformado.equals("quinta") || diaInformado.equals("sexta")) {
       System.out.println(diaInformado + " é dia útil.");
       } else {
           System.out.println(diaInformado + " Não é dia útil.");
       }
    }
}
