package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		Veiculo v = new Veiculo();
		do {
			System.out.println("1-Cadastrar");
			System.out.println("2-Listar");
			System.out.println("0-Sair");
			opcao = scan.nextInt();
			

			switch (opcao) {
			case 1:
				System.out.println("Informe a marca: ");
				String marca = scan.next();

				System.out.println("Informe o modelo: ");
				String modelo = scan.next();
				
				System.out.println("Informe a placa: ");
				String placa = scan.next();

				System.out.println("Informe a cor: ");
				String cor = scan.next();

				String data = marca + ";" + modelo + ";" + placa + ";" + cor;
				v.cadastrar(data, "Veiculo", true);
				break;
			case 2:
				ArrayList<String> infoFile = v.ler("Veiculo");

				
				System.out.println("Digite a placa ou modelo do veiculo: ");
				String busca = scan.next();

				for (String linha : infoFile) {
					String[] temp = linha.split(";");
					if ((temp[2].toLowerCase().contains(busca.toLowerCase()))||((temp[1].toLowerCase().contains(busca.toLowerCase())))) {
						System.out.println("Marca: " + temp[0]);
						System.out.println("Modelo: " + temp[1]);
						System.out.println("Placa: " + temp[2]);
						System.out.println("Cor: " + temp[3]);
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
