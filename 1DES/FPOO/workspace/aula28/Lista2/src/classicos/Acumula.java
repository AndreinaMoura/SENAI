package classicos;

import java.util.Random;
import java.util.Scanner;

public class Acumula {
	public static Random rand;
	public static Scanner scan;
	
	public static void main(String[] args) {

//		System.out.println("O algoritimo de acumulação");
//		System.out.print("simples, retornou = ");
//		System.out.println(simples(345));
//		System.out.println("Total = "+aleatorio(345));
//		System.out.println("O fatorial é "+ fatorial());
//		System.out.print("Digite o valor do emprestimo que deseja: ");
//		double v = scan.nextDouble();
//		System.out.println("Digite o valor da sua renda: ");
//		double r = scan.nextDouble();
//		System.out.println("Digite a taxa de juros: ");
//		double t = scan.nextDouble();
		double t=0.1;
		double r=1000;
		double v=10000;
		System.out.println(emprestimo(v,r,t));
		emprestimo(v,r,t);
		
	}
	public static int simples(int iteracoes) {
		int x=0;
		for(int i=0;i<iteracoes;i++) {
			x+=i;
	}
		return x;
	}
	public static int aleatorio(int iteracoes) {
		rand = new Random();
		int x=0;
		int r=0;
		for(int i=0;i<iteracoes;i++) {
			r = rand.nextInt(100);
			System.out.println("Aleatório = "+r);
			x+=r;
			System.out.println("Acumulado = "+x);
		}
		return x;
	}
	public static int fatorial() {
		scan = new Scanner(System.in);
		
		int fatorial=1;
		
	System.out.print("Digite um valor: ");
		int x=scan.nextInt();
		for(int i=1;i <= x;i++) {
			fatorial*=i;
		}
		return fatorial;
	}
	
	public static double emprestimo(double v, double r, double t) {
		double M=0;
		double parcelaMax=r*0.3;
		double tempo=(v/parcelaMax);
		double juros= Math.pow((1+t), tempo);
		double total;
		for(int i = 0; i < tempo;i++) {
			M+=juros;	
		}
		
		if(v%parcelaMax>0) {
			tempo++;
			System.out.println((int)tempo+" parcelas");
		}else {
		System.out.println((int)tempo+" parcelas");
		}
		total=juros*v;
		System.out.printf("%.2f",total);
		return total;
	}
}
