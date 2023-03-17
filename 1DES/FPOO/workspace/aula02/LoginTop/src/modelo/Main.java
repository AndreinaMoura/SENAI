package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	// Espaço de memória dinâmico para leitura(Abrir)
	static BufferedReader br;
	// Endereço do aquivo de entrada
	static String usuarios = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\logic\\FPOO\\wk\\workspace\\Login\\dados\\usuarios.csv";
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o usuário: ");
		String b1 = scan.next();
		System.out.println("Insira a senha: ");
		String b2 = scan.next();

		// Abrir o arquivo tratando os possíveis erros
		try {
			// Abre o arquivo
			br = new BufferedReader(new FileReader(usuarios));
			String linha = br.readLine();// Lê a primeira linha
			while (linha != null) {
				String[] vetor = linha.split(";");
				String v1 = vetor[0];
				String v2 = vetor[1];

				if ((v1.contains(b1.toLowerCase())) && (v2.contains(b2.toLowerCase()))) {
					System.out.println("Acesso permitido");
				} else if ((v1.toLowerCase().contains(b1.toLowerCase())) != (v2.toLowerCase()
						.contains(b2.toLowerCase()))) {
					System.out.println("Acesso negado");
				} else if((v1.contains(b1.toLowerCase()))) {
				}else{
				System.out.println("Usuário não encontrado");
			}
				linha = br.readLine();// Lê a próxima linha
			}
			// Fecha o arquivo
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}