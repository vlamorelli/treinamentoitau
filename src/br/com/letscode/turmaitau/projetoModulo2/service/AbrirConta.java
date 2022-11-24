package br.com.letscode.turmaitau.projetoModulo2.service;

import br.com.letscode.turmaitau.projetoModulo2.entidades.*;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.Conta.ValidaConta;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.Conta.ValidaContaPessoaFisica;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.Conta.ValidaContaPessoaJuridica;

import java.math.BigDecimal;
import java.util.Scanner;

public class AbrirConta {

    static final String OPCAOPESSOA = "Digite F para Pessoa Física ou J para Pessoa Juridica:";
    static final String SEPARADOR = "==============================================================";

    public Conta abrirConta() {

        Scanner entrada = new Scanner(System.in);
        Object [] conta = new Object[2];
        String tipoPessoa;
        String tipoConta;
        String nome;
        String cpf;
        String cnpj;

        StringBuffer sb = new StringBuffer();
        sb.append(SEPARADOR).append("\n");
        sb.append("Olá Cliente. ");
        sb.append("Seja bem vindo ao Banco XPTO. ").append("\n");
        sb.append("Nunca foi tão fácil abrir sua conta.").append("\n");
        sb.append("Me diz, você deseja abrir uma Conta PF ou PJ?").append("\n");
        sb.append(OPCAOPESSOA);
        System.out.println(sb.toString());
        tipoPessoa = entrada.next().toUpperCase();

        while (!tipoPessoa.equals("F") && !tipoPessoa.equals("J")){
            sb = new StringBuffer();
            sb.append("Opção incorreta.").append("\n");
            sb.append(OPCAOPESSOA);
            System.out.println(sb.toString());
            tipoPessoa = entrada.next().toUpperCase();

        }

        ValidaConta validaConta =
                (tipoPessoa.equals("F")) ? new ValidaContaPessoaFisica() : new ValidaContaPessoaJuridica();

        conta = validaConta.validaTipoConta();

       Conta novaconta = getConta(conta);

        return novaconta;
    }

    public static Conta getConta(Object[] conta){
        Conta novaConta= null;
        switch ((String) conta[1]) {
            case "CC":
                novaConta = new ContaCorrente(String.valueOf(System.currentTimeMillis()), (Pessoa) conta[0] ,  BigDecimal.ZERO);
                break;
            case "CP":
                novaConta= new ContaPoupanca(String.valueOf(System.currentTimeMillis()), (Pessoa) conta[0] ,  BigDecimal.ZERO);
                break;
            case "CI":
                novaConta = new ContaInvestimento(String.valueOf(System.currentTimeMillis()), (Pessoa) conta[0] ,  BigDecimal.ZERO);
                break;
            default:
                System.out.println("Opção Inválida!!!");
                break;
        }
        return novaConta;
    }
}
