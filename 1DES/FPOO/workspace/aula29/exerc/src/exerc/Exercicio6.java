package exerc;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/* 6 – Desenvolva um programa que leia o raio (cm) e a altura (cm) de um 
		 * cilindro. Calcule e mostre a área (cm2) e o volume (cm3) do cilindro.*/
		float area,volume,base,r,h;
		
		System.out.print("Digite o raio do cilindo(cm): ");
		r = entrada.nextFloat();
		System.out.print("Digite a altura do cilindo(cm): ");
		h = entrada.nextFloat();
		base= (float) (3.14 *Math.pow(r,2));
		area= (float) (3.14 *r*(r+h));
		volume=base*h;
		System.out.println("A área em cm do cilindro é "+ area);
		System.out.println("O volume em cm do cilindro é "+ volume);

	}

}
