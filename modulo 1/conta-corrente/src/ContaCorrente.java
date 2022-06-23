public class ContaCorrente {
    Cliente cliente = new Cliente();
    String numeroDaConta;
    int agencia;
    double saldo;
    double chequeEspecial;

    void imprimirContaCorrente() {
        System.out.println("--Dados do Cliente--");
        cliente.imprimirCliente();
        System.out.println("");
        cliente.imprimirEnderecos();
        System.out.println("");
        cliente.imprimirContatos();
        System.out.println("Conta Corrente");
        System.out.println("Numero da Conta: " + numeroDaConta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Valor do Cheque Especial: " + chequeEspecial);
        System.out.println(" ");
    }

    boolean sacar(double valorDeSaque) {
        if (this.saldo >= valorDeSaque && valorDeSaque > 0) {
            this.saldo -= valorDeSaque; //incluir cheque especial
            System.out.println("Transferencia realizada");
            return true;
        }
        else if((chequeEspecial+saldo)>=valorDeSaque && valorDeSaque>0) {
        chequeEspecial -= saldo-valorDeSaque;
        saldo -= valorDeSaque;
            System.out.println("Transferencia realizada com cheque especial");
        return true;
        }
        System.out.println("Transferencia não foi realizada");
        return false;
    }

    boolean depositar(double valorDeDeposito) {
        if (valorDeDeposito > 0) {
            this.saldo += valorDeDeposito;
            return true;
        } else {
            System.out.println("Erro ao fazer depósito");
        }
        return false;
    }


    boolean transferir(ContaCorrente contaCorrente, double valorDeTransferencia){

        if(valorDeTransferencia<=this.saldo && valorDeTransferencia>0){
            this.saldo -= valorDeTransferencia;
            contaCorrente.saldo += valorDeTransferencia;
            System.out.println("Transferencia realizada com sucesso");//tem que ser maior que 0 a transferencia e desconta tbm o saque especial caso seja necessario
            return true;
        }

        else if (this.saldo+chequeEspecial>=valorDeTransferencia && valorDeTransferencia>0){
            this.chequeEspecial += this.saldo-valorDeTransferencia;
            System.out.println(this.saldo-valorDeTransferencia);
            this.saldo -= valorDeTransferencia;
            contaCorrente.saldo += valorDeTransferencia;
            System.out.println("Transferencia realizada com cheque especial");
            return true;
        }
        System.out.println("Transferencia nao realizada");
        return false;
    }
}
