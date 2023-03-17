package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int opcao = 0;

		Scanner scan = new Scanner(System.in);
		Login log = new Login();
		do {
			System.out.println("1-Cadastrar");
			System.out.println("2-Acessar");
			System.out.println("0-Sair");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe o usuário: ");
				String nome = scan.next();

				System.out.println("Informe a senha: ");
				String senha = scan.next();

				String data = nome + "\t" + senha;
				log.cadastrar(data, "Login", true);
				break;
			case 2:
				ArrayList<String> infoFile = log.ler("Login");

				System.out.println("Insira o usuário: ");
				String b1 = scan.next();
				System.out.println("Insira a senha: ");
				String b2 = scan.next();

				for (String linha : infoFile) {
					String[] temp = linha.split("\t");
					if ((temp[0].toLowerCase().contains(b1.toLowerCase()))
							&& (temp[1].toLowerCase().contains(b2.toLowerCase()))) {
						System.out.println("Acesso Permitido");
						System.out.println("Bem-vindo " + temp[0]);
					}
				}
				break;
			case 0:
				System.out.println("flw");
				break;
			}
		} while (opcao != 0);
	}
}