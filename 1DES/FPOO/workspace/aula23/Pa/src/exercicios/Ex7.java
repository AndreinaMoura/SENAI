package exercicios;

import java.util.Random;

public class Ex7 {
	static Random r = new Random();

	public static void main(String[] args) {
		// 7 Leia uma matriz 10 x 3 com as notas de 10 alunos em 3 provas. Em seguida,
		// escreva o número de alunos cuja pior nota foi na prova 1, o número de alunos
		// cuja pior nota foi na prova 2, e o numero de alunos cuja pior nota foi na
		// prova 3.
		// Em caso de empate das piores notas de um aluno, o criterio de desempate é
		// arbitrário, mas o aluno deve ser contabilizado apenas uma vez.

		int matriz[][] = new int[10][3];
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("10 Alunos com 3 Notas");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = r.nextInt(100);
			}
		}

		System.out.println("Nota 1\t Nota 2\t Nota 3");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
			System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();

		}
		
		for(int linha = 0; linha < 10; linha++) {
			int n1 = matriz[linha][0];
			int n2 = matriz[linha][1];
			int n3 = matriz[linha][2];
			
			if(n1 < n2){
				if(n1 < n3)
					a++;
			    else
			    	c++;
			}else{
				if(n2 < n3)
					b++;
			    else
			      	c++;
			}
		}
		
		System.out.println("Quantidade de alunos que foram mal na primeira prova: " + a);
		System.out.println("Quantidade de alunos que foram mal na segunda prova: " + b);
		System.out.println("Quantidade de alunos que foram mal na terceira prova: " + c);
	}
}
