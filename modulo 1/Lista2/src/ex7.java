public class ex7 {
    public static void main(String[] args) {
        int array[][]={
                {3, 5, 6, 99},
                {5, 23, 11, 14},
                {1, 2, 3, 4},
                {14, 26, 31, 3}
        };

        int maiorQueDez = 0;

        for (int i=0;i < array.length;i ++){
            for(int j=0; j< array.length; j++){
                if(array[i][j]>10){
                    maiorQueDez += 1;
                }
            }
        }

        System.out.println("Há " + maiorQueDez + " valores maior que 10 na matriz");
    }
}
