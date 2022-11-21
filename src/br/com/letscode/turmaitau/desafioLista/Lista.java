package br.com.letscode.turmaitau.desafioLista;

import java.util.*;

public class Lista {

    public static void main(String[] args) {

        String lista_1 = "1,100,22,33,44,3,4,8,9,2";
        String lista_2 = "7,2,5,1,6,8,99,100";
        Set<Integer> lista_3 = new HashSet<>();

        incluirLista(lista_1, lista_3);
        incluirLista(lista_2, lista_3);

       /* for (int i=0; i<lista_1.length();i++){
            lista_3.add(Integer.valueOf(lista_1.substring(i,++i)));
        }
        for (int i=0; i<lista_2.length();i++){
            lista_3.add(Integer.valueOf(lista_2.substring(i,++i)));
        }*/

        List listaordenada = Arrays.asList(lista_3.toArray());
        Collections.sort(listaordenada, Collections.reverseOrder());
        System.out.println(listaordenada);

    }

    public static void incluirLista(String lista, Set lista_3){

        String guardacaracter="";
        String inputLista = "";

        for (int i=0; i<lista.length();i++){
            guardacaracter = String.valueOf(lista.charAt(i));
            if(guardacaracter.equals(",")){
                lista_3.add(Integer.valueOf(inputLista));
                guardacaracter="";
                inputLista = "";
            }else {
                inputLista += guardacaracter;
            }
        }
        lista_3.add(Integer.valueOf(inputLista));
    }
}
