package br.com.letscode.turmaitau.cotacao;

public class Conversao {

    public void converter (double cotacaoDolar, double valorTotalDolar){

        double valorConvertidoReal = cotacaoDolar * valorTotalDolar;
        System.out.println("Valor total convertido em reais: R$ " + valorConvertidoReal);
    }

}
