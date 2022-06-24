public class Main {
    public static void main(String[] args) {
        Contato contatoA = new Contato("Disponivel ate as 23 horas", "91231897239871298", 2);
        Contato contatoB = new Contato("Disponivel ate as 20 horas", "123616287368716238", 2);

        Endereco enderecoA=new Endereco(1,"Rua taumautugo baz",346,"cetam","69070760","Manaus","Amazonas","Brasil");
        Endereco enderecoB=new Endereco(1,"Rua ZL",346,"cetam","69070760","Manaus","Amazonas","Brasil");

        Cliente matheus = new Cliente("Matheus", "12637618273",contatoA,contatoB,enderecoA,enderecoB);

        ContaCorrente contaCorrenteMatheus = new ContaCorrente(matheus,"92732","Itau",400,200);

        contaCorrenteMatheus.imprimir();
    }
}
