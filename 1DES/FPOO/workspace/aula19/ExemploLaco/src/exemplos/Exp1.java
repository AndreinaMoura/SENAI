package exemplos;

import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("Digite 1 para sair");
			opcao = scan.nextInt();
		}while(opcao != 1); {
		System.out.println("Adeus");
		}
	}

}
