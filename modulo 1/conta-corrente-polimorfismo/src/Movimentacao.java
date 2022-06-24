public interface Movimentacao {

    boolean sacar(Double valor);
    boolean depositar(Double valor);
    boolean transferir(Conta conta, Double valor);

}
