package sla;

import java.util.Scanner;

//1 - Faça um programa que lê 10 números inteiros do teclado e armazene em um vetor. Ao final imprima o vetor armazenado nos dois sentidos.
public class Ex1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] v = new int[10];
		System.out.println("Digite 10 valores: ");
		for(int i=0;i<v.length;i++) {
			v[i]=scan.nextInt();
		}
		System.out.println("Sentido normal");
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+"\t");
		}
		System.out.println("\nSentido inverso");
		for(int i=0;i<v.length;i++) {
            System.out.print(v[9-i]+"\t");
        }
	}
}