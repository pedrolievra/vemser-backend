public class Enderecos {
    private int tipo;
    private String logradouro;
    private String complemento;
    private  String cep;
    private  String cidade;
    private  String estado;
    private  String pais;
    private  int numero;

    public Enderecos(int tipo, String logradouro, String complemento, String cep, String cidade, String estado, String pais, int numero) {
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.numero = numero;
    }

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
            System.out.println("Não foi possível achar o endereço");
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
