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
    public boolean depositar(Double valor) {
        if(valor>0){
            this.saldo += saldo +valor;
        }
        return false;
    }

    @Override
    public boolean sacar(Double valor) {
        if(valor>0 && getSaldo()-valor >0 ){
            setSaldo(getSaldo()-valor);
            System.out.println("Foi possivel sacar sem cheque especial");
            return true;
        }
        return false;
    }

    @Override
    public boolean transferir(Conta conta, Double valor) {
        System.out.println("Tranferencia realizada sem cheque");
        if (valor>0 && getSaldo()-valor >0 ){
            this.setSaldo(getSaldo()-valor);
            conta.setSaldo(conta.getSaldo()+valor);
            return  true;
        }
        return false;
    }
}
