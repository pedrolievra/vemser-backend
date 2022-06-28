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


    public void sacar(Double valor) {
        if (valor > 0 && getSaldo() - valor > 0) {
            setSaldo(getSaldo() - valor);
            System.out.println("Foi possivel sacar sem cheque especial");
        }
        else if (valor > 0 && retornarSaldoComChequeEspecial() - valor > 0) {
            setSaldo(getSaldo() - valor);
            setChequeEspecial(getSaldo() - valor);
            System.out.println("Saque realizado com cheque especial");
        }
        else {
            System.out.println("Nao foi possivel sacar mesmo com a utilizacao do cheque especial");
        }
    }


    @Override
    public void imprimir() {
        System.out.println("Cliente: ");
        getCliente().imprimirCliente();
        System.out.println("\nNumero da Conta: " + getNumeroConta() + "\nAgencia: " + getAgencia() + "\nSaldo:" + getSaldo() + "\nCheque Especial: " + chequeEspecial);
    }
}
