package br.com.letscode.turmaitau.projetoModulo2.entidades;

import java.math.BigDecimal;

public abstract class Conta {

    private String numero;

    private Pessoa pessoa;

    private BigDecimal saldo;

    BigDecimal valorComTaxa =  new BigDecimal("0");

    static final String OPERACAOVALIDA = "Operação realizada com sucesso!";
    static final String OPERACAOINVALIDA = "A conta não possui saldo suficiente. Operação não realizada!";

    static final String STRINGSALDO = "Seu saldo é: R$ ";

    public Conta(String numero, Pessoa pessoa, BigDecimal saldo) {
        this.numero = numero;
        this.pessoa = pessoa;
        this.saldo= saldo;
    }

    public BigDecimal getSaldo() {

        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {

        this.saldo = saldo;
    }

    public void setSaldo(BigDecimal saldo, BigDecimal valor, Conta contaDestino) {

        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
