package visao;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import modelo.Aparelho;

public class Menu {

	private static Scanner scan = new Scanner(System.in);
	private static Aparelho[] aparelhos = new Aparelho[10];
	private static int indice = 0;

	public static void main(String[] args) throws IOException, ParseException {

		int menu = 0;
		while (menu != 3) {
			System.out.print("1.Cadastrar Aparelho\t2.Listar Aparelhos\t3.Sair\nEscolha: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadastrarAparelho();
				break;
			case 2:
				listarAparelhos();
				break;
			case 3:
				System.out.println("Adeus");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}
	}

	private static void cadastrarAparelho() throws ParseException {
		System.out.println("Cadastro de Veiculos");
		System.out.println("Placa\tMarca\tModelo\tAno do Modelo\tAno de Fabricação\tCor");
		aparelhos[indice] = new Aparelho(scan.next(), scan.next(), scan.next(), scan.next(),scan.nextDouble());
		indice++;
	}

	private static void listarAparelhos() {
		System.out.println("Placa\tMarca\tModelo\tAno do Modelo\tAno de Fabricação\tCor");
		for (int i = 0; i < indice; i++) {
			System.out.println(aparelhos[i].toString());
		}
	}
}
