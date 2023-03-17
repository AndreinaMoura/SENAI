package exemplos;

import java.util.Scanner;

public class Exp2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Iteração"+i);
			for(int i1 = 0; i1 < 10; i1++) {
				System.out.println("Valor"+i1);
			}
		}
		
	}

}
