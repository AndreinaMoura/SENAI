package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salario,desconto;
		System.out.println("Digite o salario: ");
		salario=leia.nextFloat();
		if(salario>2000) {
			desconto = salario * 0.11;
		}
		if(salario<1200) {
			desconto=salario*0.08;
		}else{
			desconto=salario*0.09;
		}
		
		salario=salario-desconto;
		System.out.println("o desconto será de "+desconto);
		System.out.println("O salario será de "+salario);
	}

}
