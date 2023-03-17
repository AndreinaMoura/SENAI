package model;
import java.util.Random;
import java.util.Scanner;

public class NomesAleatorios {
	public static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Random  rand = new Random();

		System.out.print("Digite quantos nomes você deseja gerar: ");
		int qtd = scan.nextInt();

		String[] nomes = { "João", "Maria", "Ivone", "Marcelo", "Marcos", "Juliana", "Brino", "Bruna" };
		String[] sobrenomes = { " Silva", " Santos", " Gomes", " Lima", " Costa", " Alves", " Rodrigues", " Ferreira" };
		for (int i = 0; i < qtd; i++) {
			int aleatorio = rand.nextInt(nomes.length);
			aleatorio = rand.nextInt(sobrenomes.length);
			System.out.println(nomes[aleatorio] + sobrenomes [aleatorio]);
		}	
	}
}