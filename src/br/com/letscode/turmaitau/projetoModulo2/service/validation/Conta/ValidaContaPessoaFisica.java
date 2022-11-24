package br.com.letscode.turmaitau.projetoModulo2.service.validation.Conta;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Pessoa;
import br.com.letscode.turmaitau.projetoModulo2.entidades.PessoaFisica;

import java.util.Scanner;

public class ValidaContaPessoaFisica implements ValidaConta {

    static final String SEPARADOR = "==============================================================";
    public Object[]  validaTipoConta(){

        String tipoConta;
        String nome;
        String cpf;
        Object [] conta = new Object[2];
        Scanner entrada = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append(SEPARADOR).append("\n");
        sb.append("Qual tipo de conta você deseja?").append("\n");
        sb.append("Conta Corrente - Digite CC: ").append("\n");
        sb.append("Conta Poupança - Digite CP: ").append("\n");
        sb.append("Conta Investimento - Digite CI: ").append("\n");
        sb.append(SEPARADOR);
        System.out.println(sb.toString());
        tipoConta = entrada.next().toUpperCase();

        while (!tipoConta.equals("CC") && !tipoConta.equals("CP") && !tipoConta.equals("CI")){
            sb = new StringBuffer();
            sb.append("Opção incorreta.").append("\n");
            sb.append("Conta Corrente - Digite CC: ").append("\n");
            sb.append("Conta Poupança - Digite CP: ").append("\n");
            sb.append("Conta Investimento - Digite CI: ").append("\n");
            System.out.println(sb.toString());
            tipoConta = entrada.next().toUpperCase();

        }
        System.out.println("Digite o nome:");
        nome = entrada.next();

        System.out.println("Digite o CPF: ");
        cpf = entrada.next();

        Pessoa pessoafisica = new PessoaFisica(nome, cpf);

        conta[0] = pessoafisica;
        conta[1] = tipoConta;

        return conta;

   }
}
