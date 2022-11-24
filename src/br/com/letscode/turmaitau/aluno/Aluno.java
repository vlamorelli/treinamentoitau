package br.com.letscode.turmaitau.aluno;

public class Aluno{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    private String matricula;

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    private double[] nota;

    public String obterInfo(){

        String info = "Nome do Aluno = " + nome + "\n";
       // info += "Matricula = "  + matricula + ";";
        info += "Notas = ";

        int soma = 0;
        for (double nota : nota){
            soma += nota;
            info += nota + " ";
        }

        double media = soma/ nota.length;
        info += "\n" + "Media = " + media + " - ";
        if (media >=7){
            info += "Aprovado \n";
        }else{
            info += "Reprovado \n";
        }
        return info;
    }

    public double obterMediaTurma(){

        double somaNotas = 0;
        for (double nota : nota){
            somaNotas +=nota;
        }
        return somaNotas/nota.length;
    }
}
