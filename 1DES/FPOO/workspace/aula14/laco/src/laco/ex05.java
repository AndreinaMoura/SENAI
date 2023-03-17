package laco;

import java.util.Scanner;

public class ex05 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double x;
		double z;
		System.out.print("Digite o valor do xerox: ");
		x = scan.nextInt();
		 for(int i=0;i <= 200;i++){
			 z=i*x;
			 System.out.printf("%d = %.2f\n",i,z);            
        }		
	}
}
		