import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o termo para traducao:");
        String termo = scanner.nextLine();

        switch (termo) {

            case "dog": {
                System.out.println("Cachorro");
                break;
            }

            case "time": {
                System.out.println("Tempo");
                break;
            }
            case "love": {
                System.out.println("Amor");
                break;
            }
            case "city": {
                System.out.println("Cidade");
                break;
            }
            case "happy": {
                System.out.println("Feliz");
                break;
            }
            case "sad": {
                System.out.println("Triste");
                break;
            }
            case "shoud": {
                System.out.println("Deveria");
                break;
            }
            case "could": {
                System.out.println("Poderia");
                break;
            }
            case "cachorro": {
                System.out.println("Dog");
                break;
            }
            case "tempo": {
                System.out.println("Time");
                break;
            }
            case "amor": {
                System.out.println("Love");
                break;
            }
            case "cidade": {
                System.out.println("City");
                break;
            }
            case "feliz": {
                System.out.println("Happy");
                break;
            }
            case "triste": {
                System.out.println("Sad");
                break;
            }
            case "deveria": {
                System.out.println("Should");
                break;
            }
            case "poderia": {
                System.out.println("Could");
                break;
            }
            default:
                System.out.println("Essa palavra nao eh valida");

        }
    }
}
