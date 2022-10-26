package br.com.letscode.turmaitau;

import java.util.Scanner;

public class GastoMedioCombustivel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tempoViagem;
        double velocidaMedia;

        System.out.println("Entre com o Tempo da Viagem em horas = ");
        tempoViagem = input.nextDouble();
        System.out.println("Entre com a Velocida Media em km/h= ");
        velocidaMedia = input.nextDouble();

        double distancia = distanciaPercorrida(tempoViagem,velocidaMedia);

        double litrosConsumidos = litrosUsados(distancia);

        System.out.println("Velocida Media (km/h) = " + velocidaMedia);
        System.out.println("Tempo Viagem (horas) = " + tempoViagem);
        System.out.println("Distancia percorrida (km) = " + distancia);
        System.out.println("Quantidade de Litros Utilizada = " + litrosConsumidos);

    }
    public static double distanciaPercorrida (double tempoViagem, double velocidaMedia){

        double litros= tempoViagem*velocidaMedia;

        return litros;
    }

    public static double litrosUsados (double distancia){

        double litros= distancia/12;

        return litros;
    }

}
