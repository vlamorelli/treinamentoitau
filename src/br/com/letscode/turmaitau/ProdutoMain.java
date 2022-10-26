package br.com.letscode.turmaitau;

import br.com.letscode.turmaitau.comparacaoprodutos.CompararProdutos;
import br.com.letscode.turmaitau.entradaprodutos.EntradaSomenteProdutos;
import br.com.letscode.turmaitau.precoProdutos.PrecoProdutos;

public class ProdutoMain {

    public static void main(String[] args) {

           //new EntradaDeProdutos().entradaProdutos();
            String[] nomeProdutos = new EntradaSomenteProdutos().produtosNaCesta();
            double[] precoProdutos = new PrecoProdutos().preçoProdutosNaCesta(nomeProdutos);
            new CompararProdutos().maiorValor(nomeProdutos, precoProdutos);
            new CompararProdutos().menorValor(nomeProdutos, precoProdutos);
    }
}