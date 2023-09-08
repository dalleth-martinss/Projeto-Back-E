import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual é o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Dê sua avaliação para o filme ");
        double avaliacao = leitura.nextInt();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
