package exerc;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,b,c,r;
		System.out.println("Digite os valores de A, B, C:");
		a=entrada.nextInt();
		b=entrada.nextInt();
		c=entrada.nextInt();
		r=(a+b)/c;
		System.out.printf("(%d + %d)/%d = %d",a,b,c,r);
		

	}

}
