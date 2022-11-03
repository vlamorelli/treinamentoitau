package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;

public class Conta {

    private String  nome;
    private String cpf;
    private String cnpj;
    private String tipoPessoa;
    private BigDecimal saldo;
    BigDecimal valorComTaxa =  new BigDecimal("0");

    static final String OPERACAOVALIDA = "Operação realizada com sucesso!";
    static final String OPERACAOINVALIDA = "A conta não possui saldo suficiente. Operação não realizada!";

    static final String STRINGSALDO = "Seu saldo é: R$ ";

    public Conta(String nome, String cpf, String cnpj, String tipoPessoa, BigDecimal saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.tipoPessoa = tipoPessoa;
        this.saldo= saldo;
    }

    public void depositar(BigDecimal valor) {
        BigDecimal novoSaldo = getSaldo().add(valor);
        setSaldo(novoSaldo);
        System.out.println(STRINGSALDO + getSaldo());
    }

    public void transferir(BigDecimal valor, Conta contaDestino) {

        valorComTaxa = taxacao(valor);
        BigDecimal novoSaldoDaContaOrigem = getSaldo().subtract(valorComTaxa);
        setSaldo(novoSaldoDaContaOrigem, valor, contaDestino);
        System.out.println(STRINGSALDO + getSaldo());
    }

    public void sacar(BigDecimal valor) {

        valorComTaxa = taxacao(valor);
        BigDecimal novoSaldo = getSaldo().subtract(valorComTaxa);
        setSaldo(novoSaldo);
        System.out.println(STRINGSALDO + getSaldo());
    }

    public BigDecimal taxacao (BigDecimal valor){

        //valorComTaxa = 0;
        if (this.getTipoPessoa().toString().equals("PJ")){
            //valorComTaxa = valor + (valor*0.005);
            valorComTaxa = (valor.multiply(new BigDecimal("0.005"))).add(valor);
        }else{
            valorComTaxa = valor;
        }
        return valorComTaxa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public BigDecimal getSaldo() {

        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {

        if (saldo.compareTo(new BigDecimal(0)) >= 0) {
            this.saldo = saldo;
            System.out.println(OPERACAOVALIDA);
        } else {
            System.out.println(OPERACAOINVALIDA);
        }
    }

    public void setSaldo(BigDecimal saldo, BigDecimal valor, Conta contaDestino) {

        //if (saldo >= 0) {
        if (saldo.compareTo(new BigDecimal(0)) >= 0) {
            this.saldo = saldo;
            BigDecimal novoSaldoDaContaDestino = contaDestino.getSaldo().add(valor);
            contaDestino.setSaldo(novoSaldoDaContaDestino);
        } else {
            System.out.println(OPERACAOINVALIDA);
        }

    }

}
