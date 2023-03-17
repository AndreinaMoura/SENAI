package exerc;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.print("Digite um numero inteiro, positivo e diferente de zero: ");
		n = entrada.nextInt();
		if(n==0) {
			System.out.println("Número invalido!");
		}else if(n<0) {
			System.out.println("Número invalido!");
		}else {
			System.out.println(n=n-1);
			System.out.println(n=n+1);
			
		}
	}

}
