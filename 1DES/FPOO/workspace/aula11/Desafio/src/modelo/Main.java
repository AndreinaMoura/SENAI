package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;

		Scanner scan = new Scanner(System.in);
		Arquivo arq = new Arquivo();
		do {
			System.out.println("1-Cadastrar tabela");
			System.out.println("2-Cadastrar lista");
			System.out.println("0-Sair");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				String[] v1 = new String[4];
				System.out.println("Informe a quatidade de linhas: ");
				int qtdl = scan.nextInt();
				System.out.println("Informe a quatidade de colunas: ");
				int qtdc = scan.nextInt();
//				System.out.println("Informe o nome: ");
//				v1[0] = scan.next();
//				
				System.out.println("Informe 3 notas: ");
				v1[0] = scan.next();
				v1[1] = scan.next();
				v1[2] = scan.next();

				String data = "<table border=1> <tr>";
				// "<tr>"+"<th align=center>Nome</th>"+"<th align=center>Nota 1</th>"+"<th
				// align=center>Nota 2</th>"+"<th align=center>Nota 3</th>"+"</tr>"+"<tr>";
				
					for (int j = 0; j < qtdl; j++) {
						data += "<th align=center>" + v1[j] + "</th>";
						for (int i = 0; i < qtdc; i++) {
							data += "<tr>";
						for (int k = 0; k < qtdc; k++) {
							data += "</tr>";
						}
					}
				}
				data += "</tr></table>";

				arq.cadastrar(data, "Site.html", true);
				break;
			case 2:
				String[] v = new String[4];
				String v2[] = { "Nome: ", "Idade: ", "Estado Civil: ", "Cidade: " };

				System.out.println("Informe o nome: ");
				v[0] = scan.next();
				System.out.println("Informe sua idade: ");
				v[1] = scan.next();
				System.out.println("Informe o estado civil: ");
				v[2] = scan.next();
				System.out.println("Informe sua cidade: ");
				v[3] = scan.next();

				String dt = "<ul>";
				for (int i = 0; i < v.length; i++) {
					dt += "<li>" + v2[i] + v[i] + "</li>";
				}
				dt += "</ul>";
				arq.cadastrar(dt, "Site.html", true);
				break;
			case 0:
				System.out.println("flw");
				break;
			}
		} while (opcao != 0);
	}
}
