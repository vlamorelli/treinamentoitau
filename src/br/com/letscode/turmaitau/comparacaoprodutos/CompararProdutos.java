package br.com.letscode.turmaitau.comparacaoprodutos;

import java.util.ArrayList;

public class CompararProdutos {

    public void maiorValor(String[] nomeProdutos, double[] precoProdutos) {

        double valorMaior = precoProdutos[0];
        String produtoMaior = nomeProdutos[0];

        for (int i = 0; i < precoProdutos.length; i++) {

            if (precoProdutos[i] > valorMaior) {
                valorMaior = precoProdutos[i];
                produtoMaior = nomeProdutos[i];
            }
        }
        System.out.println("Produto com maior valor: " + produtoMaior + " - R$: " + valorMaior);
    }

    public void menorValor(String[] nomeProdutos, double[] precoProdutos) {

        double valorMenor = precoProdutos[0];
        String produtoMenor = nomeProdutos[0];

        for (int i = 0; i < precoProdutos.length; i++) {

            if (precoProdutos[i] < valorMenor) {
                valorMenor = precoProdutos[i];
                produtoMenor = nomeProdutos[i];
            }

        }
        System.out.println("Produto com menor valor: " + produtoMenor + " - R$: " + valorMenor);
    }
}

/*        public void maiorValor (ArrayList<String> nomeProdutoArray, ArrayList<Double> valorTotalProdutoArray){

            double valorMaior = valorTotalProdutoArray.get(0);
            String produtoMaior = nomeProdutoArray.get(0);

            for (int i = 0; i < valorTotalProdutoArray.size(); i++) {

                if (valorTotalProdutoArray.get(i) > valorMaior) {
                    valorMaior = valorTotalProdutoArray.get(i);
                    produtoMaior = nomeProdutoArray.get(i);
                }
            }
            System.out.println("Produto com maior valor: " + produtoMaior + " - R$: " +  valorMaior);
        }
    public void menorValor (ArrayList<String> nomeProdutoArray, ArrayList<Double> valorTotalProdutoArray){

        double valorMenor = valorTotalProdutoArray.get(0);
        String produtoMenor = nomeProdutoArray.get(0);

        for (int i = 0; i < valorTotalProdutoArray.size(); i++) {

            if (valorTotalProdutoArray.get(i)<valorMenor){
                valorMenor= valorTotalProdutoArray.get(i);
                produtoMenor = nomeProdutoArray.get(i);
            }

        }
        System.out.println("Produto com menor valor: " + produtoMenor + " - R$: " +  valorMenor);
    }

 */

