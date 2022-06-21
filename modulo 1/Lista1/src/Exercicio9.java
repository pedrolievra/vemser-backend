import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os anos:");
        int anos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite os meses:");
        int meses = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite os dias:");
        int dias = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Voce tem " + (365*anos + meses*30 + dias) + " dias de vida");


    }
}
