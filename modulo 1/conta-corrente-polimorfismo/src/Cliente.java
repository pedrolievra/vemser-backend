import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Contato> contatos = new ArrayList<>(); //reduntante inserir new ArrayList
    private ArrayList<Endereco> enderecos = new ArrayList<>();

    public Cliente(String nome, String cpf, Contato contatoA, Contato contatoB, Endereco enderecoA, Endereco enderecoB) {
        this.nome = nome;
        this.cpf = cpf;
        contatos.add(contatoA);
        contatos.add(contatoB);

        enderecos.add(enderecoA);
        enderecos.add(enderecoB);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }


    public void imprimirContatos() {
        for (Contato contato : contatos) contato.imprimirContato();
    }

    public void imprmirEnderecos() {
        for (Endereco endereco : enderecos) endereco.imprimirEndereco();
    }

    public void imprimirCliente() {
        System.out.println("Nome: " + nome + "\nCpf: " + cpf);
        imprimirContatos();
        imprmirEnderecos();
    }
}
