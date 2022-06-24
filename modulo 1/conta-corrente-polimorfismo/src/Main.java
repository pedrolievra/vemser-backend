public class Main {
    public static void main(String[] args) {
        Contato contatoA = new Contato("Disponivel ate as 23 horas", "9123165", 2);
        Contato contatoB = new Contato("Disponivel ate as 20 horas", "92352356", 2);

        Endereco enderecoA = new Endereco(2, "Rua taumautugo baz", 107, "Feirinha", "69070760", "Manaus", "Amazonas", "Brasil");
        Endereco enderecoB = new Endereco(1, "Rua ZL", 346, "cetam", "69070760", "Manaus", "Amazonas", "Brasil");

        Cliente matheus = new Cliente("Matheus", "126376182-01", contatoA, contatoB, enderecoA, enderecoB);
        Cliente pedro = new Cliente("Pedro", "546372312-01", contatoB, contatoA, enderecoB, enderecoA);


        ContaCorrente contaCorrenteMatheus = new ContaCorrente(matheus, "92732", "Itau", 400.0, 200.0);
        ContaPagamento contaPagamentoMatheus    = new ContaPagamento(matheus, "92735", "Itau", 400.0);
        ContaPoupanca contaPoupancaPedro = new ContaPoupanca(pedro, "21456", "Bradesco", 230.00);


        contaPagamentoMatheus.sacar(100.00);
        contaCorrenteMatheus.sacar(100.00);
        contaCorrenteMatheus.imprimir();
        contaPagamentoMatheus.imprimir();


        contaPoupancaPedro.sacar(600.00);
        contaPoupancaPedro.imprimir();


        contaPagamentoMatheus.transferir(contaCorrenteMatheus,100.0);
        contaCorrenteMatheus.imprimir();
        contaPagamentoMatheus.imprimir();

        contaPoupancaPedro.sacar(0.0);
        contaPoupancaPedro.imprimir();

        contaPagamentoMatheus.depositar(100.0);
        contaPagamentoMatheus.imprimir();
        contaCorrenteMatheus.depositar(100.0);
        contaCorrenteMatheus.imprimir();


    }
}
