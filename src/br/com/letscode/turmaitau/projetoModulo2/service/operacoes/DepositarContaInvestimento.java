package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.ContaInvestimento;
import br.com.letscode.turmaitau.projetoModulo2.entidades.PessoaFisica;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;

import java.math.BigDecimal;

public class DepositarContaInvestimento implements FuncionalidadeValorOperacao<ContaInvestimento>{

    static final String STRINGSALDO = "Seu saldo é: R$ ";
    @Override
    public void operacoes(ContaInvestimento novaconta) throws ValidaValorExpection {

        BigDecimal valorComTaxa =  new BigDecimal("0");
        BigDecimal valor=  new BigDecimal("0");;
        BigDecimal novoSaldo=  new BigDecimal("0");;

        valor = FuncionalidadeValorOperacao.super.getValor(novaconta);

        if (novaconta.getPessoa() instanceof PessoaFisica) {
            novoSaldo = (valor.multiply(new BigDecimal("0.015"))).add(valor).add(novaconta.getSaldo());
        }else{
            novoSaldo = (valor.multiply(new BigDecimal("0.035"))).add(valor).add(novaconta.getSaldo());
        }
        novaconta.setSaldo(novoSaldo);
        System.out.println(STRINGSALDO + novaconta.getSaldo());

    }
}
