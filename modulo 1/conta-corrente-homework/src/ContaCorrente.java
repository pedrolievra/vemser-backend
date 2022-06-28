public class ContaCorrente {
    public Cliente cliente;
    public String numeroConta;
    public String agencia;
    public double saldo;
    public double chequeEspecial;

    public void imprimirConta(){
        System.out.println("\n-CONTA-");
        System.out.println("Agencia: " + agencia + "\nNumero da conta: " + numeroConta + "\nSaldo: " + saldo+
                "\nCheque Especial: " + chequeEspecial);
    }

    public boolean sacar(double valor){
        if (saldo>=valor && valor>0){
            System.out.println("-TRANSFERENCIA REALIZADA COM SUCESSO");
            saldo -= valor;
            return true;
        }
        else if (((saldo + chequeEspecial) >= valor) && (valor > saldo) && (valor != 0)){
            System.out.println("-TRANSFERENCIA REALIZADA COM SUCESSO - COM CHEQUE ESPECIAL");
            saldo -= valor;
            chequeEspecial += valor;
            return true;
        }
        else if(valor<=0) {
            System.out.println("\n-VALOR INVALIDO. FAVOR REENSERIR O VALOR");
            return false;
        }
        else {
            System.out.print("-OPERACAO NAO REALIZADA: VALOR DE SAQUE EXTRAPOLA SALDO + CHEQUE ESPECIAL");
            return false;
        }
    }

    public boolean depositar(double valor){
        if(valor>0){
            saldo+=valor;
        }
        else {
            System.out.println("-NAO FOI POSSIVEL DEPOSITAR: VALOR NEGATIVO");
        }
    return false;
    }

    public double retornoSaldoComChequeEspecial(){
        System.out.println("SALDO + CHEQUE: " + (this.saldo+this.chequeEspecial));
        return this.saldo+this.chequeEspecial;
    }

    public boolean transferir(ContaCorrente contaCorrente, double valor){
        if (valor>0 && saldo>valor){
            System.out.println("-TRANSFERENCIA REALIZADA COM SUCESSO");
            contaCorrente.saldo = saldo - valor;
        }
        if (valor <= 0){
            System.out.println("-TRANFERENCIA NAO REALIZADA: VALOR INVALIDO");
        }
        return false;
    }
}
