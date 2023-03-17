package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int n1;
	public static int n2;
	public static int n3;

	public static void main(String[] args){
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		Aluno arq = new Aluno();
		do {
			System.out.println("1-Cadastrar Aluno");
			System.out.println("2-Listar Alunos");
			System.out.println("0-Sair");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe o nome: ");
				String nome = scan.next();

				System.out.println("Informe a 1° nota: ");
				n1 = scan.nextInt();

				System.out.println("Informe a 2° nota: ");
				n2 = scan.nextInt();

				System.out.println("Informe a 3° nota: ");
				n3 = scan.nextInt();

				String data = nome + "\t" + media();
				arq.cadastrar(data, "Alunos", true);
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Alunos");

				for (String linha : infoFile) {
					System.out.println(linha);
				}
				break;
			case 0:
				System.out.println("flw");
				break;
			}
		} while (opcao != 0);
	}

	public static double media() {
		double media =(n1+n2+n3)/3;
		return media;
	}
}
