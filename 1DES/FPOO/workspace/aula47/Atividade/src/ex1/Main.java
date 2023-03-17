package ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static Date nascimento;
	public static SimpleDateFormat df = new SimpleDateFormat("yyyy");

	public static void main(String[] args) throws ParseException {
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		Arquivo arq = new Arquivo();
		do {
			System.out.println("1-Cadastrar Pessoa");
			System.out.println("2-Listar Cadastros");
			System.out.println("0-Sair");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe o nome: ");
				String nome = scan.next();

				System.out.println("Informe o ano de nascimento: ");
				nascimento = df.parse(scan.next());

				String data = "Nome: " + nome + "\t" + "Idade: " + calcIdade() + " anos";
				arq.cadastrar(data, "Dados", true);
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Dados");

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

	public static int calcIdade() {

		Date hoje = new Date();
		@SuppressWarnings("deprecation")
		int anoDif = hoje.getYear() - nascimento.getYear();

		return anoDif;
	}
}