package br.com.letscode.turmaitau.projetoModulo2.entidades;

public class PessoaFisica extends Pessoa {

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
