public class ContaCorrente extends Conta {
    double chequeEspecial;

    public ContaCorrente(Cliente cliente, String numeroDaConta, int agencia, double saldo, double chequeEspecial){
        super(cliente, numeroDaConta, agencia, saldo);
    }

    void imprimirContaCorrente() {
        System.out.println("--Dados do Cliente--");
        getCliente().imprimirCliente();
        System.out.println(" ");
        getCliente().imprimirEnderecos();
        System.out.println(" ");
        getCliente().imprimirContatos();
        System.out.println("Conta Corrente");
        System.out.println("Numero da Conta: " + getNumeroDaConta());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Valor do Cheque Especial: " + chequeEspecial);
        System.out.println(" ");
    }

    boolean sacar(double valorDeSaque) {
        if (this.getSaldo() >= valorDeSaque && valorDeSaque > 0) {
            double saldo = getSaldo();
            setSaldo(saldo -= valorDeSaque); //incluir cheque especial
            System.out.println("Transferencia realizada");
            return true;
        }
        else if((chequeEspecial+getSaldo()>=valorDeSaque && valorDeSaque>0)) {
            double saldo = getSaldo();
            chequeEspecial -= getSaldo()-valorDeSaque;
            setSaldo(saldo -= valorDeSaque);
            System.out.println("Transferencia realizada com cheque especial");
            return true;
        }
        System.out.println("Transferencia não foi realizada");
        return false;
    }

    boolean depositar(double valorDeDeposito) {
        if (valorDeDeposito > 0) {
            double saldo = getSaldo();
            setSaldo(saldo += valorDeDeposito);
            return true;
        } else {
            System.out.println("Erro ao fazer depósito");
        }
        return false;
    }

    boolean transferir(ContaCorrente contaCorrente, double valorDeTransferencia){

        if(valorDeTransferencia<=this.getSaldo() && valorDeTransferencia>0){
            double saldo = this.getSaldo();
            saldo -= valorDeTransferencia;
            contaCorrente.setSaldo(saldo += valorDeTransferencia);
            System.out.println("Transferencia realizada com sucesso");//tem que ser maior que 0 a transferencia e desconta tbm o saque especial caso seja necessario
            return true;
        }

        else if (this.getSaldo()+chequeEspecial>=valorDeTransferencia && valorDeTransferencia>0){
            this.chequeEspecial += this.getSaldo()-valorDeTransferencia;
            System.out.println(this.getSaldo()-valorDeTransferencia);
            double saldo = this.getSaldo();
            saldo -= valorDeTransferencia;
            contaCorrente.setSaldo(saldo += valorDeTransferencia);
            System.out.println("Transferencia realizada com cheque especial");
            return true;
        }
        System.out.println("Transferencia nao realizada");
        return false;
    }
}
