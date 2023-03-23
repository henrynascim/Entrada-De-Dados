import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o seu nome:");
        String nome = entrada.nextLine();

        System.out.printf("Digite sua cor:");
        String cor = entrada.nextLine();

        System.out.printf("Digite sua Idade:");
        String idade = entrada.nextLine();


        System.out.printf("Oi, %s%n" , nome);
        System.out.printf("Você gosta da cor: %s%n" , cor);
        System.out.printf("Você tem: %s anos" , idade);

    }
}