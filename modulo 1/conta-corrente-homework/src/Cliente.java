public class Cliente {
    private String nome;
    private String cpf;
    private Contato[] contatos = new Contato[2];
    private Endereco[] enderecos = new Endereco[2];

    public Cliente(String nome, String cpf, Contato contato, Endereco enderecos){
        this.contatos[0] = contato;
        this.enderecos[0] = enderecos;
        this.contatos[1] = contato;
        this.enderecos[1] = enderecos;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Cliente() {

    }

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




