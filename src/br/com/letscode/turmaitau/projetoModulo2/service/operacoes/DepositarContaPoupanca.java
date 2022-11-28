package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.ContaPoupanca;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;

import java.math.BigDecimal;

public class DepositarContaPoupanca implements FuncionalidadeValorOperacao<ContaPoupanca>{

    static final String STRINGSALDO = "Seu saldo é: R$ ";
    @Override
    public void operacoes(ContaPoupanca novaconta) throws ValidaValorExpection {

        BigDecimal valorComTaxa =  new BigDecimal("0");
        BigDecimal valor=  new BigDecimal("0");;
        BigDecimal novoSaldo=  new BigDecimal("0");;

        valor = FuncionalidadeValorOperacao.super.getValor(novaconta);

        novoSaldo = (valor.multiply(new BigDecimal("0.01"))).add(valor).add(novaconta.getSaldo());
        novaconta.setSaldo(novoSaldo);
        System.out.println(STRINGSALDO + novaconta.getSaldo());

    }
}
