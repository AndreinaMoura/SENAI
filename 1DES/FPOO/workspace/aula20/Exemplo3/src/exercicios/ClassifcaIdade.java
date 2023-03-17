package exercicios;

import java.time.Year;
import java.util.Scanner;

public class ClassifcaIdade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ano,idade;
		int anoAtual=Year.now().getValue();
		System.out.println("Digite seu ano de nascimento: ");
		ano = entrada.nextInt();
		
		idade = anoAtual - ano;
		
		if(idade < 10) {
			System.out.println("Você é uma criança");
		}else if(idade < 15) {
			System.out.println("Você é um(a) adolescente");
		}else if(idade<18) {
			System.out.println("Você é um(a)jovem");
		}else if(idade<50) {
			System.out.println("Você é um(a)adulto");
		}else if(idade<100) {
			System.out.println("Você é um(a)idoso");
		}else{
			System.out.println("Ta fazendo hora extra na terra");
		}
	}

}
