import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotal = scanner.nextInt();
        scanner.nextLine();
        double valorPago = scanner.nextInt();
        scanner.nextLine();

        if (valorPago>=valorTotal){
            double troco = valorPago - valorTotal;
            System.out.println(troco);
        }
        else{
            System.out.println("O valor pago deve ser maior ou igual ao valor consumido");
        }
}
    }
