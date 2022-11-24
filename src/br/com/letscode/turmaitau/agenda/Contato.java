package br.com.letscode.turmaitau.agenda;

public class Contato {

    private String nome;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String listaContato(){

        String info = "Nome: " + getNome() + " - Telefone: " + getTelefone() + "\n";

        return info;
    }
}
