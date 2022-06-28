public abstract class  Conta implements Movimentacao{
    private Cliente cliente;
    private String numeroConta;
    private String agencia;
    private double saldo;

    public Conta(Cliente cliente, String numeroConta, String agencia, Double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
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

    @Override
    public void depositar(Double valor) {
        if(valor>0){
            setSaldo(getSaldo()+valor);
            System.out.println("Deposito realizado com sucesso");
            return;
        }
        System.out.println("Deposito nao foi realizado");
    }

    @Override
    public void sacar(Double valor) {
        if(valor>0 && getSaldo()-valor >0 ){
            setSaldo(getSaldo()-valor);
            System.out.println("Foi possivel sacar sem cheque especial");
        }
    }

    @Override
    public void transferir(Conta conta, Double valor) {
        System.out.println("Tranferencia realizada sem cheque");
        if (valor>0 && getSaldo()-valor >0 ){
            this.sacar(getSaldo()-valor);
            conta.depositar(conta.getSaldo()+valor);
        }
    }
}
