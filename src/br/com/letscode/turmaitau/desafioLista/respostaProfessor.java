package br.com.letscode.turmaitau.desafioLista;


import java.util.*;

public class respostaProfessor {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,100,22,33,44,3,4,8,9,2);
        List<Integer> list2 = Arrays.asList(7,2,5,1,6,8,99,100);
        Set<Integer> result = new HashSet<>();

        result.addAll(list1);
        result.addAll(list2);
        List<Integer> resultList = new ArrayList<>(result);
        Collections.sort(resultList);
        Collections.reverse(resultList);
        for (Integer num : resultList) {
            System.out.println(num);
        }
    }
}
