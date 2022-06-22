public class Endereco
{
    int tipo = 0;
    String logradouro;
    int numero = 0;
    String complemento;
    String cep;
    String cidade;
    String estado;
    String pais;

    void imprimirEndereco(){
        System.out.println(" ");
        System.out.println("==Endereco==");
        System.out.println(" ");
        System.out.println("Tipo:" + tipo);
        System.out.println("Logradouro:" + logradouro);
        System.out.println("Numero: " + numero);
        System.out.println("Complemento: " + complemento);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("Pais: " + pais);
        System.out.println(" ");
    }
}
