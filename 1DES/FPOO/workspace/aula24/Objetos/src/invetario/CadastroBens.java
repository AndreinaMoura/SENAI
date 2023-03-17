package invetario;

import java.util.Random;
import java.util.Scanner;

import invetario.CadastroBens.Bem;

public class CadastroBens {

	static Scanner scan = new Scanner(System.in);
	static Random r = new Random();
	static String[] descs = {"Carro","Casa","Moto","Ap.","Relógio"};
	public static void main(String[] args) {
		System.out.print("Quantos bens deseja gerar? ");
		int qtdBens=scan.nextInt();
		Bem[] bens = new Bem[qtdBens];
		System.out.println("Id\tDescrição\tValor");
		for(int i =0;i<qtdBens;i++) {
			bens[i]= new Bem(i+1,descs[r.nextInt(descs.length)], r.nextDouble()*100000);
			System.out.println(bens[i].bensTab());
		}

	}
	public static class Bem{
		public int id;
		public String descricao;
		public double valor;
	
		Bem(int i, String d, double v) {
			id=i;
			descricao=d;
			valor=v;
		}
		public String bensTab() {
			return String.format("%d\t%s\t\tR$%.2f",id,descricao,valor);
		}
	}
}
