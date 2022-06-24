public class Cliente {
    private String nome;
    private String cpf;
    private Contato[] contatos = new Contato[2];
    private Endereco[] enderecos = new Endereco[2];

    public Cliente(String nome, String cpf, Contato contatoA,Contato contatoB, Endereco enderecoA,Endereco enderecoB) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos[0] = contatoA;
        this.contatos[1] = contatoA;

        this.enderecos[0] = enderecoA;
        this.enderecos[1] = enderecoB;
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

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }



    public void imprimirContatos(){
        for (int i=0; i <= contatos.length;i++) contatos[i].imprimirContato();
    }

    public void imprmirEnderecos(){
        for (int i=0; i <= enderecos.length;i++) enderecos[i].imprimirEndereco();
    }

    public void imprimirCliente() {
        System.out.println("Nome: "+nome+" Cpf: "+cpf);
    }
}
