import java.util.ArrayList;

public class Cliente {
    public String nome;
    public String cpf;
    private ArrayList<Enderecos> enderecos = new ArrayList<>();
    private ArrayList<Contato> contatos = new ArrayList<>();

    public Cliente(String nome, String cpf, Contato contatos1,
                   Contato contatos2, Enderecos endereco1, Enderecos endereco2) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos.add(contatos1);
        this.contatos.add(contatos2);
        this.enderecos.add(endereco1);
        this.enderecos.add(endereco2);
    }

    public void imprimirCliente() {
        System.out.println("Cliente: " + this.nome + "\nCPF: " + this.cpf);
    }

    public void imprimirEnderecos() {
        for (int i = 0; i < enderecos.size(); i++) {
            if (enderecos.get(i) != null) {
                System.out.println("\n-ENDERECO-");
                enderecos.get(i).imprimirEndereco();
            }
            }
        }

    public void imprimirContatos () {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i) != null) {
                System.out.println("\n-CONTATO-");
                contatos.get(i).imprimirContato();
            }
        }
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

    public ArrayList<Enderecos> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Enderecos> enderecos) {
        this.enderecos = enderecos;
    }

    public ArrayList<Contato> getContatos() {
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
}

