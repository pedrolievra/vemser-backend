public interface Movimentacao {

    void sacar(Double valor);
    void depositar(Double valor);
    void transferir(Conta conta, Double valor);
}
