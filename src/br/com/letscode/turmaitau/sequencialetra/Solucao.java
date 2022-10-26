package br.com.letscode.turmaitau.sequencialetra;

public class Solucao {

    public void substring (String [] substring){

        String texto=null;
        String concatenar = "";
        byte proximoCaracter=0;
        char firstCaracter = 0;
        char nextCaracter = 0;
        String maiorString = "";
        boolean flag = false;

        for(int i=0; i<substring.length; i++){

            texto = substring[i];
            byte primeiroCaracter = (byte) texto.charAt(0);

            for (int j=1; j<texto.length(); j++){
                proximoCaracter = (byte) texto.charAt(j);
                if (++primeiroCaracter==proximoCaracter){
                    firstCaracter = (char) --primeiroCaracter;
                    nextCaracter = (char)proximoCaracter;
                    if (flag==true){
                        concatenar = "";
                        flag = false;
                    }
                    if (concatenar==""){
                        concatenar = new StringBuilder().append(firstCaracter).append(nextCaracter).toString();
                    }else{
                        concatenar = concatenar + new StringBuilder().append(nextCaracter).toString();
                    }
                    primeiroCaracter = proximoCaracter;
                }else{
                    flag = true;
                    if (concatenar.length()>maiorString.length()){
                        maiorString = concatenar;
                    }
                    primeiroCaracter = (byte) texto.charAt(j);
                }

            }
            if (concatenar.length()>maiorString.length()){
                maiorString = concatenar;
            }

        }
        System.out.println(maiorString);

    }
}
