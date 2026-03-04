package br.com.atividades_orientacao_objetos.controle_de_temperatura;

public class Principal {
    public static void main(String[] args) {

        ControleDeTemperatura setorA = new ControleDeTemperatura();

        setorA.local = "Setor A";
        setorA.temperaturaAtual = 33.2;

        ControleDeTemperatura setorB = new ControleDeTemperatura();

        setorB.local = "Setor B";
        setorB.temperaturaAtual = 37.5;

        ControleDeTemperatura setorC = new ControleDeTemperatura();

        setorC.local = "Setor C";
        setorC.temperaturaAtual = 35.0;

        setorA.exibirInformacoes();
        setorB.exibirInformacoes();
        setorC.exibirInformacoes();
    }
}
