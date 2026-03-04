package br.com.atividades_orientacao_objetos.controle_de_temperatura;

public class ControleDeTemperatura {

    String local;
    double temperaturaAtual;
    private double temperaturaMaxima = 37.5;


    public void exibirInformacoes(){
        if(temperaturaAtual > temperaturaMaxima) {
            System.out.printf("Sensor no local: %s \nTemperatura: %s °C \nAlerta: Temperatura acima do limite!\n________________________________\n", local, temperaturaAtual);
        } else if(temperaturaAtual == temperaturaMaxima){
            System.out.printf("Sensor no local: %s \nTemperatura: %s °C \nAtenção: Temperatura no limite!\n________________________________\n", local, temperaturaAtual);
        }else {
            System.out.printf("Sensor no local: %s \nTemperatura: %s °C \nBom: Temperatura boa!\n________________________________\n", local, temperaturaAtual);

        }
    }




}
