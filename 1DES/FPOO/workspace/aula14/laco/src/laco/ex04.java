package laco;

import java.util.Scanner;

public class ex04 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int x;
		int f = 1;
		System.out.print("Digite um número: ");
		x = scan.nextInt();
		 while (x > 1){ 
			 f = f *x;
             x--;               
        }		
		System.out.println(f+" é o seu fatorial");
	}
}

