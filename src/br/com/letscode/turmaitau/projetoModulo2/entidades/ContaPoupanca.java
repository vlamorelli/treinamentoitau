package br.com.letscode.turmaitau.projetoModulo2.entidades;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    BigDecimal novoSaldo =  new BigDecimal("0");

    public ContaPoupanca(String numero, Pessoa pessoa, BigDecimal saldo) {

        super(numero, pessoa, saldo);
    }

}
