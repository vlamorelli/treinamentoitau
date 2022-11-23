package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Conta;
import br.com.letscode.turmaitau.projetoModulo2.entidades.ContaCorrente;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;
import br.com.letscode.turmaitau.projetoModulo2.service.Taxacao;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.ValidaValor;

import java.math.BigDecimal;
import java.util.Scanner;

public class Transferir implements Funcionalidade{

    static final String STRINGSALDO = "Seu saldo é: R$ ";
    @Override
    public void operacoes(Conta novaconta) throws ValidaValorExpection {

        BigDecimal valorComTaxa =  new BigDecimal("0");
        BigDecimal valor=  new BigDecimal("0");;
     //   BigDecimal novoSaldo=  new BigDecimal("0");;
        Scanner entrada = new Scanner(System.in);

        Conta contaDestino= new ContaCorrente(String.valueOf(System.currentTimeMillis()), novaconta.getPessoa(),  BigDecimal.ZERO);
        System.out.println("Digite o valor que deseja transferir:");
        valor = entrada.nextBigDecimal();
        ValidaValor validaValor = new ValidaValor();
        validaValor.validaValor(valor);

        Taxacao taxacao = new Taxacao();
        valorComTaxa = taxacao.calculaTaxa(valor, novaconta);
        BigDecimal novoSaldoDaContaOrigem = novaconta.getSaldo().subtract(valorComTaxa);
        novaconta.setSaldo(novoSaldoDaContaOrigem, valor, contaDestino);
        System.out.println(STRINGSALDO + novaconta.getSaldo());
    }
}
