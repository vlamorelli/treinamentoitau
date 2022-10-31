package br.com.letscode.turmaitau.salarioFuncionario;

import java.text.DecimalFormat;
import java.util.Objects;

public class Funcionario {

    String nome;
    String cpf;
    double salarioBase;

    public void salario(int qtdDias, double salarioBase){

        double salarioProporcional = (salarioBase/30) *qtdDias;

        DecimalFormat fmt = new DecimalFormat("0.00");
        StringBuffer sb = new StringBuffer();
        sb.append("Funcionário: " + this.nome).append("\n");
        sb.append("Salário Base: " + this.salarioBase).append("\n");
        sb.append("Quantidade de dias trabalhado: " + qtdDias).append("\n");
        sb.append("Salário Proporcional: " + fmt.format(salarioProporcional));
        System.out.println(sb.toString());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Double.compare(that.salarioBase, salarioBase) == 0 && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf);
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
}
