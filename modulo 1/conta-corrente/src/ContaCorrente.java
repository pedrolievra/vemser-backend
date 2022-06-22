public class ContaCorrente {
    Cliente cliente = new Cliente();
    String numeroDaConta;
    int agencia;
    double saldo;
    double chequeEspecial;

    void imprimirContaCorrente(){
        System.out.println(" ");
        System.out.println("==Dados do Cliente==");
        cliente.imprimirCliente();
        System.out.println("Endereco:");
        cliente.imprimirEnderecos();
        System.out.println("Contato:");
        cliente.imprimirContatos();
        System.out.println("==Conta Corrente==");
        System.out.println("Numero da Conta: " + numeroDaConta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Valor do Cheque Especial: " + chequeEspecial);
        System.out.println(" ");
    }

    boolean sacar(double valorDeSaque){
        if (saldo>=valorDeSaque){
            saldo-=valorDeSaque;
            return true;

        }
        return false;
    }

    boolean depositar(double valorDeDeposito){
        saldo += valorDeDeposito;
        return true;
    }

    double retornarSaqueComChequeEspecial(){
        saldo += chequeEspecial;
        return saldo;
    }

    boolean transferir(ContaCorrente contaCorrente, double valorDeTransferencia){
        if(valorDeTransferencia<=this.saldo){
            this.saldo -= valorDeTransferencia;
            contaCorrente.saldo += valorDeTransferencia;
            return true;
        }
        return false;
    }
}
