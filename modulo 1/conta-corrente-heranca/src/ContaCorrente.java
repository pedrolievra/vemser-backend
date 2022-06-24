public class ContaCorrente extends Conta implements Impressao {
    private Double chequeEspecial;

    public ContaCorrente(Cliente cliente, String numeroConta, String agencia, double saldo, double chequeEspecial) {
        super(cliente, numeroConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double retornarSaldoComChequeEspecial() {
        return getSaldo() + chequeEspecial;
    }

    public void setChequeEspecial(double valor) {
        if (valor > 0) {
            chequeEspecial = valor;
        }
    }

    public boolean sacar(Double valor) {
        if(valor>0 && getSaldo()-valor >0 ){
            setSaldo(getSaldo()-valor);
            System.out.println("Foi possivel sacar sem cheque especial");
            return true;
        }
        else if (valor >0 && retornarSaldoComChequeEspecial()-valor>0){
            setSaldo(getSaldo()-valor);
            setChequeEspecial(getSaldo()-valor);
            System.out.println("Saque realizado com cheque especial");
            return true;
        }
        System.out.println("Nao foi possivel sacar mesmo com a utilizacao do cheque especial");
        return false;
    }
}
