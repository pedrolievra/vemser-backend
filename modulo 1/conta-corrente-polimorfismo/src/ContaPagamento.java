public class ContaPagamento extends Conta implements Impressao {
    private static final double TAXA_DE_SAQUE = 4.25;

    public ContaPagamento(Cliente cliente, String numeroConta, String agencia, Double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    @Override
    public void sacar(Double valor) {
        if (this.getSaldo() >= valor + TAXA_DE_SAQUE && valor > 0) {
            setSaldo(getSaldo() - TAXA_DE_SAQUE - valor);
        } else {
            System.out.println("Saque não realizado, valor invalido");
        }
    }

    @Override
    public void imprimir() {
        getCliente().imprimirCliente();
        System.out.println("da Conta: "+ getNumeroConta() +"Agencia: "+getAgencia()+"Saldo:"+getSaldo());
    }

}
