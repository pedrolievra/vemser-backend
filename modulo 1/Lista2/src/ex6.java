import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = {0, 1, 2 , 3,5,6,7,8,9,44,};

        int i =0;
        System.out.println("Digite o número a ser pesquisado:");
        int valor = sc.nextInt();
        sc.nextLine();

        for(i = 0;i <= 9; i++){
            if (numeros[i]==valor){
                System.out.println("O número pesquisado está dentro do conjunto!");
                break;
            }
        }

    }
}
