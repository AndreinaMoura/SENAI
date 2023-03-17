package modelo;

import java.util.Scanner;

public class Exp2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c,delta;
		double r1,r2;
		
		System.out.print("Digite a: ");
		a = leia.nextInt();
		
		System.out.print("Digite b: ");
		b = leia.nextInt();
		
		System.out.print("Digite c: ");
		c = leia.nextInt();
		
		delta = b*b-4*a*c;

		if(delta<0) {
			System.out.println("Não possui raízes reais");
		}else {
		
			r1 = (-b + Math.sqrt(delta))/(2*a);
			System.out.println("A raíz um é "+r1);
			
			r2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("A raíz dois é "+r2);
		}
	}
}
