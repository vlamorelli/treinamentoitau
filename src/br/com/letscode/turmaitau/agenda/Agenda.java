package br.com.letscode.turmaitau.agenda;

import br.com.letscode.turmaitau.aluno.Aluno;

import java.util.Set;

public class Agenda {

    private String nome;

    public Set<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(Set<Contato> contatos) {
        this.contatos = contatos;
    }

    private Set<Contato> contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




   public String listaContato(){
         
        String info = "Agenda: " + nome + "\n";

        for (Contato contato: contatos){
            info += contato.listaContato();
        }
        return info;
    }
}
