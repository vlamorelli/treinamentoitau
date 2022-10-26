package br.com.letscode.turmaitau.precoProdutos;

import java.util.Scanner;

public class PrecoProdutos {

    public double[] preçoProdutosNaCesta(String[] nomeProdutos){

        double [] precoProdutos = new double[nomeProdutos.length];
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < nomeProdutos.length; i++){

            System.out.println("Digite o preço do(a): " + nomeProdutos[i]);
            precoProdutos[i] = entrada.nextDouble();

        }
        return precoProdutos;
    }
}
