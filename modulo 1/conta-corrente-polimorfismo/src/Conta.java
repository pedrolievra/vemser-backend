public class Conta implements Movimentacao{
    private Cliente cliente;
    private String numeroConta;
    private String agencia;
    private double saldo;

    public Conta(Cliente cliente, String numeroConta, String agencia, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public boolean sacar(double valorSaque) {
        if (valorSaque <= this.getSaldo() && valorSaque > 0) {
            this.setSaldo(this.getSaldo() - valorSaque);
            return true;
        }
        return false;
    }
    @Override
    public boolean depositar(double valor) {
        if(valor>0){
            this.setSaldo(this.getSaldo() + valor);
            return true;
        }
        return false;
    }

    @Override
    public boolean transferir(Conta conta, Double valorTransferencia) {
        if(this.sacar(valorTransferencia)){
            conta.depositar(valorTransferencia);
            System.out.println("Foi possivel realizar a transferencia ");
            return true;
        }
        System.out.println("Nao foi possivel realizar a transferencia ");
        return false;
    }

    public Cliente getCliente() {

        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
