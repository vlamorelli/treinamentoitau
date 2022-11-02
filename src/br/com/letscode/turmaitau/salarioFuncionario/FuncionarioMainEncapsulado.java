package br.com.letscode.turmaitau.salarioFuncionario;

import java.math.BigDecimal;

public class FuncionarioMainEncapsulado {

    public static void main(String[] args) {

        int qtdDias = 20;

        FuncionarioComEncapsulamento funcionarioRH = new FuncionarioComEncapsulamento("Funcionário do RH","000.000.000-00", new BigDecimal("10000"));
        funcionarioRH.salario(qtdDias);

        FuncionarioComEncapsulamento funcionarioTI = new FuncionarioComEncapsulamento("Funcionário do RH","000.000.000-00", new BigDecimal("10000"));
        funcionarioTI.salario(qtdDias);

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
