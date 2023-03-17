package exerc;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		/* 7 – Um laboratório de Física está estudando barras de calcário para 
		 * Construção Civil, e precisa saber a densidade de cada barra. Faça um 
		 * programa para ajudá-los. (Dado: densidade = massa / volume)*/
		float densidade,massa,volume;
		System.out.print("Digite a massa: ");
		massa = entrada.nextFloat();
		System.out.print("Digite o volume: ");
		volume = entrada.nextFloat();
		densidade=massa/volume;
		System.out.println("A densidade é de "+densidade);

	}

}
