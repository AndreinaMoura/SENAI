package model;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
	static Scanner scan = new Scanner(System.in);
	static Random r = new Random();
	public static void main(String[] args) {
		int[][] x = matriz();
		int opcao=0;
		int z = 0;
		int y = 0;
		while(opcao!=5) {
		System.out.print("\n\n1. Mostrar quais valores são ímpares, o maior e menor valor e sua quantidade;\n2. Mostrar quais valores são pares, o maior e menor valor par e sua quantidade;\n");
		System.out.print("3. A média e mediana entre os pares;\n4. A média e mediana entre os ímpares;\n5.Sair\nEscolha: ");
		opcao = scan.nextInt();	
		switch(opcao) {
				case 1:
					impar(x);
					mostrarimpar(x);
					break;
				case 2:
					par(x);
					mostrarpar(x);
					break;
				case 3: 
					mediaMedianaPar(x,y);
					break;
				case 4:
					mediaMedianaImpar(x,z);					
					break;
				case 5:
					System.out.println("flw");					
					break;
				default:
					System.out.println("Opção Inválida");
					break;
			}
		}
	}
	
	public static int[][] matriz(){
		int qtd=5;
		int[][] matriz = new int[qtd][qtd];
		for(int i=0;i<qtd;i++) {
			System.out.println();
			for(int j=0;j<qtd;j++) {
				matriz[i][j]=r.nextInt(100);
				System.out.print(matriz[i][j]+"\t");
				
			}
		}
		System.out.println("\n");
		return matriz;
	}
	public static void mostrarimpar(int x [][]){
		int maiorImpar = 0;
		int menorImpar = 100;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				int y = x[i][j];
			if((y%2) != 0) {
				for(int k=0;k<x.length;k++) {
					for(int l=0;l<x.length;l++) {
						if(y > maiorImpar) {
							maiorImpar = y;					
						 }else if(y < menorImpar) {
							 menorImpar = y;						 					 
				 		}
					}
				}
			}
		}	
	}
	System.out.println("Maior impar: "+maiorImpar);
	System.out.println("Menor impar: "+menorImpar);

}
	public static void impar(int x [][]){
		int z=0;
		int c=0;
		System.out.println("\nNúmeros impares:\n");
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				int y = x[i][j]%2;
				z=x[i][j];
				if(y != 0) {
					c++;
					System.out.print(z+"\t");
				}
			}
		}
		System.out.println("\n\nQuantidade de números impares: "+c);
	}
	public static void mostrarpar(int x [][]){
		int maiorPar = 0;
		int menorPar = 100;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				int y = x[i][j];
				if((y%2) == 0) {		
					for(int k=0;k<x.length;k++) {
						for(int l=0;l<x.length;l++) {
							if(y > maiorPar) {
								maiorPar = y;					
							 }else if(y < menorPar) {
								 menorPar = y;						 					 
					 		}
						}
					}
				}
			}
		}
	System.out.println("\nMaior par: "+maiorPar);
	System.out.println("Menor par: "+menorPar);	
}
	
	public static void par(int x [][]){
			int z=0;
			int c=0;
			System.out.println("\nNúmeros pares:\n");
			
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<x.length;j++) {
					int y = x[i][j]%2;
					z=x[i][j];
					if(y == 0) {
						c++;
						System.out.print(z+"\t");
				}
			}
		}
		System.out.println("Quantidade de números pares: "+c);
	}
	public static void mediaMedianaImpar(int[][] x, int a) {
		int z=0;
		int c=0;
		int acumula=0;
		int media=0;
		
		System.out.println("\nNúmeros impares:\n");
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				int y = x[i][j]%2;
				z=x[i][j];
				if(y != 0) {
					c++;
					acumula+=z;
				}
			}
		}
		int esq=0;
		int dir=x.length-1;
		int meio;
		meio=(esq+dir)/2;
		int mediana = x[meio][meio];
		media=acumula/c;
		System.out.println("A media dos números impares é "+media);
		System.out.println("A mediana dos números impares é "+mediana);
	}
	public static void mediaMedianaPar(int[][] x,int a) {
		int z=0;
		int c=0;
		int acumula=0;
		int media=0;
		
		System.out.println("\nNúmeros pares:\n");
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				int y = x[i][j]%2;
				z=x[i][j];
				if(y == 0) {
					c++;
					acumula+=z;
				}
			}
		}
		int esq=0;
		int dir=x.length-1;
		int meio;
		meio=(esq+dir)/2;
		int mediana = x[meio][meio];
		media=acumula/c;
		System.out.println("A media dos números pares é "+media);
		System.out.println("A mediana dos números pares é "+mediana);
	}
}
