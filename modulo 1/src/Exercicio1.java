import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


         System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua cidade:");
        String cidade = scanner.nextLine();

        System.out.println("Digite seu estado:");
        String estado = scanner.nextLine();



        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();

       System.out.println("Olá, seu nome eh " + nome + ", voce tem " + idade + " anos, eh da cidade de " + cidade + ", situada no estado de "+ estado);
        System.out.println(idade);
    }
}
