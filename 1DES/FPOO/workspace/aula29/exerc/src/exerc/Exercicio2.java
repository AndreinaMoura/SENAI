package exerc;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float tempo,vel,d;
		System.out.print("Insira a velocidade do carro(Km/h): ");
		vel=entrada.nextInt();
		System.out.print("Insira a distância(Km) a ser percorrida: ");
		d=entrada.nextInt();
		tempo=d/vel;
		System.out.printf("O tempo para percorrer essa distância é de %.2f hora(s)",tempo);

	}

}
