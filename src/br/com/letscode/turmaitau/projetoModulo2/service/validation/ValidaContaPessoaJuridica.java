package br.com.letscode.turmaitau.projetoModulo2.service.validation;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Pessoa;
import br.com.letscode.turmaitau.projetoModulo2.entidades.PessoaJuridica;

import java.util.Scanner;

public class ValidaContaPessoaJuridica implements ValidaConta {

    static final String SEPARADOR = "==============================================================";
    public Object[]  validaTipoConta(){

        String tipoConta;
        String nome;
        String cnpj;
        Object [] conta = new Object[2];
        Scanner entrada = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append(SEPARADOR).append("\n");
        sb.append("Qual tipo de conta você deseja?").append("\n");
        sb.append("Conta Corrente - Digite CC: ").append("\n");
        sb.append("Conta Investimento - Digite CI: ").append("\n");
        sb.append(SEPARADOR);
        System.out.println(sb.toString());
        tipoConta = entrada.next().toUpperCase();

        while (!tipoConta.equals("CC") && !tipoConta.equals("CP") && !tipoConta.equals("CI")){
            sb = new StringBuffer();
            sb.append("Opção incorreta.").append("\n");
            sb.append("Conta Corrente - Digite CC: ").append("\n");
            sb.append("Conta Investimento - Digite CI: ").append("\n");
            System.out.println(sb.toString());
            tipoConta = entrada.next().toUpperCase();

        }
        System.out.println("Digite o nome:");
        nome = entrada.next();

        System.out.println("Digite o CNPJ: ");
        cnpj = entrada.next();

        Pessoa pessoajuridica = new PessoaJuridica(nome, cnpj);

        conta[0] = pessoajuridica;
        conta[1] = tipoConta;

        return conta;
    }

}
