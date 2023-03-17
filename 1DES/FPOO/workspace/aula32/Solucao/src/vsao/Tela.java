package vsao;

import java.util.Scanner;

import controle.ProcessaPlanilha;

public class Tela {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = 0;
		ProcessaPlanilha.carregar();
		
		while (menu != 5) {
			System.out.println("1.Adição\n2.Multiplicação\n3.Subtração\n4.Divisão\n5.Sair\n");
			menu = scan.nextInt();
			
			ProcessaPlanilha.saida(menu);	
		}
	}
}