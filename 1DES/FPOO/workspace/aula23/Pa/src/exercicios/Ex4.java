package exercicios;

import java.util.Random;

public class Ex4 {
	static Random r = new Random();

	public static void main(String[] args) {
		// 4 Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao
		// acima da diagonal principal.
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
		int m = matriz[0][1] + matriz[1][2];
		System.out.println("\nSoma da diagonal é " + m);
	}
}
