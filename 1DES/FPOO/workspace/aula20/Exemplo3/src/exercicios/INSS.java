package exercicios;

import java.util.Scanner;

public class INSS {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salario,desconto;
		System.out.print("Digite o seu salário: ");
		salario = leia.nextDouble();
		if(salario > 2000) {
			desconto = salario * 0.11;
		}else if(salario > 1200) {
			desconto = salario*0.09;
		}else{
			desconto = salario*0.08;
		}
		
		salario=salario-desconto;
		System.out.println("o desconto será de " + desconto);
		System.out.println("O salario será de " + salario);
	}

}
