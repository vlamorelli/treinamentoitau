package br.com.letscode.turmaitau.projetoModulo2;

import br.com.letscode.turmaitau.projetoModulo2.entidades.*;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;
import br.com.letscode.turmaitau.projetoModulo2.service.AbrirConta;
import br.com.letscode.turmaitau.projetoModulo2.service.operacoes.MenuOperacao;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) {

        AbrirConta abrirConta = new AbrirConta();
        Conta novaconta = abrirConta.abrirConta();
        MenuOperacao menuOperacao = new MenuOperacao();
        realizarOperacao(novaconta, menuOperacao);

    }

    public static void realizarOperacao(Conta novaConta, MenuOperacao menuOperacao) {

        try {
            menuOperacao.operacoes(novaConta);
        } catch (ValidaValorExpection e) {
            System.out.println(e.getMessage());
            realizarOperacao(novaConta, menuOperacao);
        }
    }
}
