public class ContaCorrente extends Conta implements Movimentacao{

    double chequeEspecial;

    @Override
    public void imprimir() {

    }

    public ContaCorrente(Cliente cliente, String numeroDaConta, int agencia, double saldo, double chequeEspecial) {
        super(cliente, numeroDaConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    double retornarSaldoComChequeEspecial() {
        return this.getSaldo() + this.chequeEspecial;
    }

    void setChequeEspecial(double valor){
        this.chequeEspecial = valor;
    }

    boolean sacar(double valorDeSaque) {
        if (chequeEspecial + getSaldo() > valorDeSaque) {
            if (this.getSaldo() >= valorDeSaque && valorDeSaque > 0) {
                double saldo = getSaldo();
                setSaldo(saldo -= valorDeSaque);
                System.out.println("Transferencia realizada");
                return true;
            } else if ((chequeEspecial + getSaldo() >= valorDeSaque && valorDeSaque > 0)) {
                double saldo = getSaldo();
                chequeEspecial -= getSaldo() - valorDeSaque;
                setSaldo(saldo -= valorDeSaque);
                System.out.println("Transferencia realizada com cheque especial");
                return true;
            }
        }
        System.out.println("Transferencia não foi realizada");
        return false;
    }
}