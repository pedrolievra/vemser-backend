import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de eleitores:");
        double eleitores = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o numero de votos brancos:");
        double votosBrancos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o numero de votos nulos:");
        double votosNulos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o numero de votos validos:");
        double votosValidos = scanner.nextInt();
        scanner.nextLine();

        double votosTotais = votosBrancos + votosNulos + votosValidos;

        System.out.println("Votos brancos: " + 100*(votosBrancos/votosTotais) + "%");
        System.out.println("Votos nulos: " + 100*(votosNulos/votosTotais)  + "%");
        System.out.println("Votos validos: " + 100*(votosValidos/votosTotais)  + "%");
    }
}
