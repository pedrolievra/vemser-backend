public class Cliente {
    String nome;
    String cpf;
    Contato[] contatos = new Contato[2];
    Endereco[] enderecos = new Endereco[2];

    void imprimirContatos() {
        for (int i = 0; i <= 1; i++) {
            contatos[i].imprimirContato();
        }
    }

    void imprimirEnderecos(){
        for(int i = 0; i <= 1 ; i++){
            enderecos[i].imprimirEndereco();
        }
    }

    void imprimirCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF do cliente: " + cpf);
    }

}




