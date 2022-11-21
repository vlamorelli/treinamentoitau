package br.com.letscode.turmaitau.aluno;

public class Curso {

    private String nome;
    private String periodo;

    private Professor professor;

    private Aluno[] alunos;


    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String obterInfo(){
        String info = "Nome do Curso = " + nome + "\n";
        info += professor.obterInfo();
        for (Aluno aluno: alunos){
            info+= aluno.obterInfo();
        }
        info+= "\n";
        info+= "Média da turma = " + obterMediaTurma();
        return info;
    }

    public double obterMediaTurma(){

      double somaNotas = 0;
        for (Aluno aluno: alunos){
            somaNotas = somaNotas + aluno.obterMediaTurma();
        }
        double mediadaTurma = somaNotas/ alunos.length;
        return mediadaTurma;
    }

}
