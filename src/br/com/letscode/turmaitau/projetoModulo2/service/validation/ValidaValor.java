package br.com.letscode.turmaitau.projetoModulo2.service.validation;

import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;

import java.math.BigDecimal;

public class ValidaValor {

    public void validaValor(BigDecimal valor) throws ValidaValorExpection {
        if ((valor.compareTo(new BigDecimal(0)) <= 0)){
            throw new ValidaValorExpection("Valor precisa ser maior do que zero (0). Operação não realizada!");
        }
    }
}
