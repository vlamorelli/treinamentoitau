package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta{

    BigDecimal novoSaldo =  new BigDecimal("0");

    public ContaInvestimento(String numero, Pessoa pessoa, BigDecimal saldo) {
        super(numero, pessoa, saldo);
    }

    public void depositar(BigDecimal valor) {
        //double novoSaldo = 0.0;
        if (getPessoa() instanceof PessoaFisica) {
            //novoSaldo = getSaldo() + valor + (valor*0.015);
            novoSaldo = (valor.multiply(new BigDecimal("0.015"))).add(valor).add(getSaldo());
            //valorComTaxa = (valor.multiply(new BigDecimal(0.005))).add(valor);
        }else{
            //novoSaldo = getSaldo() + valor + (valor*0.035);
            novoSaldo = (valor.multiply(new BigDecimal("0.035"))).add(valor).add(getSaldo());
        }
        setSaldo(novoSaldo);
        System.out.println(STRINGSALDO + getSaldo());
    }
}
