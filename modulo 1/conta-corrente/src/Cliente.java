public class Cliente {
    String nome;
    String cpf;
    Contato[] contatos = new Contato[2];
    Endereco[] enderecos = new Endereco[2];

    void imprimirContatos() {
        for (int i = 0; i <= 1; i++) {
            System.out.println("Contato "+ (i+1));
            contatos[i].imprimirContato();
        }
    }

    void imprimirEnderecos(){
        for(int i = 0; i <= 1 ; i++){
            System.out.println("Endereço "+ (i+1));
            enderecos[i].imprimirEndereco();
        }
    }

    void imprimirCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF do cliente: " + cpf);
    }
}




