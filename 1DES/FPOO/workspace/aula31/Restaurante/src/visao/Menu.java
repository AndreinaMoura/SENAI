package visao;

import java.io.IOException;
import java.util.Scanner;
import modelo.Prato;

public class Menu {

	private static Scanner scan = new Scanner(System.in);
	private static Prato[] pratos = new Prato[10];
	private static int indice = 0;

	public static void main(String[] args) throws IOException {

		int menu = 0;
		while (menu != 3) {
			System.out.print("1.Cadastrar Prato\t2.Listar Pratos\t3.Sair\nEscolha: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadastrarPrato();
				break;
			case 2:
				listarPratos();
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

	private static void cadastrarPrato() {
		System.out.println("Cadastro de Veiculos");
		System.out.println("Placa\tMarca\tModelo\tAno do Modelo\tAno de Fabricação\tCor");
		pratos[indice] = new Prato(scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.nextFloat());
		indice++;
	}

	private static void listarPratos() {
		for (int i = 0; i < indice; i++) {
			System.out.println(pratos[i].toString());
		}
	}
}
