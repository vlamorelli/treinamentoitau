package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Conta;
import br.com.letscode.turmaitau.projetoModulo2.entidades.ContaCorrente;
import br.com.letscode.turmaitau.projetoModulo2.entidades.ContaInvestimento;
import br.com.letscode.turmaitau.projetoModulo2.entidades.ContaPoupanca;
import br.com.letscode.turmaitau.projetoModulo2.exception.ValidaValorExpection;
import br.com.letscode.turmaitau.projetoModulo2.service.operacoes.DepositarContaCorrente;


import java.math.BigDecimal;
import java.util.Scanner;

public class MenuOperacao {

    static final String SEPARADOR = "==============================================================";

    public void operacoes(Conta novaConta) throws ValidaValorExpection {
        //sacar, depositar, transferência, investir e consultar saldo
        String tipoOperacao="C";
        BigDecimal valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem vindo " + novaConta.getPessoa().getNome());

        while (!tipoOperacao.equals("X")) {

            valor = new BigDecimal("0.0");
            StringBuffer sb = new StringBuffer();
            sb.append(SEPARADOR).append("\n");
            sb.append("Qual operação deseja realizar?").append("\n");
            sb.append("Sacar - Digite S").append("\n");
            sb.append("Depositar - Digite D").append("\n");
            sb.append("Transferência - Digite T").append("\n");
            sb.append("Consultar Saldo - Digite C").append("\n");
            sb.append("Sair - Digite X").append("\n");
            sb.append(SEPARADOR);
            System.out.println(sb.toString());
            tipoOperacao = entrada.next().toUpperCase();
            Funcionalidade funcionalidade = null;

            switch (tipoOperacao) {
                case "S":
                    funcionalidade = new Sacar();
                    funcionalidade.operacoes(novaConta);
                    break;
                case "D":
                    funcionalidade = funcionalidadeDepositar(novaConta);
                    funcionalidade.operacoes(novaConta);
                    break;
                case "T":
                    funcionalidade = new Transferir();
                    funcionalidade.operacoes(novaConta);
                     break;
                case "C":
                    funcionalidade = new ConsultarSaldo();
                    funcionalidade.operacoes(novaConta);
                    break;
                case "X":
                    System.out.println("Até a próxima!");
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
                    break;
            }
        }
    }

    private Funcionalidade funcionalidadeDepositar(Conta novaConta){

        if(novaConta instanceof ContaInvestimento){
            return new DepositarContaInvestimento();
        }else if (novaConta instanceof ContaCorrente){
            return new DepositarContaCorrente();
        }else if (novaConta instanceof ContaPoupanca){
            return new DepositarContaPoupanca();
        }
        return null;
    }

}
