public class ContaCorrente extends Conta implements Impressao {
    private Double chequeEspecial;

    public ContaCorrente(Cliente cliente, String numeroConta, String agencia, Double saldo, Double chequeEspecial) {
        super(cliente, numeroConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double retornarSaldoComChequeEspecial() {
        if (getSaldo() >= 0) {
            return chequeEspecial;
        }
        return this.getSaldo() + chequeEspecial;
    }

    public void setChequeEspecial(Double valor) {
        if (valor > 0) {
            chequeEspecial = valor;
        }
    }


    public boolean sacar(Double valor) {
        if (valor > 0 && getSaldo() - valor > 0) {
            setSaldo(getSaldo() - valor);
            System.out.println("Foi possivel sacar sem cheque especial");
            return true;
        }
        if (valor > 0 && retornarSaldoComChequeEspecial() - valor > 0) {
            setSaldo(getSaldo() - valor);
            setChequeEspecial(getSaldo() - valor);
            System.out.println("Saque realizado com cheque especial");
            return true;
        }
        System.out.println("Nao foi possivel sacar mesmo com a utilizacao do cheque especial");
        return false;
    }

    @Override
    public boolean depositar(Double valor) {
        return false;
    }

    @Override
    public boolean transferir(Conta conta, Double valor) {
        if (valor > 0 && getSaldo() - valor > 0) {
            this.setSaldo(getSaldo() - valor);
            conta.setSaldo(conta.getSaldo() + valor);

            System.out.println("Tranferencia realizada sem cheque");
            return true;

        }
        if (valor > 0 &&  retornarSaldoComChequeEspecial() - valor > 0) {
            this.setSaldo(getSaldo() - valor);
            chequeEspecial += getSaldo() - valor;
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Tranferencia realizada com cheque");
            return true;
        }
        System.out.println("Tranferencia nao realizada");

        return false;
    }


    @Override
    public void imprimir() {
        System.out.println("Cliente: ");
        getCliente().imprimirCliente();
        System.out.println("Numero da Conta: " + getNumeroConta() + " Agencia: " + getAgencia() + " Saldo:" + getSaldo() + " Cheque Especial: " + chequeEspecial);
    }
}
