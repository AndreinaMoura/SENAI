package vsao;

import java.util.Scanner;

import controle.ProcessaPlanilha;

public class Tela {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = 0;
		ProcessaPlanilha.carregar();
		
		while (menu != 5) {
			System.out.println("1.Adi��o\n2.Multiplica��o\n3.Subtra��o\n4.Divis�o\n5.Sair\n");
			menu = scan.nextInt();
			
			ProcessaPlanilha.saida(menu);	
		}
	}
}