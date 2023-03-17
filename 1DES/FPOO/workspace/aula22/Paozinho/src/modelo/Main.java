package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		Arquivo arq = new Arquivo();
		do {
			System.out.println("1-Cadastrar");
			System.out.println("2-Listar");
			System.out.println("0-Sair");
			opcao = scan.nextInt();
			

			switch (opcao) {
			case 1:
				System.out.println("Informe o seu nome: ");
				String nome = scan.next();

				System.out.println("Informe o sua idade: ");
				String idade = scan.next();

				System.out.println("Informe sua cidade: ");
				String cidade = scan.next();

				String data = nome + ";" + idade + ";" + cidade;
				arq.escrever(data, "Pessoas", true);
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Pessoas");

				
				System.out.println("Digite o nome da cidade: ");
				String busca = scan.next();

				for (String linha : infoFile) {
					String[] temp = linha.split(";");
					if (temp[2].toLowerCase().contains(busca.toLowerCase())) {
						System.out.println("Nome: " + temp[0]);
						System.out.println("Idade: " + temp[1]);
						System.out.println("Cidade: " + temp[2]);
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
