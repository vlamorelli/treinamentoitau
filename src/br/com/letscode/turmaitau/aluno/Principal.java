package br.com.letscode.turmaitau.aluno;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args)  {

        Curso curso = new Curso();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o nome do curso:");
        String nomeCurso = entrada.nextLine();

        System.out.println("Entre com o período do curso:");
        String periodo = entrada.nextLine();

        curso.setNome(nomeCurso);
        curso.setPeriodo(periodo);

        Professor professor = new Professor();

        System.out.println("Entre com o nome do Professor:");
        String nomeProfessor = entrada.nextLine();

        System.out.println("Entre com o departamento do Professor:");
        String departamennto = entrada.nextLine();

        professor.setNome(nomeProfessor);
        professor.setDepartamento(departamennto);
        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[2];

        for (int i=0; i<2; i++){
            System.out.println("Entre com o nome do " + (i+1) + "º aluno:");
            String nomeAluno = entrada.next();

            double[] notaAluno = new double[2];

            for (int j=0; j<2;j++){
                System.out.println("Entre com a " + (j+1) + "º nota do " + (i+1) + "º aluno:");
                notaAluno[j] = entrada.nextDouble();
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            //aluno.setMatricula(matrAluno);
            aluno.setNota(notaAluno);

            alunos[i] = aluno;
         }

         curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());
    }
}
