package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Conta;
import br.com.letscode.turmaitau.projetoModulo2.entidades.ContaCorrente;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;
import br.com.letscode.turmaitau.projetoModulo2.service.Taxacao;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.ValidaSaldo;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.ValidaValor;

import java.math.BigDecimal;
import java.util.Scanner;

public class Transferir implements FuncionalidadeValorOperacao<Conta>{

    static final String STRINGSALDO = "Seu saldo é: R$ ";
    @Override
    public void operacoes(Conta novaconta) throws ValidaValorExpection {

        BigDecimal valorComTaxa =  new BigDecimal("0");
        BigDecimal valor=  new BigDecimal("0");;
        Conta contaDestino= new ContaCorrente(String.valueOf(System.currentTimeMillis()), novaconta.getPessoa(),  BigDecimal.ZERO);

        valor = FuncionalidadeValorOperacao.super.getValor(novaconta);
        Taxacao taxacao = new Taxacao();
        valorComTaxa = taxacao.calculaTaxa(valor, novaconta);
        BigDecimal novoSaldoDaContaOrigem = novaconta.getSaldo().subtract(valorComTaxa);
        ValidaSaldo validaSaldo = new ValidaSaldo();
        validaSaldo.validaValor(novoSaldoDaContaOrigem, valor, contaDestino);
        novaconta.setSaldo(novoSaldoDaContaOrigem, valor, contaDestino);
        System.out.println(STRINGSALDO + novaconta.getSaldo());
    }
}
