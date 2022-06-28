public class Main {
    public static void main(String[] args) {

        Contato contatoPedro1 = new Contato("Somente Telegram", "29 92924904", 1);
        Contato contatoPedro2 = new Contato("Apenas Ligacoes", "11 2345-3552", 2);
        Enderecos enderecoPedro1 = new Enderecos(1, "Rua Jacunda", "Proximo ao Baratao da Carne",
                "69087-202", "Manaus", "Amazonas", "Brasil", 9);
        Enderecos enderecoPedro2 = new Enderecos(2, "Rua Criciuma", "Proximo ao Ideal",
                "09190-245", "Presidente Figueiredo", "Amazonas", "Brasil", 200);
        Contato contatoMatheus1 = new Contato("Somente Viber", "91 92921111", 1);
        Contato contatoMatheus2 = new Contato("Apenas presencialmente", "11 4445-3544", 2);
        Enderecos enderecoMatheus1 = new Enderecos(1, "Rua Jacunda", "Proximo ao CETAM",
                "55087-202", "Anori", "Amazonas", "Brasil", 1000);
        Enderecos enderecoMatheus2 = new Enderecos(2, "Rua Criciuma", "Perto da Praia",
                "77190-245", "Boca do Acre", "Amazonas", "Brasil", 2001);
        Cliente matheus = new Cliente("Matheus", "12345567", contatoMatheus1, contatoMatheus2, enderecoMatheus1, enderecoMatheus2);
        Cliente pedro = new Cliente("Pedro", "098765432", contatoPedro1, contatoPedro2, enderecoPedro1, enderecoPedro2);
        ContaPagamento contaPagamentoPedro = new ContaPagamento(pedro, "6765", "7886510", 400.0);
        ContaCorrente contaPedro = new ContaCorrente(pedro, "9010", "7272", 15500.0, 44400.0);
        ContaPoupanca contaMatheus = new ContaPoupanca(matheus, "7878", "1432", 50000.0);

        System.out.println("CLIENTES: ");
        contaMatheus.imprimir();
        contaPedro.imprimir();

        //saque------------------
        System.out.println("\n\n------SAQUE-------");
        System.out.println("\n-Conta Corrente-");
        System.out.println("\nOperação inválida: " + contaPedro.sacar(5000));
        System.out.println("\nSaldo da Conta: " + contaPedro.getSaldo());

        System.out.println("\n\nConta Poupança:" + contaMatheus.sacar(600));
        System.out.println("\nOperacao Invalida:" + contaMatheus.sacar(100000));
        System.out.println("\nSaldo da Conta: "+contaMatheus.getSaldo());

        System.out.println("Conta Pagamento: " + contaPagamentoPedro.sacar(500));
        System.out.println("Tentativa de saque fora de saldo: " + contaPagamentoPedro.sacar(10000));
        System.out.println("Saldo Conta Pagamento de Pedro: "+ contaPagamentoPedro.getSaldo());

        //deposito-------------------
        System.out.println("\n\n------DEPOSITO--------");
        System.out.println("\nConta Corrente de Pedro: " + contaPedro.depositar(600));
        System.out.println("\nOperacao Invalida: valor inserido negativo " + contaPedro.depositar(-200));
        System.out.println("\nSaldo COnta Corrente de Pedro: " + contaPedro.getSaldo());
        System.out.println("\nConta Poupanca de Matheus: " + contaMatheus.depositar(600));
        System.out.println("\nOperacao Invalida: " + contaMatheus.depositar(-20));
        System.out.println("\nSaldo da Conta Poupanca de Matheus: " + contaMatheus.getSaldo());

        System.out.println("Conta Pagamento de Pedro: " + contaPagamentoPedro.depositar(500));
        System.out.println("Tentativa de depósito incorreta: " + contaPagamentoPedro.depositar(-10));
        System.out.println("Saldo da Conta Pagamento de Pedro: " + contaPagamentoPedro.getSaldo());

        //transferencia-------------------- de poupança pra corrente e pagamento
        System.out.println("\n\n-----TRANSFERENCIA-------");
        System.out.println("Transferindo de Matheus para Pedro Corrente e Pedro Pagamento");
        contaMatheus.transferir(contaPedro, 2000.0);
        contaMatheus.transferir(contaPagamentoPedro, 1000.0);
        System.out.println("Saldo da Conta Pagamento de Pedro: " + contaPagamentoPedro.getSaldo());
        System.out.println("Saldo da Conta Corrente de Pedro: " + contaPedro.getSaldo());
        System.out.println("Saldo da Conta Corrente de Matheus: " + contaMatheus.getSaldo());
        System.out.println("Ocorreu um erro: Transferência não pode ser concluida" + contaMatheus.transferir(contaPagamentoPedro, 100000.0));

        //transferencia-------------------- de pagamento pra corrente e poupanca
        System.out.println("\n\n-----TRANSFERENCIA-------");
        System.out.println("Transferindo de Matheus Poupanca para Pedro Corrente e Pedro Pagamento");
        contaPagamentoPedro.transferir(contaPedro, 2000.0);
        contaPagamentoPedro.transferir(contaMatheus, 1000.0);
        System.out.println("Saldo da Conta Pagamento de Pedro: " + contaPagamentoPedro.getSaldo());
        System.out.println("Saldo da Conta Corrente de Pedro: " + contaPedro.getSaldo());
        System.out.println("Saldo da Conta Corrente de Matheus: " + contaMatheus.getSaldo());
        System.out.println("Ocorreu um erro: Transferência não pode ser concluida" + contaPagamentoPedro.transferir(contaPagamentoPedro, 100000000000000.0));

        //transferencia-------------------- de corrente pra pagamento e poupanca
        System.out.println("\n\n-----TRANSFERENCIA-------");
        System.out.println("Transferindo de Pedro Corrente para Matheus Poupanca e Pedro Pagamento");
        contaPedro.transferir(contaPagamentoPedro, 2000.0);
        contaPedro.transferir(contaMatheus, 1000.0);
        System.out.println("Saldo da Conta Pagamento de Pedro: " + contaPagamentoPedro.getSaldo());
        System.out.println("Saldo da Conta Corrente de Pedro: " + contaPedro.getSaldo());
        System.out.println("Saldo da Conta Corrente de Matheus: " + contaMatheus.getSaldo());
        System.out.println("Ocorreu um erro: Transferência não pode ser concluida" + contaPedro.transferir(contaPagamentoPedro, 100000000000000.0));

        System.out.println("\nTransferindo de Pedro para Matheus");
        contaMatheus.transferir(contaPedro, 500.0);
        System.out.println("\nSaldo COnta Pedro: "+ contaPedro.getSaldo());
        System.out.println("\nSaldo conta Matheus:" + contaMatheus.getSaldo());
        System.out.println("\nTeste valor 0");
        contaPedro.transferir(contaMatheus, 0.0);
        System.out.println("\nTeste valores negativos");
        contaMatheus.transferir(contaPedro, -100.0);


        System.out.println("\n-Alteracao de Cheque-");
        System.out.println("Saldo atual com cheque: " + contaPedro.retornarSaldoComChequeEspecial());
        contaPedro.setChequeEspecial(0.0);
        System.out.println("Adicionado 100 reais no cheque especial\nNovo saldo: "+contaPedro.retornarSaldoComChequeEspecial());

        System.out.println("\n-Creditar taxa na Conta Poupanca-");
        System.out.println("Saldo da Conta Corrente de Matheus: " + contaMatheus.getSaldo());
        contaMatheus.creditarTaxa();
        System.out.println("Após creditar taxa, esse é o novo saldo: "+ contaMatheus.getSaldo());
    }
}
