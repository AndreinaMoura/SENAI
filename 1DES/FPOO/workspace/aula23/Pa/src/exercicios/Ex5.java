package exercicios;

import java.util.Random;

public class Ex5 {
	static Random r = new Random();
	
	public static void main(String[] args) {
		// 5 Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao abaixo da diagonal principal.
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
		int matrix = matriz[1][0] + matriz[2][1];
		System.out.println("\nSoma da diagonal é " + matrix);

	}

}
