
import java.util.Scanner;

public class ex7 {
    static final int n = 4;

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int [n][n];
        int maiorQueDez =0;
        int i,j;

        System.out.println("==Digite 16 termos abaixo==");

        for (i=0; i < n; i++){
            for (j=0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for ( i=0;i < matriz.length;i ++){
            for( j=0; j< matriz.length; j++){
                if(matriz[i][j]>10){
                    maiorQueDez += 1;
                }
            }
        }
        System.out.println("Há " + maiorQueDez + " valores maiores que 10 na matriz");
    }
}
