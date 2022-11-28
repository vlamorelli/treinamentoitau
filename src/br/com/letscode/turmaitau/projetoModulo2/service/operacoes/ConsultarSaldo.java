package br.com.letscode.turmaitau.projetoModulo2.service.operacoes;

import br.com.letscode.turmaitau.projetoModulo2.entidades.Conta;

import java.math.BigDecimal;

public class ConsultarSaldo implements Funcionalidade<Conta>{
    @Override
    public void operacoes(Conta novaconta) {

        System.out.printf("O saldo da conta é: %.2f %n",  (novaconta.getSaldo()));

    }
}
