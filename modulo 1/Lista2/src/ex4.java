import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];
        int posicao = 1;

        System.out.println("Digite os numeros:");
        numeros[0] = sc.nextInt();
        sc.nextLine();
        numeros[1] = sc.nextInt();
        sc.nextLine();
        numeros[2] = sc.nextInt();
        sc.nextLine();

        int menorNumeros = numeros[0];

        if (menorNumeros > numeros[1]) {
            menorNumeros = numeros[1];
            posicao = 2;
        }
        if (menorNumeros > numeros[2]) {
            menorNumeros = numeros[2];
            posicao = 3;
        }

        System.out.println("A posição do menor número é " + posicao);
    }
}