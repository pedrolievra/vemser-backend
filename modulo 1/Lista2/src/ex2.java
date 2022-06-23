import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean dnv;
        do {
            int[] numeros = new int[2];
            System.out.println("Pessoa 1 -> Informe um valor:");
            numeros[0] = sc.nextInt();
            System.out.println("Pessoa 2 -> Informe um valor");
            numeros[1] = sc.nextInt();

            if (numeros[0] == numeros[1]) {
                System.out.println("Parabéns, você acertou!");
                 dnv = false;
            } else if (numeros[0] > numeros[1]) {
                System.out.println("O número a ser encontrado é maior do que você digitou");
                 dnv = true;
            } else {
                System.out.println("O número a ser encontrado é menor do que você digitou");
                 dnv = true;
            }
        } while (dnv);

    }
}
