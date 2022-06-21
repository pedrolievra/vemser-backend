import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorDaHora = scanner.nextInt();
        scanner.nextLine();
        double horasTrabalhadas = scanner.nextInt();
        scanner.nextLine();
        double horasExtrasCinquenta = scanner.nextInt();
        scanner.nextLine();
        double horasExtrasCem = scanner.nextInt();
        scanner.nextLine();

        double salarioBruto = horasTrabalhadas*valorDaHora + horasExtrasCinquenta*valorDaHora*1.5 + horasExtrasCem*valorDaHora*2;
        System.out.println(salarioBruto);
    }
}
