package br.com.letscode.turmaitau.projetoModulo2;

import br.com.letscode.turmaitau.projetoFinalModulo1.*;
import br.com.letscode.turmaitau.projetoModulo2.service.AbrirConta;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {


        Object[] conta;
        AbrirConta abrirConta = new AbrirConta();
        conta = abrirConta.abrirConta();
        Conta novaconta = getConta(conta);
     //   realizarOperacao(novaconta, funcionalidade);

    }

    /*
        Essa parte debaixo iremos colocar dentro da classe abrir conta e retonar a conta
        Criar uma interface de funcionalidade implementando as classes Service
     */

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
