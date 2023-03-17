package exercicios;

import java.util.Random;

public class Ex3 {
	static Random r = new Random();

	public static void main(String[] args) {
		// 3 Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.
		int matriz[][] = new int[3][3];
		

		System.out.println("Matriz 3x3");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = r.nextInt(100);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Matriz Transposta");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.print(matriz[j][i] + "\t");
				}
			System.out.println();
		}
	}
}
