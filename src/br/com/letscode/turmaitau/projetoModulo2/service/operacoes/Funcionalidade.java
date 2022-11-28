package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Conta;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;

import java.math.BigDecimal;

public interface Funcionalidade<T extends Conta> {

    void operacoes(T novaconta) throws ValidaValorExpection;
}
