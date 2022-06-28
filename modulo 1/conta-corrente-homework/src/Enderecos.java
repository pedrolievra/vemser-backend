public class Enderecos {
    public int tipo;
    public String logradouro;
    public String complemento;
    public String cep;
    public String cidade;
    public String estado;
    public String pais;
    public int numero;

    public void imprimirEndereco(){
        if(tipo==1){
            System.out.println(
                    "Tipo: Residencial" +
                    "\nRua: " + logradouro +
                     "\nNumero: " + numero +
                     "\nComplemento: " + complemento +
                     "\nCEP: " + cep +
                     "\nCidade: " + cidade +
                     "\nEstado: " + estado +
                     "\nPais: " + pais
            );
        }
        else if(tipo ==2){
            System.out.println(
                    "Tipo: Comercial" +
                            "\nRua: " + logradouro +
                            "\nNumero: " + numero +
                            "\nComplemento: " + complemento +
                            "\nCEP: " + cep +
                            "\nCidade: " + cidade +
                            "\nEstado: " + estado +
                            "\nPais: " + pais
            );
        }
        else{
            System.out.println("Tipo de endereço inválido\n" +
                    "\nRua: " + logradouro +
                    "\nNúmero: " + numero +
                    "\nComplemento: " + complemento +
                    "\nCEP: " + cep +
                    "\nCidade: " + cidade +
                    "\nEstado: " + estado +
                    "\nPaís: " + pais);
        }
    }
}
