package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args)  {

        Object[] conta;
        Funcionalidade funcionalidade = new Funcionalidade();
        conta = funcionalidade.abrirConta();
        Conta novaconta = getConta(conta);
        realizarOperacao(novaconta, funcionalidade);
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

    public static void realizarOperacao(Conta novaConta, Funcionalidade funcionalidade){

        try {
            funcionalidade.operacoes(novaConta);
        } catch (ValidaValorExpection e) {
            System.out.println(e.getMessage());
            realizarOperacao(novaConta, funcionalidade);
        }
    }
}
