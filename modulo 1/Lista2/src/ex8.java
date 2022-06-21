import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 5, coluna = 4, maiorNota = 0, matriculaNerd = 0, somaDasNotas = 0;
        int[][] alunos = new int[linhas][coluna];

        for(int i = 0; i < linhas; i++){
            System.out.print("Digite as informações do " + (i+1) + "° aluno: ");
            for(int j = 0; j < (coluna - 1); j++){
                if(j == 0){
                    System.out.print("Número de Matrícula: ");
                    alunos[i][j] = sc.nextInt();
                }
                else if(j == 1){
                    System.out.print("Valor da Média das provas: ");
                    alunos[i][j] = sc.nextInt();
                }
                else if(j == 2){
                    System.out.print("Valor da Média dos trabalhos: ");
                    alunos[i][j] = sc.nextInt();
                }
            }
        }
        for(int i = 0; i < linhas; i++){
            alunos[i][3] = (int)(alunos[i][1] * 0.6 + alunos[i][2] * 0.4);
            somaDasNotas += alunos[i][3];

            if(alunos[i][3] > maiorNota){
                maiorNota = alunos[i][3];
                matriculaNerd = alunos[i][0];
            }
        }
        double mediaNotasFinais = (double) somaDasNotas / linhas;
        System.out.print("Matrícula com a maior nota: " + matriculaNerd);
        System.out.println(" | Nota: " + maiorNota);
        System.out.print("Média das notas finais: " + mediaNotasFinais);
    }
}
