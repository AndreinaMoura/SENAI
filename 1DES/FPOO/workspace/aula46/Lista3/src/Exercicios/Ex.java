package Exercicios;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		while(opcao != 11) {
			System.out.print("1-Prorgama\t5-Prorgama\t9-Prorgama\n");
			System.out.print("2-Prorgama\t6-Prorgama\t10-Prorgama\n");
			System.out.print("3-Prorgama\t7-Prorgama\t11-Sair\n");
			System.out.print("4-Prorgama\t8-Prorgama\n\nEscolha: ");
			opcao=scan.nextInt();
			switch(opcao) {
			case 1:
				for(int i= 10; i <= 200; i++) {
					System.out.println(i);
				}
				break;
			case 2:
				for(int i= 200; i > 0; i--) {
					System.out.println(i);
				}
				break;
			case 3:
				System.out.print("Digite um valor inteiro: ");
				int valor = scan.nextInt();
				for(int i= 0; i < valor; i++) {
					System.out.println(i);
				}
				break;
			case 4:
				System.out.print("Digite um valor inteiro: ");
				int valor1 = scan.nextInt();
				System.out.print("Digite outro valor inteiro: ");
				int valor2 = scan.nextInt();
				
				for(int i= valor1; i < valor2; i++) {
					System.out.println(i);
				}
				break;
			case 5:
				System.out.print("Digite um valor inteiro par: ");
				int valor3 = scan.nextInt();
				System.out.print("Digite outro valor inteiro par: ");
				int valor4 = scan.nextInt();
				for(int i= valor3; i <= valor4; i+=2) {
					System.out.println(i);
				}
				break;
			case 6:
				int valor5=0;
				for(int i= 0; i < 101; i++) {
					valor5+=i;
				}
				System.out.println(valor5);
				break;
			case 7:
				int v1,v2,v3=0;
				System.out.println("Digite dois valores inteiros: ");
				v1 = scan.nextInt();
				v2 = scan.nextInt();
				for( int i=v1;i<=v2;i++) {
					v3=v3+i;
					System.out.println(v3);
				}
				
				break;
			case 8:
				int v4,v5,v6=0,v7=0;
				System.out.print("Digite dois valores inteiros: ");
				v4 = scan.nextInt();
				v5 = scan.nextInt();
				v7=v4%2;
				if(v7 == 1) {
					v4=v4+1;
				}
				
				for( int i=v4;i<=v5;i+=2) {
					v6=v6+i;
					
					System.out.println(v6);
				}
				break;
			case 9:
				int x = 0;
				System.out.print("Digite 15 valores: ");
				for(int i=0;i<5;i++) {
					x = scan.nextInt();
		
				}					
				System.out.println(x);
				
				break;
			case 10:
				int to=0;
				int i1=11;
				to = i1%2;
				if(to == 1) {
					i1= i1 +1;
				}
				for(int i=i1; i < 250; i+=2) {
					System.out.println(i);
				}
				break; 
			case 11:
				System.out.println("Até logo.");
				break;
			default:
				System.out.println("Opção Inválida.");
				break;
			}
		}
	}
}