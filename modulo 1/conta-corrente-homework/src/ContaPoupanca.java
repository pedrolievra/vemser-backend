public class ContaPoupanca extends Conta implements Movimentacao{
    static final double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numeroDaConta, int agencia, double saldo){
        super(cliente, numeroDaConta, agencia, saldo);
    }

    public void creditarTaxa(){
       double saldoComJuros = this.getSaldo() ;
        saldoComJuros *=JUROS_MENSAL;
    }

    @Override
    public void imprimir() {

    }
}
