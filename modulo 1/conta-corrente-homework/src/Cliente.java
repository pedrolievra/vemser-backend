public class Cliente {
    public String nome;
    public String cpf;
    public Contato[] contatos = new Contato[2];
    public Enderecos[] enderecos = new Enderecos[2];

    public void imprimirCliente() {
        System.out.println("\nCliente: " + nome + "\nCPF: " + cpf);
    }

    public void imprimirEnderecos() {
        for (int i = 0; i < enderecos.length; i++) {
            if (enderecos[i] != null) {
                System.out.println("\n-ENDERECO-");
                enderecos[i].imprimirEndereco();
            } else {
                System.out.println("Endereco " + (i + 1) + " nao esta cadastradp");
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
    }

