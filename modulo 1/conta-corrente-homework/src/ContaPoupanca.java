public class ContaPoupanca extends Conta{
    static final double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numeroDaConta, int agencia, double saldo){
        super(cliente, numeroDaConta, agencia, saldo);
    }

    public void creditarTaxa(){
        setSaldo(getSaldo()*JUROS_MENSAL);
    }
}
