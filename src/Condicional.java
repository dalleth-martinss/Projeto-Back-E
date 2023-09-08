public class Condicional {
public static void main (String[] args){

        int anoDeLancado = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPLano = "plus";

        if (anoDeLancado >= 2022 ){
            System.out.println("Lançamento  que os clientes curtindo");
        }
        else {
            System.out.println("Filme retrô que vale apena assistir!");
        }
        if (incluidoNoPlano == true && tipoPLano.equals("plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

    }

}
