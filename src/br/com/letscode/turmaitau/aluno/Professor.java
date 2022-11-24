package br.com.letscode.turmaitau.aluno;

public class Professor {

    private String nome;
    private String departamento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String obterInfo(){
        return "Professor = " + nome + "\n";
    }
}
