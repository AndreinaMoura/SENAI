package laco;

import java.util.Random;
import java.util.Scanner;

public class ex03 {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random(10);
	public static void main(String[] args) {
		int[] x = new int[10];
		int menor=999999999;
		int maior=0;
		System.out.println("Digite 10 valores: ");
		
		for(int i= 0; i< x.length;i++) {
			x[i] = scan.nextInt();	
			if(x[i] < menor) {
				menor = x[i];	
			}
			if(x[i] > maior) {
				maior = x[i];
			}			
		}
		System.out.println(maior+" é o maior valor");
		System.out.println(menor+" è o menor valor");
		
	}
}
