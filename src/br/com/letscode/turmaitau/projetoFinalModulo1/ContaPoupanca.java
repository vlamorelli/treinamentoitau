package br.com.letscode.turmaitau.projetoFinalModulo1;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nome, String cpf, String cnpj, String tipoPessoa, double saldo) {
        super(nome, cpf, cnpj, tipoPessoa, saldo);
    }

    public void depositar(double valor) {
        double novoSaldo = getSaldo() + valor + (valor*0.01);
        setSaldo(novoSaldo);
    }
}
