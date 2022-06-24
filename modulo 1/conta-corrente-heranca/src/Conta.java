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

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean depositar(Double valor) {
        System.out.println("DEPOSITO");
        if(valor>=0){
            System.out.println("Deposito realizado com sucesso");
            setSaldo(getSaldo()+valor);
            this.saldo += saldo +valor;
            return true;
        }
        System.out.println("Deposito nao realizado");

        return false;
    }

    @Override
    public boolean sacar(Double valor) {
        System.out.println("SAQUE");
        if(valor>=0 && this.getSaldo()-valor >= 0 ){
            setSaldo(getSaldo()-valor);
            System.out.println("Foi possivel sacar ");
            return true;
        }
        System.out.println("Nao foi possivel sacar");
        return false;
    }

    @Override
    public boolean transferir(Conta conta, Double valor) {
        System.out.println("TRANSFERENCIA");
        System.out.println("Tranferencia realizada sem cheque");
        if (valor>=0 && getSaldo()-valor >= 0 ){
            this.setSaldo(getSaldo()-valor);
            conta.setSaldo(conta.getSaldo()+valor);
            return  true;
        }
        return false;
    }
}
