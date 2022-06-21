import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base:");
        double base = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a altura:");
        double altura = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Area do retangulo = " + base*altura);
    }
}
