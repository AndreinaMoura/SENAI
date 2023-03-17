package sla;
//5 - Faça um programa que leia e monte dois vetores de números inteiros com 20 números cada. Depois de montados gere um terceiro vetor formado pela diferença dos 
//dois vetores lidos, um quarto vetor formado pela soma dos dois vetores lidos e por último um quinto vetor formado pela multiplicação dos dois vetores lidos.

import java.util.Random;

public class Ex5 {
	static Random r = new Random();
	public static void main(String[] args) {
	int v1[]=new int[20];
	int v2[]=new int[20];
	int v3[]=new int[20];
	int v4[]=new int[20];
	int v5[]=new int[20];
		for(int i=0;i<v1.length;i++) {
			v1[i]=r.nextInt(10);
			v2[i]=r.nextInt(10);
		}
		for(int i=0;i<v1.length;i++) {
			v3[i]=v1[i]-v2[i];
			v4[i]=v1[i]+v2[i];
			v5[i]=v1[i]*v2[i];
		}
		System.out.println("1º vetor");
		for(int i=0;i<v1.length;i++) {
			System.out.print(v1[i]+"\t");
		}
		System.out.println("\n2º vetor");
		for(int i=0;i<v1.length;i++) {
			System.out.print(v2[i]+"\t");	
			}
		System.out.println("\n3º vetor");
		for(int i=0;i<v1.length;i++) {
			System.out.print(v3[i]+"\t");
		}
		System.out.println("\n4º vetor");
		for(int i=0;i<v1.length;i++) {
			System.out.print(v4[i]+"\t");
		}
		System.out.println("\n5º vetor");
		for(int i=0;i<v1.length;i++) {
			System.out.print(v5[i]+"\t");	
		}
	}
}
