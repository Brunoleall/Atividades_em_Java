package br.com.atividades.variaveis.e.tipos;

public class PlanejandoUmaViagem {
    public static void main(String[] args) {

        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;
        String mensagem;
        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        if(autonomiaAtual >= distanciaViagem){
            mensagem = "Você conseguirá completar a viagem sem precisar abastecer.";
        } else {
            mensagem = "Você não chegará longe, abasteça!";
        }


        System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima);
        System.out.println("Autonomia atual: " + autonomiaAtual);
        System.out.println(mensagem);



    }
}
