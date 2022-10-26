package br.com.letscode.turmaitau;

public class Tabuada {

    public static void main(String[] args) {

        int numeroInt = 2;

         tabuada(numeroInt);
    }

    static void tabuada (int var1){

        for (int i=1;i<=10;i++) {
            System.out.println(var1 + " x " + i + " = " + var1*i);
        }
    }
}



