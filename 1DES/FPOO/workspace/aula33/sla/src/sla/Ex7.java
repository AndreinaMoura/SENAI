package sla;

import java.util.Random;
import java.util.Scanner;

//7 - Dados dois vetores de tamanho N, faça uma função que diga se os mesmos possuam conteúdo igual. 
public class Ex7 {
	static Scanner scan = new Scanner(System.in);
	static Random r = new Random();
	public static void main(String[] args) {
	System.out.print("Digite o tamanho do vetor: ");
	int n = scan.nextInt();
	int v1[] = new int[n];
	int v2[] = new int[n];
	int x=0;
		System.out.println("\n1º vetor");
		for(int i = 0; i<v1.length;i++) {
			v1[i]=r.nextInt(10);
			System.out.print(v1[i]+"\t");
		}
		System.out.println("\n2º vetor");
		for(int i = 0; i<v2.length;i++) {
			v2[i]=r.nextInt(10);
			System.out.print(v2[i]+"\t");
		}
		System.out.println("\nNúmeros iguais");
		for(int i = 0; i<v1.length;i++) {
			for(int j = 0; j<v2.length;j++) {
				if(v1[i] == v2[j]) {
					x = v1[i];
					System.out.print(x+"\t");
					break;
				}
			}
		}
	}
}
