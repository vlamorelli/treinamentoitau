package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Conta;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.ValidaValor;

import java.math.BigDecimal;
import java.util.Scanner;

public interface FuncionalidadeValorOperacao<T extends Conta> extends Funcionalidade<T>{

    default BigDecimal getValor(T novaconta) throws ValidaValorExpection {

        BigDecimal valorComTaxa =  new BigDecimal("0");
        BigDecimal valor=  new BigDecimal("0");;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da Operação que deseja realizar:");
        valor = entrada.nextBigDecimal();
        ValidaValor validaValor = new ValidaValor();
        validaValor.validaValor(valor);

        return valor;
    }
}
