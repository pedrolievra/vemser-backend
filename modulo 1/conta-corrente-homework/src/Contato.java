public class Contato {
    public String descricao;
    public String telefone;
    public int tipo;

    public void imprimirContato(){
        if(tipo==1){
            System.out.println("Tipo Residencial\nTelefone: " + telefone + "\nDescricao: " + descricao);
        }
        else if(tipo==2){
            System.out.println("Tipo Comercial\nTelefone: " + telefone + "\nDescricao: " + descricao);
        }
        else {
            System.out.println("Tipo inválido\nTelefone: " + telefone + "\nDescricao: " + descricao);

        }
    }
}
