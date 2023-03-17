package sla;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BuscaAleatoria {
	static Scanner scan= new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args) throws IOException {
		System.out.print("Digite quantos números deseja: ");
		int n = scan.nextInt();
		int dados[] = numerosAleatorios(n);
		System.out.print("Digite o número que deseja buscar: ");
		int b = scan.nextInt();
		System.out.println("Dados");
		mostrarDados(dados);
		boolean resultado = buscaSimples(dados,b);
		System.out.println("A busca obteve sucesso? "+resultado);
			

			
		
	}
	public static int[] numerosAleatorios(int n) {
		int[] x = new int[n];
		for(int i=0; i<n;i++) {
			x[i]=rand.nextInt(1000);
		}
		return x;		
	}			
	public static void mostrarDados(int[] dados) {
		for(int i=0;i<dados.length;i++) 
			System.out.println(dados[i]);
	}
	public static boolean buscaSimples(int[] dados,int b) {
		for(int i=0;i<dados.length;i++)
			if(dados[i]==b)
				return true;
		return false;
	}
}
