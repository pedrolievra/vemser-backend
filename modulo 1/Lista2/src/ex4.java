import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int i = 0;
        int posicao = 1;
        int menorNumero = 0;

        System.out.println("==Digite três números abaixo==");

        for (i=0; i< numeros.length; i++) {
            numeros[i] = sc.nextInt();
            if (i == 0) {
                menorNumero = numeros[i];
            }
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
                posicao = i+1;
            }
        }
        System.out.println("A posição do menor número é " + posicao);
        System.out.println("Menor número: " + menorNumero);
        }
}