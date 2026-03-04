package br.com.atividades_orientacao_objetos.corrigindo_cadastro;

public class Principal {
    public static void main(String[] args) {

        CorringindoCadastro correcao1 = new CorringindoCadastro();

        correcao1.nome = "Joice Carmago";
        correcao1.cargo = "Auxiliar Administrativo";
        correcao1.nivelDeAcesso = 1;

        correcao1.exibirInformacao();
        correcao1.atualizacaoCadastral("Supervisor", 2);




    }
}
