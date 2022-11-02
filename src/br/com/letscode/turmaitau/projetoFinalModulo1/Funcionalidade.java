package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Funcionalidade {

    static final String OPCAOPESSOA = "Digite F para Pessoa Física ou J para Pessoa Juridica:";
    static final String SEPARADOR = "==============================================================";

    public String[] abrirConta(){

        Scanner entrada = new Scanner(System.in);
        String [] conta = new String[5];
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
        sb.append("Me diz, que tipo de conta você deseja abrir?").append("\n");
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

        if(tipoPessoa.equals("F")){

            tipoConta = validaTipoConta (tipoPessoa);

            System.out.println("Digite o nome: ");
            nome = entrada.next();

            System.out.println("Digite o CPF: ");
            cpf = entrada.next();

            conta[0] = nome;
            conta[1] = cpf;
            conta[2] = null;
            conta[3] = "PF";
            conta[4] = tipoConta;

        }else{

            tipoConta = validaTipoConta (tipoPessoa);

            System.out.println("Digite o nome da empresa: ");
            nome = entrada.next();

            System.out.println("Digite o CNPJ: ");
            cnpj = entrada.next();

            conta[0] = nome;
            conta[1] = null;
            conta[2] = cnpj;
            conta[3] = "PJ";
            conta[4] = tipoConta;
        }

        return conta;
    }
    public void operacoes(Conta novaConta){
        //sacar, depositar, transferência, investir e consultar saldo
        String tipoOperacao="C";
        BigDecimal valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem vindo " + novaConta.getNome());

        while (!tipoOperacao.equals("X")) {

            valor = new BigDecimal("0.0");
            StringBuffer sb = new StringBuffer();
            sb.append(SEPARADOR).append("\n");
            sb.append("Qual operação deseja realizar?").append("\n");
            sb.append("Sacar - Digite S").append("\n");
            sb.append("Depositar - Digite D").append("\n");
            sb.append("Transferência - Digite T").append("\n");
            sb.append("Consultar Saldo - Digite C").append("\n");
            sb.append("Sair - Digite X").append("\n");
            sb.append(SEPARADOR);
            System.out.println(sb.toString());
            tipoOperacao = entrada.next().toUpperCase();

            switch (tipoOperacao) {
                case "S":
                    System.out.println("Digite o valor que deseja sacar:");
                    valor = entrada.nextBigDecimal();
                    novaConta.sacar(valor);
                    break;
                case "D":
                    System.out.println("Digite o valor que deseja depositar:");
                    valor = entrada.nextBigDecimal();
                    novaConta.depositar(valor);
                    break;
                case "T":
                    Conta contaDestino = new Conta("Milton", "123.456.789-10", null, "PF", new BigDecimal("0.0"));
                    System.out.println("Digite o valor que deseja transferir:");
                    valor = entrada.nextBigDecimal();
                    novaConta.transferir(valor, contaDestino);
                    break;
                case "C":
                    System.out.printf("O saldo da conta é: %.2f %n",  (novaConta.getSaldo()));
                    break;
                case "X":
                    System.out.println("Até a próxima!");
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
                    break;
            }
        }
    }

    public String  validaTipoConta(String tipoPessoa){

        String tipoConta;
        Scanner entrada = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append("Conta Corrente - Digite CC: ").append("\n");
        if (tipoPessoa.toString().equals("F")){
            sb.append("Conta Poupança - Digite CP: ").append("\n");
        }
        sb.append("Conta Investimento - Digite CI: ").append("\n");
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
        return tipoConta;
    }
}
