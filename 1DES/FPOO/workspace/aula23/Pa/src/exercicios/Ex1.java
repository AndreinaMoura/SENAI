package exercicios;

import java.util.Random;

public class Ex1 {
	static Random r = new Random();

	public static void main(String[] args) {
		// 1 Leia uma matriz 5 x 5, imprima a matriz e retorne a localizaçao (linha e a
		// coluna) do maior valor.
		int maior = 0;
		int matriz[][] = new int[5][5];
		System.out.println("Matriz 5x5");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = r.nextInt(100);
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
