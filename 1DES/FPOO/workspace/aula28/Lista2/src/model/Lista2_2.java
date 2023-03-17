package model;

import java.util.Scanner;

public class Lista2_2 {
		public static Scanner entrada;
		public static void main(String[] args) {
			entrada = new Scanner(System.in);
			int[] idades= leVetor();
			mostra(idades);
			int maiorIdade=maiorIdade(idades);
			System.out.print("A maior idades é: "+maiorIdade);
		}
		public static int[] leVetor() {
			int[] leVetor = new int[5];
			for(int i = 0; i < leVetor.length ;i++) {
				System.out.print("Digite uma idade: ");
				leVetor[i]=entrada.nextInt();
		}	
			return leVetor;
	}
		public static void mostra(int[] Imprimir) {
			for(int i=0; i< Imprimir.length;i++) {
				System.out.println(i+"\t"+Imprimir[i]);
		}
	}
		public static int maiorIdade(int[] Calcular) {
			int maiorIdade=0;
			for(int i=0; i< Calcular.length;i++) {
				if(Calcular[i]>maiorIdade) {
					maiorIdade= Calcular[i];
				}
			}
				return maiorIdade;
	}
}
