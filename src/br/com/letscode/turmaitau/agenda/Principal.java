package br.com.letscode.turmaitau.agenda;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String operacao="S";

        System.out.println("Digite o nome da agenda: ");
        String nomeAgenda = entrada.next();

        Agenda agenda = new Agenda();
        agenda.setNome(nomeAgenda);

        //Contato [] contatos = new Contato[3];
        Set<Contato> contatos = new HashSet<>();
        //List<Contato> contatos = new ArrayList<>();

        do {

            System.out.println("Digite o nome do contato: ");
            String nomeContato = entrada.next();

            System.out.println("Digite o telefone do contato: ");
            String telefoneContato = entrada.next();

            Contato contato = new Contato();
            contato.setNome(nomeContato);
            contato.setTelefone(telefoneContato);

            contatos.add(contato);

            System.out.println("Deseja incluir mais um contato? Digite S para sim ou N para não: ");
            operacao = entrada.next();

        }while (operacao.equals("S"));

        agenda.setContatos(contatos);

        System.out.println(agenda.listaContato());

    }
}
