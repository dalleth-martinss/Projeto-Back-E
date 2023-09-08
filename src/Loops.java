import java.util.Locale;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Dê sua avaliação para o filme ");
            nota = leitura.nextInt();
            mediaAvaliacao += nota;
        }

        System.out.printf("Media de avaliação: %.2f ", mediaAvaliacao/3);


    }
}
