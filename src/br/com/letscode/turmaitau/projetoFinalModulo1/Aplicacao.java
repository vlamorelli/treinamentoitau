package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {

        Object[] conta;
        Funcionalidade funcionalidade = new Funcionalidade();
        conta = funcionalidade.abrirConta();
        switch ((String) conta[1]) {
            case "CC":
                Conta novaContaCorrente = new ContaCorrente(String.valueOf(System.currentTimeMillis()), (Pessoa) conta[0] ,  BigDecimal.ZERO);
                funcionalidade.operacoes(novaContaCorrente);
                break;
            case "CP":
                Conta novaPoupanca= new ContaPoupanca(String.valueOf(System.currentTimeMillis()), (Pessoa) conta[0] ,  BigDecimal.ZERO);
                funcionalidade.operacoes(novaPoupanca);
                break;
            case "CI":
                Conta novaInvestimento = new ContaInvestimento(String.valueOf(System.currentTimeMillis()), (Pessoa) conta[0] ,  BigDecimal.ZERO);
                funcionalidade.operacoes(novaInvestimento);
                break;
            default:
                System.out.println("Opção Inválida!!!");
                break;
        }
    }
}
