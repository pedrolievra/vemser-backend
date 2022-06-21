import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        String nomeMaisPesado = null;
        float altura = 0;
        double jogadorMaisAlto = 0, jogadorMaisPesado = 0, somaDasAlturas = 0, mediaDasAlturas = 0, peso = 0;
        int idade, jogadorMaisVelho = 0, qtdJogadores = 0, i = 1;

        while (true) {
            System.out.print("Digite o nome do " + i + "º jogador: ");
            nome = sc.nextLine();
            if ("SAIR".equals(nome)) {
                break;
            }

            System.out.print("Digite a idade do jogador: ");
            idade = sc.nextInt();

            // USAR VIRGULA PARA DECLARAR OS VALORES ABAUXO
            System.out.print("Digite o peso do jogador: ");
            peso = sc.nextDouble();

            System.out.print("Digite a altura do jogador: ");
            altura = sc.nextFloat();

            sc.nextLine();

            qtdJogadores++;
            i++;

            if (altura > jogadorMaisAlto) {
                jogadorMaisAlto = altura;
            }
            if (idade > jogadorMaisVelho) {
                jogadorMaisVelho = idade;
            }
            if (peso > jogadorMaisPesado) {
                jogadorMaisPesado = peso;
                nomeMaisPesado = nome;
            }
            somaDasAlturas += altura;

            System.out.println();
        }
        mediaDasAlturas = somaDasAlturas/qtdJogadores;

        System.out.println("Quantidade de jogadores: " + qtdJogadores);
        System.out.println("Altura do jogador maior: " + jogadorMaisAlto);
        System.out.println("Jogador mais velho: " + jogadorMaisVelho);
        System.out.println("Jogador mais pesado: " + jogadorMaisPesado);
        System.out.println("Média das alturas: " + mediaDasAlturas);
    }
}