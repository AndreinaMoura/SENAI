package exerc;
import java.util.Scanner;
	/* 10 – Pedra mineira é um tipo de piso muito utilizado para revestir 
	 * o chão em volta de piscinas, dez quilos de pedra mineira custam 
	 * R$ 130,00 e revestem uma área de 3,7 m2. Desenvolva um programa 
	 * que leia a área total (m2) a ser revestida, calcule e apresente na 
	 * tela o total de quilos de pedra mineira que serão necessários para o 
	 * revestimento e o seu custo total (R$). O programa deverá apresentar os 
	 * valores monetários formatados com duas casas decimais.*/
public class Exercicios10 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		int area,kg=130,areat;
		double valor;
		double revest=3.7;
		System.out.print("Digite o valor total da área(m2): ");
		areat=entrada.nextInt();
		area = (int) (areat/revest);
		valor = (double)Math.ceil(area*kg);
		System.out.println("A quantidade de revestimento é "+area);
		System.out.printf("Custo total será de %.2f",valor);
		
	}

}
