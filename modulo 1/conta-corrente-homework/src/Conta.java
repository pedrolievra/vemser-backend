public class Conta {
    private Cliente cliente = new Cliente();
    private String numeroDaConta;
    private int agencia;
    private double saldo;

    public Conta(Cliente cliente, String numeroDaConta, int agencia, double saldo) {
        this.saldo = saldo;
        this.cliente = cliente;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
