import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = {0, 1, 2 , 3,5,6,7,8,9,44};

        System.out.println("Digite o número a ser pesquisado:");
        int valor = sc.nextInt();
        sc.nextLine();
        boolean encontrado=false;

        for(int i = 0;i < numeros.length; i++){
            if (numeros[i]==valor){
                encontrado=true;
                break;
            }
        }
        if (encontrado==true){
            System.out.println("O número pesquisado está dentro do conjunto!");
        }
        else{
            System.out.println("O numero não existe no vetor!");
        }
    }
}
