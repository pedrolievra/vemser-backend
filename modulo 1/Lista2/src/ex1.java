import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();
        System.out.println("Digite o valor deste produto:");
        double valor = sc.nextDouble();
        sc.nextLine();

        double chegada = valor / 2;

        double desconto = 0;

        int fim =0;

        int i =0;
        System.out.println("Produto: " + nome );
        System.out.println("Preço: " + valor);

        for (i=1; i<=10; i++) {
            if (desconto <=chegada) {
                desconto =  0.05 * valor * i;
            }
            double total = valor - desconto;
            System.out.println(i + "x R$ " + total + "x = " + total*i);
        }
    }
}
