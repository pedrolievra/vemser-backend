public class ContaPoupanca extends Conta implements Impressao{
    public static final double JUROS_MENSAIS = 1.01;

    public ContaPoupanca(Cliente cliente, String agencia, String numeroDaConta, Double saldo){
        super(cliente, agencia, numeroDaConta, saldo);
    }

    public void creditarTaxa(){
        this.setSaldo(getSaldo() * JUROS_MENSAIS);
    }

    @Override
    public void imprimir() {
        this.getCliente().imprimirCliente();
        System.out.println("-CONTA POUPANÇA-\nAgência: " + this.getAgencia() + "\nConta: " + this.getNumeroConta() + "\nSaldo: " + this.getSaldo());
        System.out.println("");
        this.getCliente().imprimirContatos();
        this.getCliente().imprimirEnderecos();
        System.out.println("");
    }
}
