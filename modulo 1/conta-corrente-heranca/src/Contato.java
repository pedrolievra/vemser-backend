public class Contato {
    public String descricao;
    public String telefone;
    public int tipo;

    public Contato(String descricao, String telefone, int tipo) {
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public void imprimirContato(){
        if(tipo==1){
            System.out.println("Tipo Residencial\nTelefone: " + telefone + "\nDescricao: " + descricao);
        }
        else if(tipo==2){
            System.out.println("Tipo Comercial\nTelefone: " + telefone + "\nDescricao: " + descricao);
        }
        else {
            System.out.println("Tipo inválido\nTelefone: " + telefone + "\nDescricao: " + descricao);

        }
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
