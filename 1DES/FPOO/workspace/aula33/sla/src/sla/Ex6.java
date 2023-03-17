package sla;
//6 - Utilizando vetores, crie um programa que organize uma quantidade qualquer de números inteiros fornecidos pelo usuário da seguinte forma: primeiro os números 
//pares em ordem crescente e depois os números ímpares em ordem decrescente.

import java.util.Random;
import java.util.Scanner;

public class Ex6 {
	static Scanner scan = new Scanner(System.in);
	static Random r = new Random();
	public static void main(String[] args) {
		System.out.print("Digite a quantidade de números que deseja organizar: ");
		int qtd = scan.nextInt();
		int x=0;
		int y=0;
		int par=0;
		int impar=0;
		int[] v1 = new int[qtd];
		System.out.println("1º Vetor");
		for(int i=0;i<v1.length;i++) {
			v1[i] = r.nextInt(10);
			if(v1[i]%2 == 0) {
				x++;
			}else {
				y++;
			}
		}
		for(int i=0;i<v1.length;i++) {
			System.out.print(v1[i]+"\t");	
		}
		
		int[] v2 = new int[x];
		int[] v3 = new int[y];
		for(int i=0;i<v1.length;i++) {
			if(v1[i]%2 == 0) {
				v2[par]=v1[i];
				par++;
			}else {
				v3[impar]=v1[i];
				impar++;
			}
		}
		int p = 0;
		for(int i = 0; i<v2.length;i++) {
			for(int j = 0; j<v2.length;j++) {
				if(v2[i]<v2[j]) {
					p = v2[i];
					v2[i] = v2[j];
					v2[j] = p;
				}
			}
		}
		for(int i = 0; i<v3.length;i++) {
			for(int j = 0; j<v3.length;j++) {
				if(v3[i]>v3[j]) {
					p = v3[i];
					v3[i] = v3[j];
					v3[j] = p;
				}
			}
		}
		
		System.out.println("\n2º Vetor");
		for(int i=0;i<v2.length;i++) {
			System.out.print(v2[i]+"\t");
		}
		System.out.println("\n3º Vetor");
		for(int i=0;i<v3.length;i++) {
			System.out.print(v3[i]+"\t");
		}
	}
}