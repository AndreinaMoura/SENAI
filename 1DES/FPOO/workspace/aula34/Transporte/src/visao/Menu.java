package visao;

import java.io.IOException;
import java.util.Scanner;
import modelo.Veiculo;

public class Menu {

	private static Scanner scan = new Scanner(System.in);
	private static Veiculo[] veiculos = new Veiculo[10];
	private static int indice = 0;

	public static void main(String[] args) throws IOException {

		int menu = 0;
		while (menu != 3) {
			System.out.print("1.Cadastrar Veículos\t2.Listar Veículos\t3.Sair\nEscolha: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadastrarVeiculo();
				break;
			case 2:
				listarVeiculos();
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

	private static void cadastrarVeiculo() {
		System.out.println("Cadastro de Veiculos");
		System.out.println("Placa\tMarca\tModelo\tAno do Modelo\tAno de Fabricação\tCor");
		veiculos[indice] = new Veiculo(scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt(),scan.next());
		indice++;
	}

	private static void listarVeiculos() {
		System.out.println("Placa\tMarca\tModelo\tAno do Modelo\tAno de Fabricação\tCor");
		for (int i = 0; i < indice; i++) {
			System.out.println(veiculos[i].paraString());
		}
	}
}
