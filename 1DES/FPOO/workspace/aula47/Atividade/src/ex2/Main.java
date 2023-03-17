package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static int[] listaDeNumeros = new int[5];

	public static void main(String[] args){
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		Aleatorio ale = new Aleatorio();
		do {
			System.out.println("1-Cadastrar");
			System.out.println("2-Listar");
			System.out.println("0-Sair");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Cadastrado aleatórios");
		        for (int i = 0; i < listaDeNumeros.length; i++) {			           
		        	listaDeNumeros[i] = new Random().nextInt(10);
			    }

				String data = crescente();
				ale.cadastrar(data, "Aleatorios", true);

				break;
			case 2:
				ArrayList<String> infoFile = ale.ler("Aleatorios");

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

	public static String crescente() {
		String a = "";
		
		Arrays.sort(listaDeNumeros);
		
		for (int i = 0; i < listaDeNumeros.length; i++) {
			a += (listaDeNumeros[i] + "  ");
		}

		return a;		
	}
}
