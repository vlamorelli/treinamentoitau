package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{


    public ContaCorrente(String numero, Pessoa pessoa, BigDecimal saldo) {
        super(numero, pessoa, saldo);
    }

    public void depositar(BigDecimal valor) {
        BigDecimal novoSaldo = getSaldo().add(valor);
        setSaldo(novoSaldo);
        System.out.println(STRINGSALDO + getSaldo());
    }
}
