package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.*;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;

import java.math.BigDecimal;
import java.util.Scanner;

public class DepositarContaCorrente implements FuncionalidadeValorOperacao<ContaCorrente>{

    static final String STRINGSALDO = "Seu saldo é: R$ ";
    @Override
    public void operacoes(ContaCorrente novaconta) throws ValidaValorExpection {

        BigDecimal valorComTaxa =  new BigDecimal("0");
        BigDecimal valor=  new BigDecimal("0");;
        BigDecimal novoSaldo=  new BigDecimal("0");;

        valor = FuncionalidadeValorOperacao.super.getValor(novaconta);
        novoSaldo = novaconta.getSaldo().add(valor);
        novaconta.setSaldo(novoSaldo);
        System.out.println(STRINGSALDO + novaconta.getSaldo());



    }
}
