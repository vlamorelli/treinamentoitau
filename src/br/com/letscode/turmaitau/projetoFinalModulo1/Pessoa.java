package br.com.letscode.turmaitau.projetoFinalModulo1;
import java.util.Scanner;

public class Pessoa {

    private String nome;
    Scanner entrada = new Scanner(System.in);

    public Pessoa(String nome) {

       /* System.out.println("Digite o nome: ");
        nome = entrada.next();*/
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
