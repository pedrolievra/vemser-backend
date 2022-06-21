import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int i = 0;

        for (i =0; i<=(numeros.length-1);i++){
            System.out.println("Digite o " + (i+1) +"° número:");
            numeros[i] = sc.nextInt();
            sc.nextLine();
        }

        for (i=0; i<= numeros.length ; i++){
            System.out.println(numeros[19-i]);
        }
}
    }
