public interface Movimentacao {
     boolean sacar(double valor);
     boolean depositar(double);
     boolean transferir(Conta conta, double valor);
}
