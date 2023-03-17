package modelo;

import java.util.Scanner;

public class Media {
	public static Scanner entrada;
	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		float n1,n2,media;
		
		System.out.print("Digite sua primeira nota: ");
		n1 = entrada.nextFloat();
		
		System.out.print("Digite sua segunda nota: ");
		n2 = entrada.nextFloat();
		
		media = (n1+n2)/2;
		System.out.println("A média é "+ media);
		if(media >= 5) {
			System.out.print("Aprovado");
		}else {
			System.out.print("Reprovado");
		}
	}

}
