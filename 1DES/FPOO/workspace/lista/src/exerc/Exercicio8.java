package exerc;

import java.util.Scanner;

public class Exercicio8 {


	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int v1,v2,rest;
		System.out.print("Digite o 1 valor: ");
		v1 = entrada.nextInt();
		System.out.print("Digite o 2 valor: ");
		v2 = entrada.nextInt();
		rest=v1%v2;
		System.out.println("O resto da divisão é de "+rest);


	}

}
