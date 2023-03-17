package visao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Cao;
import modelo.Gato;

public class Principal {
	private static ArrayList<Cao> caes = new ArrayList<>();
	private static ArrayList<Gato> gatos = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int menu = 0;
		while (menu != 5) {
			System.out.print("*Cadastrar Cães    *Cadastrar Gatos    *Listar Cães    *Listar Gatos     *Sair\n-Escolha: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadastrarCao();
				break;
			case 2:
				cadastrarGato();
				break;
			case 3:
				listarCao();
				break;
			case 4:
				listarGato();
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

	private static void cadastrarCao() {
		System.out.println("\n--------------------------Cadastrar Cão---------------------------\n");
		System.out.println("Espécie    Nome    Peso    Raça     Quantidade de Motoqueiros Atacados");
		Cao cao = new Cao(scan.next(), scan.next(), scan.nextFloat(), scan.next(), scan.nextInt());
		caes.add(cao);
	}

	private static void cadastrarGato() {
		System.out.println("\n--------------------Cadastrar Gato---------------------\n");
		System.out.println("Espécie    Nome    Peso    Raça     Quantidade de Vidas");
		Gato gato = new Gato(scan.next(), scan.next(), scan.nextFloat(), scan.next(), scan.nextInt());
		gatos.add(gato);
	}

	private static void listarCao() {
		System.out.println("\nEspécie    Nome    Peso    Raça     Quantidade de Motoqueiros Atacados");
		for (Cao cao : caes) {
			System.out.println(cao.toString());
		}
	}

	private static void listarGato() {
		System.out.println("\nEspécie    Nome    Peso    Raça     Quantidade de Vidas");
		for (Gato gato : gatos) {
			System.out.println(gato.toString());
		}
	}
}