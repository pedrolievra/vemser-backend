public class Main {
    public static void main(String[] args) {
// CONTATOS PEDRO
        Contato contatoA = new Contato();
        contatoA.descricao = "Pedro Victor";
        contatoA.telefone = "92 9 9256-0714";
        contatoA.tipo = 1;

        Contato contatoB = new Contato();
        contatoB.descricao = "Pedro Oliveira";
        contatoB.telefone = "92 9 9219-0756";
        contatoB.tipo = 2;
//CONTATOS MATHEUS
        Contato contatoC = new Contato();
        contatoC.descricao = "Matheus Uchôa";
        contatoC.telefone = "92 9 9256-0714";
        contatoC.tipo = 1;

        Contato contatoD = new Contato();
        contatoD.descricao = "Matheus Serrão Uchôa";
        contatoD.telefone = "92 9 9219-0756";
        contatoD.tipo = 2;
//ENDERECOS PEDRO
        Endereco enderecoA = new Endereco();
        enderecoA.pais = "Brasil";
        enderecoA.estado = "Amazonas";
        enderecoA.tipo = 1;
        enderecoA.cep = "68740-453";
        enderecoA.complemento = "Em frente a Igrejinha Deus eh Amor";
        enderecoA.numero = 8;
        enderecoA.cidade = "Manaus";
        enderecoA.logradouro = "Rua Jasmim";

        Endereco enderecoB = new Endereco();
        enderecoB.pais = "Brasil";
        enderecoB.estado = "Amazonas";
        enderecoB.tipo = 2;
        enderecoB.cep = "68087-453";
        enderecoB.complemento = "Em frente a Bar 2 Irmaos";
        enderecoB.numero =69;
        enderecoB.cidade = "Manaus";
        enderecoB.logradouro = "Rua das Rosas";

//ENDERECOS MATHEUS

        Endereco enderecoC = new Endereco();
        enderecoC.pais = "Brasil";
        enderecoC.estado = "Amazonas";
        enderecoC.tipo = 2;
        enderecoC.cep = "68087-453";
        enderecoC.complemento = "Em frente a Escola Bare";
        enderecoC.numero =69;
        enderecoC.cidade = "Manaus";
        enderecoC.logradouro = "Rua das Rosas";

        Endereco enderecoD = new Endereco();
        enderecoD.pais = "Brasil";
        enderecoD.estado = "Amazonas";
        enderecoD.tipo = 1;
        enderecoD.cep = "68087-453";
        enderecoD.complemento = "Na esquina com CETAM";
        enderecoD.numero =69;
        enderecoD.cidade = "Manaus";
        enderecoD.logradouro = "Rua das Rosas";

        Cliente pedro = new Cliente();
        pedro.contatos[0] = contatoA;
        pedro.contatos[1] = contatoB;
        pedro.enderecos[0] = enderecoA;
        pedro.enderecos[1] = enderecoB;
        pedro.nome = "Pedro Victor";
        pedro.cpf = "089.435.235-56";


        Cliente matheus = new Cliente();
        matheus.contatos[0] = contatoC;
        matheus.contatos[1] = contatoD;
        matheus.enderecos[0] = enderecoC;
        matheus.enderecos[1] = enderecoD;
        matheus.nome = "Matheus Uchôa";
        matheus.cpf = "012.345.901-12";


        ContaCorrente pedroConta = new ContaCorrente();
        pedroConta.cliente = pedro;
        pedroConta.numeroDaConta = "34879";
        pedroConta.agencia = 1;
        pedroConta.saldo = 200;
        pedroConta.chequeEspecial = 200;

        ContaCorrente matheusConta = new ContaCorrente();
        matheusConta.cliente = matheus;
        matheusConta.numeroDaConta = "34879";
        matheusConta.agencia = 1;
        matheusConta.saldo = 400;
        matheusConta.chequeEspecial = 200;

// transferencia:
        pedroConta.imprimirContaCorrente();
        matheusConta.imprimirContaCorrente();
        pedroConta.transferir(matheusConta,  300);
        pedroConta.imprimirContaCorrente();
        matheusConta.imprimirContaCorrente();


//falta sacar, depositar e retornar o valor do cheque especial
    }
}
