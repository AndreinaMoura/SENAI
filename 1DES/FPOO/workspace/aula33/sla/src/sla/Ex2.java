package sla;
//2 - Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos na ordem inversa, ou seja, o último elemento passará a ser o primeiro, 
//o penúltimo será o segundo e assim por diante. Imprima os dois vetores.

import java.util.Scanner;

public class Ex2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] v1 = new int[10];
		int[] v2 = new int[10];
		System.out.println("Digite 10 valores: ");
		for(int i=0;i<v1.length;i++) {
			v1[i]=scan.nextInt();
		}
		System.out.println("Sentido normal 1º vetor");
		for(int i=0;i<v1.length;i++) {
			System.out.print(v1[i]+"\t");
		}
		System.out.println("\nSentido inverso 2º vetor");
		for(int i=0;i<v1.length;i++) {
			System.out.print((v2[i]=v1[9-i])+"\t");
		}
	}
}
