public class ContaPagamento extends Conta implements Impressao{
    static final double TAXA_SAQUE = 4.25;

    public ContaPagamento(Cliente cliente, String agencia, String numeroConta, Double saldo) {
        super(cliente, agencia, numeroConta, saldo);
    }

    @Override
    public void imprimir() {
        this.getCliente().imprimirCliente();
        System.out.println("-CONTA CORRENTE-\nAgência: " + this.getAgencia()
                + "\nNúmero da Conta: " + this.getNumeroConta() + "\nSaldo disponível: " + this.getSaldo()
                + "\n");
        this.getCliente().imprimirContatos();
        this.getCliente().imprimirEnderecos();
        System.out.println("");
    }


    public boolean transferir(Conta conta, double valorTransferencia) {
        if(valorTransferencia <= this.getSaldo() && valorTransferencia > 0) {
            this.setSaldo(this.getSaldo() - valorTransferencia);
            conta.depositar(valorTransferencia);
        }
        return false;
    }

    @Override
    public boolean sacar(double valorSaque) {
        if(this.getSaldo() > valorSaque + TAXA_SAQUE && valorSaque > 0){
            this.setSaldo(this.getSaldo() - valorSaque - TAXA_SAQUE);
            return true;
        }
        return false;
    }
}