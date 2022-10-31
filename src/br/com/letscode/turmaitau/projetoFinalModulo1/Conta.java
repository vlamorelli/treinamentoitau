package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.util.Scanner;

public class Conta {

    private String  nome;
    private String cpf;
    private String cnpj;

    private String tipoPessoa;
    private double saldo;

    double valorComTaxa = 0;

    public Conta(String nome, String cpf, String cnpj, String tipoPessoa, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.tipoPessoa = tipoPessoa;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);
    }

    public void transferir(double valor, Conta contaDestino) {

        valorComTaxa = taxacao(valor);
        double novoSaldoDaContaOrigem = getSaldo() - valorComTaxa;
        setSaldoTransferencia(novoSaldoDaContaOrigem, valor, contaDestino);
    }

    public void sacar(double valor) {

        valorComTaxa = taxacao(valor);
        double novoSaldo = getSaldo() - valorComTaxa;
        setSaldo(novoSaldo);
    }

    public double taxacao (double valor){

        valorComTaxa = 0;
        if (this.getTipoPessoa().toString().equals("PJ")){
            valorComTaxa = valor + (valor*0.05);
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

    public double getSaldo() {

        return saldo;
    }
    public void setSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("A conta não possui saldo suficiente. Operação não realizada!");
        }
    }

    public void setSaldoTransferencia(double saldo, double valor, Conta contaDestino) {

        if (saldo >= 0) {
            this.saldo = saldo;
            double novoSaldoDaContaDestino = contaDestino.getSaldo() + valor;
            contaDestino.setSaldo(novoSaldoDaContaDestino);
        } else {
            System.out.println("A conta não possui saldo suficiente. Operação não realizada!");
        }

    }

}
