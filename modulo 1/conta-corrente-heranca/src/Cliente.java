public class Cliente {
    public String nome;
    public String cpf;
    public Contato[] contatos = new Contato[2];
    public Enderecos[] enderecos = new Enderecos[2];

    public Cliente(String nome, String cpf, Contato contatos1,
                   Contato contatos2, Enderecos endereco1, Enderecos endereco2) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos[0] = contatos1;
        this.contatos[1] = contatos2;
        this.enderecos[0] = endereco1;
        this.enderecos[1] = endereco2;
    }

    public void imprimirCliente() {
        System.out.println("Cliente: " + nome + "\nCPF: " + cpf);
    }

    public void imprimirEnderecos() {
        for (int i = 0; i < enderecos.length; i++) {
            if (enderecos[i] != null) {
                System.out.println("\n-ENDERECO-");
                enderecos[i].imprimirEndereco();
                System.out.println("");
            } else {
                System.out.println("Endereco " + (i + 1) + " nao esta cadastrado");
            }
        }
    }
        public void imprimirContatos () {
            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i] != null) {
                    System.out.println("\n-CONTATO-");
                    contatos[i].imprimirContato();
                } else {
                    System.out.println("Contato " + (i + 1) + " nao esta cadastrado");
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

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Enderecos[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Enderecos[] enderecos) {
        this.enderecos = enderecos;
    }
}

