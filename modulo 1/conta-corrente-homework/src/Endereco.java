import javax.imageio.plugins.tiff.TIFFTagSet;

public class Endereco
{
    private int tipo;
    private String logradouro;
    private int numero = 0;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(int tipo, String logradouro, Integer numero, String complemento, String cep,String cidade, String estado, String pais){
        this.numero = numero;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.cep = cep;
        this.complemento = complemento;
        this.pais = pais;
        this.estado = estado;
    }
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
