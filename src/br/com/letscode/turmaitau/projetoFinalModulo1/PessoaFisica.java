package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



}
