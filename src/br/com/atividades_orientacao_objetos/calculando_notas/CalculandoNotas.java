package br.com.atividades_orientacao_objetos.calculando_notas;

public class CalculandoNotas {

    String nomeAluno;
    double nota1;
    double nota2;


    public void exibirResultado(){
        double media = (nota1 + nota2) /2;
        if (media >= 7){

            System.out.printf("Aluno: %s\nNota 1: %s\nNota 2: %s\nMédia: %.2f\nSituação: Aprovado", nomeAluno, nota1,nota2,media);
        } else if(media <= 6.9){
            System.out.printf("Aluno: %s\nNota 1: %s\nNota 2: %s\nMédia: %.2f\nSituação: Reprovado", nomeAluno, nota1,nota2,media);

        }
    }


}
