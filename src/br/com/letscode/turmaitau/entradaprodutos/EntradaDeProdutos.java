package br.com.letscode.turmaitau.entradaprodutos;
import br.com.letscode.turmaitau.comparacaoprodutos.CompararProdutos;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaDeProdutos {

    public void entradaProdutos (){

        Scanner entrada = new Scanner(System.in);
        String operacao="S";
        ArrayList<String> nomeProdutoArray = new ArrayList<>();
        ArrayList<Double> valorTotalProdutoArray = new ArrayList<>();

        do {

            System.out.println("Digite o nome do produto: ");
            String nomeProduto = entrada.next();

            System.out.println("Digite o valor do produto: ");
            double valorTotalProduto = entrada.nextDouble();

            nomeProdutoArray.add (nomeProduto);
            valorTotalProdutoArray.add(valorTotalProduto);

            System.out.println("Deseja incluir mais um produto? Digite S para sim ou N para não: ");
            operacao = entrada.next();

        }while (operacao.equals("S"));

        //new CompararProdutos().maiorValor(nomeProdutoArray, valorTotalProdutoArray);
        //new CompararProdutos().menorValor(nomeProdutoArray, valorTotalProdutoArray);
    }

}
