import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextInt();
        double n2 = scanner.nextInt();
        double n3 = scanner.nextInt();
        double n4 = scanner.nextInt();
        scanner.nextLine();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 0 && media <= 5) {
            System.out.println("Reprovado");
        }
        if (media >= 5.1 && media <= 6.9) {
            System.out.println("Em exame");
        }
        if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        }
    }
}
