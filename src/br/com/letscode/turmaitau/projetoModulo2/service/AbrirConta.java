package br.com.letscode.turmaitau.projetoModulo2.service;

import br.com.letscode.turmaitau.projetoModulo2.service.validation.ValidaConta;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.ValidaContaPessoaFisica;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.ValidaContaPessoaJuridica;

import java.util.Scanner;

public class AbrirConta {


    static final String OPCAOPESSOA = "Digite F para Pessoa Física ou J para Pessoa Juridica:";
    static final String SEPARADOR = "==============================================================";

    public Object[] abrirConta() {

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

        return conta;
    }
}
