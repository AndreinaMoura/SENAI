package exemplos;

import java.util.Scanner;

public class Exp3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu= 0;
		while(menu !=3) {
			System.out.print("1,2,3\nEscolha: ");
			menu=scan.nextInt();
		}
		switch(menu) {
		case 1:
			System.out.println("coé");
			break;
		case 2:
			System.out.println("ué");
			break;
		case 3:
			System.out.println("sla");
			break;
		default:
			System.out.println("????");
		}
		
	}

}
