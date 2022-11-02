package br.com.letscode.turmaitau.salarioFuncionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class FuncionarioComEncapsulamento {

     String nome;
    String cpf;
     BigDecimal salarioBase;

    public FuncionarioComEncapsulamento(String nome, String cpf, BigDecimal salarioBase) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalarioBase(salarioBase);
    }

    public void salario(int qtdDias){

        String qtddias = String.valueOf(qtdDias);

        BigDecimal salarioProporcional = salarioBase.divide(new BigDecimal(30),4, RoundingMode.HALF_EVEN).multiply(new BigDecimal(qtddias));

        StringBuffer sb = new StringBuffer();
        sb.append("Funcionário: " + this.nome).append("\n");
        sb.append("Salário Base: " + this.salarioBase).append("\n");
        sb.append("Quantidade de dias trabalhado: " + qtdDias).append("\n");
        sb.append("Salário Proporcional: " + salarioProporcional);
        System.out.println(sb.toString());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuncionarioComEncapsulamento that = (FuncionarioComEncapsulamento) o;
        return Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(salarioBase, that.salarioBase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, salarioBase);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Funcionario{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cpf='").append(cpf).append('\'');
        sb.append(", salarioBase=").append(salarioBase);
        sb.append('}');
        return sb.toString();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }
}


