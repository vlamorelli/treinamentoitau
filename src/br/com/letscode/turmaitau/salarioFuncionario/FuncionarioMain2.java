package br.com.letscode.turmaitau.salarioFuncionario;

import java.text.DecimalFormat;


public class FuncionarioMain2 {

    public static void main(String[] args) {

        int qtdDias = 20;

        Funcionario funcionarioRH = new Funcionario();
        funcionarioRH.nome = "Funcionário do RH";
        funcionarioRH.cpf = "000.000.000-00";
        funcionarioRH.salarioBase = 10000;
        funcionarioRH.salario(qtdDias, funcionarioRH.salarioBase);

        Funcionario funcionarioTI = new Funcionario();
        funcionarioTI.nome = "Funcionário do RH";
        funcionarioTI.cpf = "000.000.000-00";
        funcionarioTI.salarioBase = 10000;
        funcionarioTI.salario(qtdDias, funcionarioTI.salarioBase);

        System.out.println(funcionarioRH.toString());
        System.out.println(funcionarioTI.toString());

        if(funcionarioTI.equals(funcionarioRH)){
            System.out.println("Mesmo Funcionario");
        }else{
            System.out.println("Funcionario diferente");
        }

        if(funcionarioTI==funcionarioRH){
            System.out.println("Mesmo Funcionario");
        }else{
            System.out.println("Funcionario diferente");
        }

        if(funcionarioTI.toString().equals(funcionarioRH.toString())){
            System.out.println("Mesmo Funcionario");
        }else{
            System.out.println("Funcionario diferente");
        }

        if(funcionarioTI.toString()==funcionarioRH.toString()){
            System.out.println("Mesmo Funcionario");
        }else{
            System.out.println("Funcionario diferente");
        }

    }
}
