public class Main {
    public static void main(String[] args) {
        Contato contatoA = new Contato("Disponivel ate as 23 horas", "912318972", 2);
        Contato contatoB = new Contato("Disponivel ate as 20 horas", "123616287", 2);

        Endereco enderecoA = new Endereco(2, "Rua Taumautugo Vaz", 346, "cetam", "69070760", "Manaus", "Amazonas", "Brasil");
        Endereco enderecoB = new Endereco(1, "Rua ZL", 346, "cetam", "69070760", "Manaus", "Amazonas", "Brasil");

        Cliente matheus = new Cliente("Matheus", "126376182-73", contatoA, contatoB, enderecoA, enderecoB);
        Cliente pedro = new Cliente("Pedro", "34537231231-23", contatoB, contatoA, enderecoB, enderecoA);
        Cliente maria = new Cliente("Maria", "34537231231-23", contatoB, contatoA, enderecoB, enderecoA);


        ContaCorrente contaCorrenteMatheus = new ContaCorrente(matheus, "92732", "Itau", 400.0, 200.0);
        ContaCorrente contaCorrentePedro = new ContaCorrente(pedro, "92735", "Itau", 400.0, 200.0);
        ContaPoupanca contaPoupancaMaria = new ContaPoupanca(maria, "92735", "NUBANK ", 400);

        contaCorrentePedro.sacar(100.00);
        contaCorrenteMatheus.sacar(100.00);

        contaPoupancaMaria.imprimir();
        contaPoupancaMaria.sacar(600.00);
        contaPoupancaMaria.imprimir();


        contaCorrenteMatheus.imprimir();
        contaCorrentePedro.imprimir();
        contaCorrentePedro.transferir(contaCorrenteMatheus,100.0);

        contaCorrentePedro.imprimir();
        contaCorrentePedro.depositar(100.0);
        contaCorrenteMatheus.imprimir();
        contaCorrenteMatheus.depositar(100.0);

    }
}
