package br.com.letscode.turmaitau.projetoModulo2.service.validation;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Conta;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;

import java.math.BigDecimal;

public class ValidaSaldo {

    static final String OPERACAOVALIDA = "Operação realizada com sucesso!";
    static final String OPERACAOINVALIDA = "A conta não possui saldo suficiente. Operação não realizada!";

    public void validaValor(BigDecimal saldo) throws ValidaValorExpection {

        if (saldo.compareTo(new BigDecimal(0)) >= 0) {
            System.out.println(OPERACAOVALIDA);
        } else {
            throw new ValidaValorExpection(OPERACAOINVALIDA);
        }
    }

    public void validaValor(BigDecimal saldo, BigDecimal valor, Conta contaDestino) throws ValidaValorExpection {

        if (saldo.compareTo(new BigDecimal(0)) >= 0) {
            System.out.println(OPERACAOVALIDA);
        } else {
            throw new ValidaValorExpection(OPERACAOINVALIDA);
        }
    }
}
