package exercicios;

import java.util.Scanner;

public class Ex2 {
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		//2 Leia uma matriz 5 x 5. Leia tambem um valor X. O programa devera fazer uma busca desse valor na matriz 
		//e, ao final, escrever a localização (linha e coluna) ou uma mensagem de "nao encontrado".
		int maior = 0;
		int matriz[][] = new int[5][5];
		System.out.println("Matriz 5x5");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = scan.nextInt(100);
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (maior < matriz[i][j]) {
					maior = matriz[i][j];

				}
			}
		}
		System.out.println("\nO maior valor é " + maior);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (maior == matriz[i][j]) {
					System.out.println("Linha: " + (i + 1) + "\tColuna: " + (j + 1));
				}
			}
		}

	}

}
