package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;



import br.com.letscode.turmaitau.projetoModulo2.entidades.Conta;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;
import br.com.letscode.turmaitau.projetoModulo2.service.Taxacao;
import br.com.letscode.turmaitau.projetoModulo2.service.validation.ValidaValor;

import java.math.BigDecimal;
import java.util.Scanner;

public class Sacar implements Funcionalidade{


    static final String STRINGSALDO = "Seu saldo é: R$ ";

    @Override
    public void operacoes(Conta novaconta) throws ValidaValorExpection {

        BigDecimal valorComTaxa =  new BigDecimal("0");
        BigDecimal valor=  new BigDecimal("0");;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor que deseja sacar:");
        valor = entrada.nextBigDecimal();
        ValidaValor validaValor = new ValidaValor();
        validaValor.validaValor(valor);

        Taxacao taxacao = new Taxacao();
        valorComTaxa = taxacao.calculaTaxa(valor, novaconta);
        BigDecimal novoSaldo = novaconta.getSaldo().subtract(valorComTaxa);
        novaconta.setSaldo(novoSaldo);
        System.out.println(STRINGSALDO + novaconta.getSaldo());

    }


}
