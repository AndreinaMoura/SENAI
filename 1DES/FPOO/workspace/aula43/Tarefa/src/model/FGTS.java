package model;
import java.io.IOException;
import java.util.Scanner;

public class FGTS {

	public static void main(String[] args) throws IOException{

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite de quantas pessoas deseja saber o FGTS:");
		int t = scan.nextInt();;
	
		
		String[] nomes = new String[t];
		double[] salario = new double[t];
		double[] FGTS = new double[t];
		for(int i = 0; i < t; i++) {
			System.out.print("Nome do "+(i+1)+"° funcionário: ");
			nomes[i] = scan.next();
			System.out.print("Salário do "+(i+1)+"° funcionário: ");
			salario[i] = scan.nextDouble();
			
		}
		for(int i = 0; i < t; i++) {
			FGTS[i]=salario[i]*0.08;
			salario[i]=salario[i]+FGTS[i];
			System.out.println("\n");
			System.out.println((i+1)+"° Funcionário: "+nomes[i]+" seu FGTS é de "+FGTS[i]+" e seu salário com é FGTS: "+salario[i]);
		}
	}
}