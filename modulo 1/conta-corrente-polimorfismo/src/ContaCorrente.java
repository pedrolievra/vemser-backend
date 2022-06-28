public class ContaCorrente extends Conta implements Impressao{

    private Double chequeEspecial;

    public ContaCorrente(Cliente cliente, String agencia, String numeroConta, Double saldo, Double chequeEspecial){
        super(cliente, agencia, numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;
    }
    public double retornarSaldoComChequeEspecial(){
        return this.getSaldo() + this.chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.retornarSaldoComChequeEspecial() && valor>0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void imprimir() {
        System.out.println("Cliente:");
        this.getCliente().imprimirCliente();
        System.out.println("Dados da Conta Corrente");
        System.out.println("Agência: " + this.getAgencia() + "\nConta: " + this.getNumeroConta()
                + "\nSaldo da conta: "+ this.getSaldo() + "\nCheque Especial: " + this.chequeEspecial);
        System.out.println("");
        this.getCliente().imprimirContatos();
        this.getCliente().imprimirEnderecos();
    }
}


