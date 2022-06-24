public class ContaPoupanca extends Conta implements  Impressao{
    private static final double JUROS_MENSAIS = 1.01;

    public ContaPoupanca(Cliente cliente, String numeroConta, String agencia, Double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    void creditarTaxa(){
        setSaldo(getSaldo()*JUROS_MENSAIS);
    }


    @Override
    public boolean sacar(Double valor) {
        return false;
    }

    @Override
    public boolean depositar(Double valor) {
        return false;
    }

    @Override
    public boolean transferir(Conta conta, Double valor) {
        return false;
    }

    @Override
    public void imprimir() {
        getCliente().imprimirCliente();
        System.out.println(" Numero da Conta: "+ getNumeroConta() +" Agencia: "+getAgencia()+"Saldo:"+getSaldo());
    }
}
