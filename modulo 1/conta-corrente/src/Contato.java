public class Contato {
    String descricao;
    String telefone;
    int tipo =0;

    void imprimirContato(){
        System.out.println(" ");
        System.out.println("Contato do cliente: " + descricao);
        System.out.println("Telefone: " + telefone);
        System.out.println("Tipo: " + tipo);
        System.out.println(" ");
    }
}
