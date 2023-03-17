package lista;
import java.util.Scanner;
	/*Desenvolva um programa que receba o valor do sal�rio como entrada e 
	 * calcule quanto ser� o desconto de IRRF (Imposto de renda retido na fonte) 
	 * conforme a tabela a seguir*/
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		float salario,porcentagem = 0,desconto;
		
		
		System.out.print("Digite o seu sal�rio: ");
		salario = entrada.nextFloat();
		
		if(salario > 4664.68) {
			porcentagem = 0.0f;
		}else if(salario > 3751.06) {
			porcentagem = 27.50f;
		}else if(salario > 2826.66){
			porcentagem = 15f;
		}else if(salario > 1903.99){
			porcentagem = 7.5f;
		} else {
			System.out.println("� isento");;		
		}
		if(porcentagem == 0f) {
			desconto = 869.36f;
		}else {
			desconto = salario * porcentagem / 100;
		}
		System.out.println("O desconto � de "+ desconto);
		System.out.println("O sal�rio com desconto � de "+ salario);
	}

}
