package br.com.letscode.turmaitau.cotacao;

import java.util.Scanner;

public class ConversaoMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a cotação do dolar (US$): ");
        double cotacaoDolar = entrada.nextDouble();

        System.out.println("Digite o Valor Total de dolar que deseja comprar: ");
        double valorTotalDolar = entrada.nextDouble();

        new Conversao().converter(cotacaoDolar, valorTotalDolar);

    }
}
