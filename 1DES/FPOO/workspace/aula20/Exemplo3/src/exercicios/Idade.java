package exercicios;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int id;
		System.out.println("Digite sua idade: ");
		id = entrada.nextInt();
		if(id >= 18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você é menor de idade");
		}
	}

}
