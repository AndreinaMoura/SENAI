package exercicios;

import java.time.Year;
import java.util.Scanner;

public class Idade_ano {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int id,ano;
		int anoAtual=Year.now().getValue();
		System.out.println("Digite seu ano de nascimento: ");
		ano = entrada.nextInt();
		id = anoAtual-ano;
		System.out.println("Sua idade é de "+id);
		if(id >= 18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você é menor de idade");
		}


	}

}
