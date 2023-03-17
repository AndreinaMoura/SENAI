package modelo;

import java.util.Random;

public class Matrizes {
	public static Random rand;
	public static void main(String[] args) {
		rand = new Random();
		System.out.println("Vetor\n");
		vetor1();
		System.out.println("\nMatriz 3x9");
		vetor2();
		System.out.println("\nMatriz 3x3x3");
		vetor3();
		System.out.println("\nMatriz dinamica 3x3x3");
		vetor4(3,3,3);

	}
	static void vetor1() {
		int x[] = new int[27] ;
		for(int i=0; i<27;i++) {
			x[i]=rand.nextInt(10);
			System.out.println(x[i]);
		}
	}
	static void vetor2() {
		int y[][] = new int[3][9];
		for(int i=0; i<3;i++) {
			for(int j=0; j<9;j++) {
				y[i][j]=rand.nextInt(10);
			}
		}
		for(int i=0; i<3;i++) {
			System.out.println();
			for(int j=0; j<9;j++) {
				y[i][j]=rand.nextInt(10);
				System.out.print(y[i][j]+"\t");
			}
		}
		System.out.println();
	}
	static void vetor3() {
		int z[][][] = new int[3][3][3];
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				for(int k=0; k<3;k++) {
					z[i][j][k]=rand.nextInt(10);
				}
			}
		}
		for(int i=0; i<3;i++) {
			System.out.println();
			for(int j=0; j<3;j++) {
				System.out.println();
				for(int k=0; k<3;k++) {
					z[i][j][k]=rand.nextInt(10);
					System.out.print(z[i][j][k]+"\t");
				}
			}
		}
		System.out.println();
	}
	static void vetor4(int x,int y,int t) {
		int z[][][] = new int[x][y][t];
		for(int i=0; i<3;i++) {
			System.out.println();
			for(int j=0; j<3;j++) {
				System.out.println();
				for(int k=0; k<3;k++) {
					z[i][j][k]=rand.nextInt(10);
					System.out.print(z[i][j][k]+"\t");
				}
			}
		}
	}
}

