package br.com.letscode.turmaitau.projetoFinalModulo1;

public class ContaInvestimento extends Conta{


    public ContaInvestimento(String nome, String cpf, String cnpj, String tipoPessoa, double saldo) {
        super(nome, cpf, cnpj, tipoPessoa, saldo);
    }

    public void depositar(double valor) {
        double novoSaldo = 0.0;
        System.out.println(this.getTipoPessoa().toString());
        if (this.getTipoPessoa().toString().equals("PF")){
            novoSaldo = getSaldo() + valor + (valor*0.015);
        }else{
            novoSaldo = getSaldo() + valor + (valor*0.035);
        }
        setSaldo(novoSaldo);
    }
}
