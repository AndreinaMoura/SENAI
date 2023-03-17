package model;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	static Random r = new Random();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int qtd = 2;
		String[] nome = new String[qtd];
		int[] matricula = new int[qtd];
		double[] n1 = new double[qtd];
		double[] n2 = new double[qtd];
		double[] n3 = new double[qtd];
		
		
		
		
		for(int i = 10;i>qtd;i--) {
			nome[i]=scan.next();
			matricula[i]=r.nextInt(10);
			n1[i]=scan.nextDouble();
			n2[i]=scan.nextDouble();
			n3[i]=scan.nextDouble();
		}
		for(int i = 0;i<qtd;i++) {
			System.out.println(nome[i]);
			System.out.println(matricula[i]);
			System.out.println(n1[i]);
			System.out.println(n2[i]);
			System.out.println(n3[i]);	
		}	
	}	
}
