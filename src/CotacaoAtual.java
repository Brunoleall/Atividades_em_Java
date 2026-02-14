import java.util.Scanner;

public class CotacaoAtual {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual Criptomoeda Deseja consultar?");
        String criptomoeda = ler.nextLine();

        String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptomoeda + "&vs_currencies=brl";
        System.out.println(url);


    }
}
