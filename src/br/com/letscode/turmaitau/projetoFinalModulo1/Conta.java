package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;

public abstract class Conta {

    private String numero;

    private Pessoa pessoa;

    private BigDecimal saldo;

    BigDecimal valorComTaxa =  new BigDecimal("0");

    static final String OPERACAOVALIDA = "Operação realizada com sucesso!";
    static final String OPERACAOINVALIDA = "A conta não possui saldo suficiente. Operação não realizada!";

    static final String STRINGSALDO = "Seu saldo é: R$ ";

   // String mensagemCusto;

    public Conta(String numero, Pessoa pessoa, BigDecimal saldo) {
        this.numero = numero;
        this.pessoa = pessoa;
        this.saldo= saldo;
    }

    public abstract void depositar(BigDecimal valor);

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

        if (pessoa instanceof PessoaJuridica){
            valorComTaxa = (valor.multiply(new BigDecimal("0.005"))).add(valor);
        }else{
            valorComTaxa = valor;
        }
        return valorComTaxa;
    }


    public BigDecimal getSaldo() {

        return saldo;
    }
    protected void setSaldo(BigDecimal saldo) {

        if (saldo.compareTo(new BigDecimal(0)) >= 0) {
            this.saldo = saldo;
            System.out.println(OPERACAOVALIDA);
        } else {
            System.out.println(OPERACAOINVALIDA);
        }
    }

    protected void setSaldo(BigDecimal saldo, BigDecimal valor, Conta contaDestino) {

        if (saldo.compareTo(new BigDecimal(0)) >= 0) {
            this.saldo = saldo;
            BigDecimal novoSaldoDaContaDestino = contaDestino.getSaldo().add(valor);
            contaDestino.setSaldo(novoSaldoDaContaDestino);
        } else {
            System.out.println(OPERACAOINVALIDA);
        }

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
