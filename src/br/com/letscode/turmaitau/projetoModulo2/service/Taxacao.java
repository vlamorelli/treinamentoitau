package br.com.letscode.turmaitau.projetoModulo2.service;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Conta;
import br.com.letscode.turmaitau.projetoModulo2.entidades.PessoaJuridica;

import java.math.BigDecimal;

public class Taxacao {

    public BigDecimal calculaTaxa(BigDecimal valor, Conta novaconta) {

        BigDecimal valorComTaxa =  new BigDecimal("0");

        if (novaconta.getPessoa() instanceof PessoaJuridica) {
            valorComTaxa = (valor.multiply(new BigDecimal("0.005"))).add(valor);
        } else {
            valorComTaxa = valor;
        }
        return valorComTaxa;
    }
}
