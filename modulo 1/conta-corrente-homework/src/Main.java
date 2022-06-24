public class Main {
    public static void main(String[] args) {
// CONTATOS PEDRO
        Contato contatoA = new Contato("Pedro Victor", "92 99276-0846", 1);
        Contato contatoB = new Contato( "Pedro Oliveira", "92 9 9219-0756", 2);
//Contatos Matheus
        Contato contatoC = new Contato("Matheus Uchôa", "92 9 9256-0714", 1);
        Contato contatoD = new Contato("Matheus Serrão Uchôa","92 9 9219-0756", 2);

//ENDERECOS PEDRO
        Endereco enderecoA = new Endereco(1, "Rua Jasmim", 8,"Em frente a Igrejinha Deus eh Amor", "68740-453", "Manaus", "Amazonas", "Brasil");
        Endereco enderecoB = new Endereco(2, "Rua das Rosas", 71,"Em frente a Bar 2 Irmaos", "68087-453", "Manaus", "Amazonas", "Brasil");
//Cliente Pedro
        Cliente pedro = new Cliente("Pedro Victor", "089.435.235-56", contatoA, enderecoA);
//Cliente Matheus
        Cliente matheus = new Cliente("Matheus Uchôa", "012.345.901-12", contatoB, enderecoB);
//ContaCorrente Pedro
        ContaCorrente pedroConta = new ContaCorrente(pedro, "34879", 1, 200, 100);
//ContaCorrente Matheus
        ContaCorrente matheusConta = new ContaCorrente(matheus, "41879", 1, 200, 50);

// transferencia:
        pedroConta.imprimirContaCorrente();
        matheusConta.imprimirContaCorrente();
        pedroConta.transferir(matheusConta,  300);
        pedroConta.imprimirContaCorrente();
        matheusConta.imprimirContaCorrente();


//falta sacar, depositar e retornar o valor do cheque especial
    }
}
