package laco;

import java.util.Scanner;

public class ex06 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

	
	int a=0;
	System.out.println("Digite 2 valores: ");
	int v1 = scan.nextInt();
	int v2 = scan.nextInt();
	
		
			for(int i= v1; i<= v2;i+=2) {
				if((v1%2) != 0) {
				a=i+i;
				}
			}
				System.out.printf("A soma dos numeros impares no intervalo = %d",a);
		
				for(int i= v1; i<= v2;i+=2) {
				if((v1%2) == 0) {
					a=i+i;
					}
				}
			System.out.printf("A soma dos numeros pares no intervalo = %d",a);
			
	}
}