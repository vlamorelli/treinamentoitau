package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.util.Arrays;
import java.util.Scanner;

public class Aplicacao {

    static final String OPCAOPESSOA = "Digite F para Pessoa Física ou J para Pessoa Juridica:";
    static final String SEPARADOR = "==============================================================";

    public static void main(String[] args) {

        String[] conta;
        conta = abrirConta();
        Conta novaConta = null;
        switch (conta[4]) {
            case "CC":
                novaConta = new Conta(conta[0], conta[1], conta[2], conta[3], 0.0);
                operacoes(novaConta);
                break;
            case "CP":
                break;
            case "CI":
                break;
            default:
                System.out.println("Opção Inválida!!!");
                break;
        }
        //operacoes(novaConta);
    }

    public static String[] abrirConta(){

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

            sb = new StringBuffer();
            sb.append("Conta Corrente - Digite CC: ").append("\n");
            sb.append("Conta Investimento - Digite CI: ").append("\n");
            System.out.println(sb.toString());
            tipoConta = entrada.next().toUpperCase();

            while (!tipoConta.equals("CC") && !tipoConta.equals("CI")){
                sb = new StringBuffer();
                sb.append("Opção incorreta.").append("\n");
                sb.append("Conta Corrente - Digite CC: ").append("\n");
                sb.append("Conta Poupança - Digite CP: ").append("\n");
                sb.append("Conta Investimento - Digite CI: ").append("\n");
                System.out.println(sb.toString());
                tipoConta = entrada.next().toUpperCase();

            }

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

    public static void operacoes(Conta novaConta){
        //sacar, depositar, transferência, investir e consultar saldo
        String tipoOperacao="C";
        double valor = 0.0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem vindo " + novaConta.getNome());

        while (!tipoOperacao.equals("X")) {

            valor = 0.0;
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
                     valor = entrada.nextDouble();
                    novaConta.sacar(valor);
                    break;
                case "D":
                    System.out.println("Digite o valor que deseja depositar:");
                     valor = entrada.nextDouble();
                    novaConta.depositar(valor);
                    break;
                case "T":
                    Conta contaDestino = new Conta("Milton", "123.456.789-10", null, "PF", 0.0);
                    System.out.println("Digite o valor que deseja transferir:");
                    valor = entrada.nextDouble();
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

    public static String  validaTipoConta(String tipoPessoa){

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
