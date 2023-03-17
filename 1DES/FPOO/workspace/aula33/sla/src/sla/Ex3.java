package sla;
//3 - Ler um vetor de 10 elementos inteiros e positivos. Criar um segundo vetor da seguinte forma: os elementos de índice par receberão os respectivos elementos 
//divididos por 2; os elementos de índice ímpar receberão os respectivos elementos multiplicados por 3. Imprima os dois vetores.

import java.util.Scanner;

public class Ex3 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double[] v1 = new double[10];
		double[] v2 = new double[10];
		System.out.println("Digite 10 valores: ");
		for(int i=0;i<v1.length;i++) {
			v1[i]=scan.nextInt();
		}
		System.out.println("1º vetor");
		for(int i=0;i<v1.length;i++) {
			System.out.print(v1[i]+"\t");
		}
		for(int i=0;i<v1.length;i++) {
			if(i%2 == 0) {
				v2[i]=(v1[i]/2);
			}else {
				v2[i]=(v1[i]*3);
			}
		}
		System.out.println("\n2º vetor");
		for(int i=0;i<v1.length;i++) {
			System.out.print(v2[i]+"\t");
		}
	}
}
