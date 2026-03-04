package br.com.atividades_orientacao_objetos.zerando_saldo;

public class ZerandoSaldo {

    double saldo;


    public void exibirSaldo(){
        System.out.printf("Saldo atual: R$ %s \n",saldo);
    }

    public void zerarSaldo(){
        saldo -= saldo;
    }


}
