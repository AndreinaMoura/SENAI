package projetos;

import java.util.Scanner;

public class Lista2_2 {
	public static Scanner entrada;
	int[] idades= new int[5];
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		leVetor();	
	}
	public static void  leVetor() {
		for(int i = 0; i < 5 ;i++) {
			idades[i]=entrada.nextInt();
		}
	}
}
