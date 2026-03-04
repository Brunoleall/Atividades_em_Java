package br.com.atividades_orientacao_objetos.corrigindo_cadastro;

public class CorringindoCadastro {

    String nome;
    String cargo;
    int nivelDeAcesso;

    public void exibirInformacao(){
        System.out.printf("_______Antes da atualização_______\nNome: %s\nCargo: %s\nNível de Acesso: %d\n       \n", nome,cargo,nivelDeAcesso);

    }

    public void atualizacaoCadastral(String cargo, int nivelDeAcesso){
        System.out.printf("_______Após a atualização_______\nNome: %s\nCargo: %s\nNível de Acesso: %d\n", nome,cargo,nivelDeAcesso);
    }




}
