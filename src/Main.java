import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlan = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 8.3 + 6.3) / 3;
        String formatacao = "%.2f";
        System.out.printf("Avaliações : %.2f ", media);
        String sinopse;
        sinopse = """
              
              Filme Top Gun: Marverick
              é um filme estadunidense de 2022, dos gêneros ação, 
              aventura e drama, dirigido por Joseph Kosinski; 
              é uma sequência de Top Gun, de 1986. 
              Tom Cruise reprisa seu papel principal como o aviador 
              naval Pete 'Maverick' Mitchell.
              Ano de Lançamento 2022 """;
        System.out.println(sinopse);
        int classificacao = (int) (media / 2); // para transformar resultado double par inteiro, preciso por (int) antes.
        System.out.println(classificacao);

    }
}