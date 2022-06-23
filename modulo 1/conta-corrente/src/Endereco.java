import javax.imageio.plugins.tiff.TIFFTagSet;

public class Endereco
{
    int tipo;
    String logradouro;
    int numero = 0;
    String complemento;
    String cep;
    String cidade;
    String estado;
    String pais;

    void imprimirEndereco(){

        if (tipo == 1){
            System.out.println("Tipo: Residencial");
        }
        else if (tipo == 2){
        System.out.println("Tipo: Comercial");
        }
        else {
            System.out.println("Tipo não existente");
        }

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
