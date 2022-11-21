package br.com.letscode.turmaitau.operacoes;

import br.com.letscode.turmaitau.projetoFinalModulo1.ValidaValorExpection;

public class CriarOperacao {

    public OperacaoInterface criarOperacao (String operador) throws ValidaOperadorExpection {

        switch (operador) {
            case "+":
                return new Somar();
            case "-":
                return new Subtrair();
            case "/":
                return new Dividir();
            case "x":
                return new Multiplicar();
            case "t":
                return new Tabuada();
            default:
                throw new ValidaOperadorExpection("Operador invalido");

        }
    }
}