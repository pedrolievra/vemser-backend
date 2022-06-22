public class Main {
    public static void main(String[] args) {

        Contato contatoA = new Contato();
        contatoA.descricao = "Pedro Victor";
        contatoA.telefone = "92 9 9256-0714";
        contatoA.tipo = 1;

        Contato contatoB = new Contato();
        contatoB.descricao = "Matheus Uchôa (Amor)";
        contatoB.telefone = "92 9 9219-0756";
        contatoB.tipo = 2;

        Endereco enderecoA = new Endereco();
        enderecoA.pais = "Brasil";
        enderecoA.estado = "Amazonas";
        enderecoA.tipo = 1;
        enderecoA.cep = "68740-453";
        enderecoA.complemento = "Em frente a Igrejinha";
        enderecoA.numero = 8;
        enderecoA.cidade = "Manaus";
        enderecoA.logradouro = "Rua Jasmim";

        Endereco enderecoB = new Endereco();
        enderecoB.pais = "Brasil";
        enderecoB.estado = "Amazonas";
        enderecoB.tipo = 1;
        enderecoB.cep = "68087-453";
        enderecoB.complemento = "Em frente a Barzin";
        enderecoB.numero =69;
        enderecoB.cidade = "Manaus";
        enderecoB.logradouro = "Rua das Rosas";

        Cliente pedro = new Cliente();
        pedro.contatos[0] = contatoA;
        pedro.contatos[1] = contatoB;
        pedro.enderecos[0] = enderecoA;
        pedro.enderecos[1] = enderecoB;
        pedro.nome = "Pedro Victor";
        pedro.cpf = "089.435.235-56";


        Cliente matheus = new Cliente();
        matheus.contatos[0] = contatoA;
        matheus.contatos[1] = contatoB;
        matheus.enderecos[0] = enderecoA;
        matheus.enderecos[1] = enderecoB;
        matheus.nome = "Matheus Uchôa";
        matheus.cpf = "012.345.901-12";


    ContaCorrente pedroConta = new ContaCorrente();
    pedroConta.cliente = pedro;
    pedroConta.numeroDaConta = "34879";
    pedroConta.agencia = 1;
    pedroConta.saldo = 100000;
    pedroConta.chequeEspecial = 2999;

        ContaCorrente matheusConta = new ContaCorrente();
        matheusConta.cliente = pedro;
        matheusConta.numeroDaConta = "34879";
        matheusConta.agencia = 1;
        matheusConta.saldo = 100000;
        matheusConta.chequeEspecial = 299999999;

// transferencia:
    pedroConta.transferir(matheusConta, 5000);

    pedroConta.imprimirContaCorrente();
    matheusConta.imprimirContaCorrente();

    }
}
