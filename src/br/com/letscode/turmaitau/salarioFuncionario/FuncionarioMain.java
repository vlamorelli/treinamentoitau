package br.com.letscode.turmaitau.salarioFuncionario;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuncionarioMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int qtdDias = 0;

        System.out.println("Digite a quatidade de dias trabalhado:");
        qtdDias = input.nextInt();

        if (qtdDias<0 || qtdDias>30){
            System.out.println("Quantidade de dias inválido. Digite entre 0 e 30!");
        }else{

            Funcionario funcionario = new Funcionario();
            funcionario.nome = "Funcionário para Teste";
            funcionario.cpf = "000.000.000-00";
            funcionario.salarioBase = 10000;
            funcionario.salario(qtdDias, funcionario.salarioBase);


        }

    }

}
