package lista;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*Crie um programa que receba como entrada o n�mero 
		 * de filhos de um funcion�rio e seu sal�rio e calcule o 
		 * sal�rio fam�lia. Use os dados atuais do sal�rio fam�lia, 
		 * encontre no Google as regras da CLT.*/
		double salFilho=56.70,salFam=0,saltotal=0;
		int filhos;
		System.out.print("Digite o seu sal�rio: ");
		saltotal = entrada.nextFloat();
		if(saltotal > 1655.98) {
			System.out.println("Se vira, voc� n�o tem direito");
		}else{
			System.out.println("Quantos filhos que se enquadre na regra voc� tem? ");
			filhos = entrada.nextInt();
			salFam = filhos * salFilho;
		}
		System.out.println("Quantos filhos que se enquadre na regra voc� tem? "+salFilho);
		System.out.println("salario familia"+salFam);
	}

}
