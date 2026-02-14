import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CotacaoAtual {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual Criptomoeda Deseja consultar?");
        String criptomoeda = ler.nextLine();

        String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptomoeda + "&vs_currencies=brl";
        System.out.println(url);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
            HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e ) {
            System.out.println("API não encontrada.");
        }


    }
}
