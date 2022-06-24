public class Contato {
    private String descricao;
    private String telefone;
    private Integer tipo;

    public Contato(String descricao, String telefone, Integer tipo) {
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    void imprimirContato() {
        if (this.tipo==1){
            System.out.println("Tipo Residencial");
        }
        else if (this.tipo==2){
        System.out.println("Tipo Comercial");
        }
        else {
            System.out.println("Tipo não compatível");
        }
        System.out.println("Descricao do contato: " + descricao + " Telefone do contato: " + telefone);
    }
}
