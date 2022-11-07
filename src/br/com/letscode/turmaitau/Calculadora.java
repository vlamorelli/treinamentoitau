package br.com.letscode.turmaitau;

import java.util.Scanner;

public class Calculadora {
    static double RESULTADO = 0;
//comentario para exercicio do pull (aula GIT) - sem alterações
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double numeroInt1;
        double numeroInt2;

        System.out.println("Entre com o 1º número = ");
        numeroInt1 = input.nextDouble();
        System.out.println("Entre com o 2º número = ");
        numeroInt2 = input.nextDouble();

        somar(numeroInt1, numeroInt2);
        subtrair(numeroInt1, numeroInt2);
        multiplicar(numeroInt1, numeroInt2);
        dividir(numeroInt1, numeroInt2);
    }
    static void somar (double var1, double var2){
        RESULTADO= var1 + var2;
        System.out.println("Soma = " + RESULTADO);
    }
    static void subtrair (double var1, double var2){
        RESULTADO= var1 - var2;
        System.out.println("Subtrair = " + RESULTADO);
    }
    static void multiplicar (double var1, double var2){
        RESULTADO= var1 * var2;
        System.out.println("multiplicar = " + RESULTADO);
    }
    static void dividir (double var1, double var2){
        if (var2==0) {
            System.out.println("Não é possível divisão por zero(0)");
        }else{
            RESULTADO = var1 / var2;
            System.out.println("dividir = " + RESULTADO);
        }
    }
}
