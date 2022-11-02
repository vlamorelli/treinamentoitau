package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {

        String[] conta;
        Funcionalidade funcionalidade = new Funcionalidade();
        conta = funcionalidade.abrirConta();
        switch (conta[4]) {
            case "CC":
                Conta novaConta = new Conta(conta[0], conta[1], conta[2], conta[3], new BigDecimal("0"));
                //Conta novaConta = new Conta(conta[0], conta[1], conta[2], conta[3], 0.0);
                funcionalidade.operacoes(novaConta);
                break;
            case "CP":
                ContaPoupanca novaPoupanca= new ContaPoupanca(conta[0], conta[1], conta[2], conta[3], new BigDecimal("0"));
                //ContaPoupanca novaPoupanca= new ContaPoupanca(conta[0], conta[1], conta[2], conta[3], 0.0);
                funcionalidade.operacoes(novaPoupanca);
                break;
            case "CI":
                ContaInvestimento novaInvestimento = new ContaInvestimento(conta[0], conta[1], conta[2], conta[3], new BigDecimal("0"));
                //ContaInvestimento novaInvestimento = new ContaInvestimento(conta[0], conta[1], conta[2], conta[3], new BigDecimal("0"));
                funcionalidade.operacoes(novaInvestimento);
                break;
            default:
                System.out.println("Opção Inválida!!!");
                break;
        }
    }
}
