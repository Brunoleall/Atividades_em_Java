package br.com.atividades_orientacao_objetos.zerando_saldo;

public class Principal {
    public static void main(String[] args) {

        ZerandoSaldo saldo1 = new ZerandoSaldo();


        saldo1.saldo = 1579.42;
        saldo1.exibirSaldo();
        saldo1.zerarSaldo();
        saldo1.exibirSaldo();

    }
}
