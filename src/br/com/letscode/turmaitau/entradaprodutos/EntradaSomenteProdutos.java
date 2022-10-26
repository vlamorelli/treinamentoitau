package br.com.letscode.turmaitau.entradaprodutos;

import java.util.Scanner;

public class EntradaSomenteProdutos {

    public String[] produtosNaCesta(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos produtos tem na sua cesta?");
        int qtdProduto = entrada.nextInt();

        String [] nomeProdutos = new String[qtdProduto];

        for(int i = 0; i<qtdProduto; i++){

            System.out.println("Digite o nome do " + (i+1) + "º produto:");
            nomeProdutos[i] = entrada.next();
        }

        return nomeProdutos;
    }

}
