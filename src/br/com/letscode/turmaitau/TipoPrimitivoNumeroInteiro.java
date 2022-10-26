package br.com.letscode.turmaitau;

import java.util.Arrays;

public class TipoPrimitivoNumeroInteiro {

    final static String RESULTADO = "Soma = ";

    public static void main(String[] args) {

        short b =1;
        int numeroInt = 5;
        long numeroLong = 5;

        int soma = numeroInt + 10;

        System.out.println(RESULTADO + soma);

        somar(numeroInt, soma);
    }

    static void somar (int var1, int var2){
        int soma= var1 + var2;
        System.out.println(RESULTADO + soma);
    }
}
