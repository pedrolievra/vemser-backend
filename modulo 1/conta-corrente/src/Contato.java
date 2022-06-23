public class Contato {
    String descricao;
    String telefone;
    int tipo;

    void imprimirContato(){
        System.out.println("Contato do cliente: " + descricao);
        System.out.println("Telefone: " + telefone);
        if(tipo==1){
            System.out.println("Tipo: Residencial");
        }
        else if (tipo==2){
            System.out.println("Tipo: Comercial");
        }
        else{
            System.out.println("Tipo não existente");
        }
        System.out.println("");
    }
}
