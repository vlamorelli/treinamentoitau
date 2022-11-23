package br.com.letscode.turmaitau.projetoModulo2;

import br.com.letscode.turmaitau.projetoFinalModulo1.Funcionalidade;
import br.com.letscode.turmaitau.projetoFinalModulo1.ValidaValorExpection;
import br.com.letscode.turmaitau.projetoModulo2.entidades.*;
import br.com.letscode.turmaitau.projetoModulo2.service.AbrirConta;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {


        Object[] conta;
        AbrirConta abrirConta = new AbrirConta();
        Conta novaconta = abrirConta.abrirConta();

        realizarOperacao(novaconta, funcionalidade);

        //System.out.println(novaconta);

        //conta = abrirConta.abrirConta();
        //Conta novaconta = getConta(conta);
     //   realizarOperacao(novaconta, funcionalidade);

    }

    /*
        Essa parte debaixo iremos colocar dentro da classe abrir conta e retonar a conta (DONE)
        Criar uma interface de funcionalidade implementando as classes Service
     */

    public static void realizarOperacao(br.com.letscode.turmaitau.projetoFinalModulo1.Conta novaConta, Funcionalidade funcionalidade){

        try {
            funcionalidade.operacoes(novaConta);
        } catch (ValidaValorExpection e) {
            System.out.println(e.getMessage());
            realizarOperacao(novaConta, funcionalidade);
        }
    }

 /*   public static Conta getConta(Object[] conta){
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
    }*/
}
