package visao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Moto;
import modelo.Carro;

public class Principal {
	private static ArrayList<Moto> motos = new ArrayList<>();
	private static ArrayList<Carro> carros = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int menu = 0;
		while (menu != 5) {
			System.out.print(
					"*Cadastrar Carro    *Cadastrar Motos    *Listar Carros    *Listar Motos     *Sair\n-Escolha: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadastrarCarro();
				break;
			case 2:
				cadastrarMoto();
				break;
			case 3:
				listarCarros();
				break;
			case 4:
				listarMotos();
				break;
			case 5:
				System.out.println("Adeus");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}
	}

	private static void cadastrarCarro() {
		System.out.println("\n---------------------------------------Cadastrar Carro---------------------------------------\n");
		System.out.println("Placa    Ano do Modelo    Ano de Fabricação    Modelo     Marca    Valor   Tipo   Passageiros");
		Carro car = new Carro(scan.next(), scan.nextInt(), scan.nextInt(), scan.next(), scan.next(), scan.nextDouble(),
				scan.next(), scan.nextInt());
		carros.add(car);
	}

	private static void cadastrarMoto() {
		System.out.println("\n------------------------------------Cadastrar Moto-------------------------------------\n");
		System.out.println("Placa    Ano do Modelo    Ano de Fabricação    Modelo     Marca    Valor    Cilindradas");
		Moto mt = new Moto(scan.next(), scan.nextInt(), scan.nextInt(), scan.next(), scan.next(), scan.nextDouble(),
				scan.nextInt());
		motos.add(mt);
	}

	private static void listarCarros() {
		System.out.println("\nPlaca    Ano do Modelo    Ano de Fabricação    Modelo     Marca    Valor   Tipo   Passageiros");
		for (Carro car : carros) {
			System.out.println(car.toString());
		}
	}

	private static void listarMotos() {
		System.out.println("\nPlaca    Ano do Modelo    Ano de Fabricação    Modelo     Marca    Valor    Cilindradas");
		for (Moto mt : motos) {
			System.out.println(mt.toString());
		}
	}
}