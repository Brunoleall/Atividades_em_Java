import java.util.Scanner;

public class ConsultarLivros {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual livro você deseja Consultar? ");
        String livro = ler.nextLine();
        System.out.println(livro);

        String ajusteNomeLivroParaUlR = livro.replace(" ", "+");
        System.out.println(ajusteNomeLivroParaUlR);


    }
}
