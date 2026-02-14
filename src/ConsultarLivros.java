import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultarLivros {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual livro você deseja Consultar? ");
        String livro = ler.nextLine();
        System.out.println(livro);

        String ajusteNomeLivroParaUlR = livro.replace(" ", "+");
        System.out.println(ajusteNomeLivroParaUlR);

        String url = "https://www.googleapis.com/books/v1/volumes?q=" + ajusteNomeLivroParaUlR;
        System.out.println(url);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e ){
            System.out.println("Erro ao consultar a API");
        }
    }
}