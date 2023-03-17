package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*Crie um programa que receba como entrada o número 
		 * de filhos de um funcionário e seu salário e calcule o 
		 * salário família. Use os dados atuais do salário família, 
		 * encontre no Google as regras da CLT.*/
		double salFilho=56.70,salFam=0,saltotal=0;
		int filhos;
		System.out.print("Digite o seu salário: ");
		saltotal = entrada.nextFloat();
		if(saltotal > 1655.98) {
			System.out.println("Se vira, você não tem direito");
		}else{
			System.out.println("Quantos filhos que se enquadre na regra você tem? ");
			filhos = entrada.nextInt();
			salFam = filhos * salFilho;
		}
		System.out.println("Quantos filhos que se enquadre na regra você tem? "+salFilho);
		System.out.println("salario familia"+salFam);
	}

}
