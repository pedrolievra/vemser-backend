public class Main {
    public static void main(String[] args) {

        //endereços
        Enderecos enderecoMatheus = new Enderecos();
        enderecoMatheus.cep = "704567-303";
        enderecoMatheus.cidade = "Manaus";
        enderecoMatheus.complemento = "Proximo ao CETAM";
        enderecoMatheus.estado = "Amazonas";
        enderecoMatheus.logradouro = "Rua Cosmos";
        enderecoMatheus.numero = 9;
        enderecoMatheus.tipo = 1;
        enderecoMatheus.pais = "Brasil";

        Enderecos enderecoMatheusB = new Enderecos();
        enderecoMatheusB.cep = "905567-303";
        enderecoMatheusB.cidade = "Manaus";
        enderecoMatheusB.complemento = "Na ladeira";
        enderecoMatheusB.estado = "Amazonas";
        enderecoMatheusB.logradouro = "Rua Hiperbole";
        enderecoMatheusB.numero = 89;
        enderecoMatheusB.tipo = 2;
        enderecoMatheusB.pais = "Brasil";

        Enderecos enderecoPedro = new Enderecos();
        enderecoPedro.cep = "549567-303";
        enderecoPedro.cidade = "Manaus";
        enderecoPedro.complemento = "Na esquina com a Igreja";
        enderecoPedro.estado = "Amazonas";
        enderecoPedro.logradouro = "Rua Galaxia";
        enderecoPedro.numero = 49;
        enderecoPedro.tipo = 2;
        enderecoPedro.pais = "Brasil";

        Enderecos enderecoPedroB = new Enderecos();
        enderecoPedroB.cep = "945567-303";
        enderecoPedroB.cidade = "Manaus";
        enderecoPedroB.complemento = "Na estancia";
        enderecoPedroB.estado = "Amazonas";
        enderecoPedroB.logradouro = "Rua Above";
        enderecoPedroB.numero = 11;
        enderecoPedroB.tipo = 1;
        enderecoPedroB.pais = "Brasil";

        //contatos
        Contato contatoMatheus = new Contato();
        contatoMatheus.tipo = 1;
        contatoMatheus.descricao = "Somente Whatsapp";
        contatoMatheus.telefone = "9 9456-7890";

        Contato contatoMatheusB = new Contato();
        contatoMatheusB.tipo = 2;
        contatoMatheusB.descricao = "Somente secretaria eletronica";
        contatoMatheusB.telefone = "4002 8922";

        Contato contatoPedro =  new Contato();
        contatoPedro.telefone = "9 8245-5409";
        contatoPedro.descricao = "Somente ligacoes";
        contatoPedro.tipo = 1;

        Contato contatoPedroB =  new Contato();
        contatoPedroB.telefone = "9 3245-5409";
        contatoPedroB.descricao = "Atendo as 08h";
        contatoPedroB.tipo = 2;

        // clientes
        Cliente pedro = new Cliente();
        pedro.contatos[0] = contatoPedro;
        pedro.contatos[1] = contatoPedroB;
        pedro.enderecos[0] = enderecoPedroB;
        pedro.enderecos[1] = enderecoPedro;
        pedro.nome = "Pedro Victor";
        pedro.cpf = "049.541.903-19";

        Cliente matheus = new Cliente();
        matheus.contatos[0] = contatoMatheus;
        matheus.enderecos[0] = enderecoMatheusB;
        matheus.contatos[1] = contatoMatheusB;
        matheus.enderecos[1] = enderecoMatheus;
        matheus.nome = "Matheus Serrao";
        matheus.cpf = "034.651.706-14";

        //conta corrente
        ContaCorrente contaPedro = new ContaCorrente();
        contaPedro.cliente = pedro;
        contaPedro.chequeEspecial = 100;
        contaPedro.saldo = 300;
        contaPedro.agencia = "Banco do Brasil";
        contaPedro.numeroConta = "132465-9";

        ContaCorrente contaMatheus = new ContaCorrente();
        contaMatheus.cliente = matheus;
        contaMatheus.chequeEspecial = 200;
        contaMatheus.saldo = 350;
        contaMatheus.agencia = "Santander";
        contaMatheus.numeroConta = "978645-3";

        System.out.println("CLIENTES: ");
        pedro.imprimirCliente();
        pedro.imprimirContatos();
        pedro.imprimirEnderecos();
        contaPedro.imprimirConta();

        System.out.println("==================");
        matheus.imprimirCliente();
        matheus.imprimirContatos();
        matheus.imprimirEnderecos();
        contaMatheus.imprimirConta();

        //saque------------------
        System.out.println("\n------SAQUE-------");

        //metodos invalidos
        contaMatheus.sacar(0);
        contaMatheus.sacar(10000);
        contaPedro.sacar(-10);

        //metodos validos
        contaMatheus.sacar(100);
        contaPedro.sacar(400);

        System.out.println("\nCONTAS APOS SAQUE:");
        contaMatheus.imprimirConta();
        contaMatheus.retornoSaldoComChequeEspecial();
        contaPedro.imprimirConta();
        contaPedro.retornoSaldoComChequeEspecial();

       //deposito-------------------
        System.out.println("\nACOES BANCARIAS:");
        System.out.println("------DEPOSITO--------");

        //metodos invalidos
        contaMatheus.depositar(0);
        contaMatheus.depositar(-30);

        //metodos validos

        contaPedro.depositar(20);
        contaMatheus.depositar(50);
        System.out.println("\nCONTAS APOS DEPOSITO:");
        contaPedro.imprimirConta();
        contaPedro.retornoSaldoComChequeEspecial();
        contaMatheus.imprimirConta();
        contaMatheus.retornoSaldoComChequeEspecial();


        //transferencia--------------------
        System.out.println("\n-----TRANSFERENCIA-------");

        //metodos invalidos
        contaMatheus.imprimirConta();
        contaMatheus.transferir(contaPedro, 2000);
        contaPedro.transferir(contaMatheus, 0);
        contaMatheus.transferir(contaPedro, -100);

        //metodos validos
        contaMatheus.transferir(contaPedro, 100);

        System.out.println("\nCONTAS APOS TRANSFERENCIA:");
        contaMatheus.imprimirConta();
        contaMatheus.retornoSaldoComChequeEspecial();
        contaPedro.imprimirConta();
        contaPedro.retornoSaldoComChequeEspecial();
    }
}
