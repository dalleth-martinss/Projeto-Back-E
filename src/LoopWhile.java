import java.util.Locale;
import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Dê sua avaliação para o filme  ou digite -1 para encerrar");
            nota = leitura.nextInt();
            if (nota != -1){
                mediaAvaliacao += nota;
                totalNotas++;
            }

        }

        System.out.printf("Media de avaliação: %.2f ", mediaAvaliacao/totalNotas);

    }
}
