public class Contato {
    private String descricao;
    private String telefone;
    private int tipo;

    public Contato(String descricao, String telefone, int tipo){
        this.tipo = tipo;
        this.telefone = telefone;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    void imprimirContato(){
        System.out.println("Contato do cliente: " + descricao);
        System.out.println("Telefone: " + telefone);
        if(tipo==1){
            System.out.println("Tipo: Residencial");
        }
        else if (tipo==2){
            System.out.println("Tipo: Comercial");
        }
        else{
            System.out.println("Tipo não existente");
        }
        System.out.println(" ");
    }
}
