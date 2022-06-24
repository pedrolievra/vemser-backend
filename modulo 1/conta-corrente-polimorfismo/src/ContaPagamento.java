public class ContaPagamento extends Conta implements Impressao {
    private static final double TAXA_DE_SAQUE = 4.25;

    public ContaPagamento(Cliente cliente, String numeroConta, String agencia, Double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }


    @Override
    public boolean sacar(Double valor) {
        if (this.getSaldo()>=valor+TAXA_DE_SAQUE && valor>0){
            setSaldo(getSaldo()-TAXA_DE_SAQUE-valor);
            return true;
        }
        System.out.println("Transferencia não realizada, valor invalido");
        return false;
    }

    @Override
    public void imprimir() {
        getCliente().imprimirCliente();
        System.out.println("\nda Conta: "+ getNumeroConta() +"\nAgencia: "+getAgencia()+"\nSaldo:"+getSaldo());
    }

}
