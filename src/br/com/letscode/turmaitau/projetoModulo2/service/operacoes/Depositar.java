package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.*;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;
import br.com.letscode.turmaitau.projetoModulo2.service.AbrirConta;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.Conta.ValidaConta;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.Conta.ValidaContaPessoaFisica;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.Conta.ValidaContaPessoaJuridica;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.ValidaValor;

import java.math.BigDecimal;
import java.util.Scanner;

public class Depositar implements Funcionalidade{

    static final String STRINGSALDO = "Seu saldo é: R$ ";
    @Override
    public void operacoes(Conta novaconta) throws ValidaValorExpection {

        BigDecimal valorComTaxa =  new BigDecimal("0");
        BigDecimal valor=  new BigDecimal("0");;
        BigDecimal novoSaldo=  new BigDecimal("0");;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor que deseja depositar:");
        valor = entrada.nextBigDecimal();
        ValidaValor validaValor = new ValidaValor();
        validaValor.validaValor(valor);

        if(novaconta instanceof ContaInvestimento){

            if (novaconta.getPessoa() instanceof PessoaFisica) {
                novoSaldo = (valor.multiply(new BigDecimal("0.015"))).add(valor).add(novaconta.getSaldo());
            }else{
                novoSaldo = (valor.multiply(new BigDecimal("0.035"))).add(valor).add(novaconta.getSaldo());
            }
            novaconta.setSaldo(novoSaldo);
            System.out.println(STRINGSALDO + novaconta.getSaldo());

        } else if (novaconta instanceof ContaCorrente) {

            novoSaldo = novaconta.getSaldo().add(valor);
            novaconta.setSaldo(novoSaldo);
            System.out.println(STRINGSALDO + novaconta.getSaldo());

        } else if (novaconta instanceof ContaPoupanca) {
            novoSaldo = (valor.multiply(new BigDecimal("0.01"))).add(valor).add(novaconta.getSaldo());
            novaconta.setSaldo(novoSaldo);
            System.out.println(STRINGSALDO + novaconta.getSaldo());
        }

    }
}
