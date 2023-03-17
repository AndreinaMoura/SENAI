package agenda;


//Baseado no exemplo do inventário implemente as seguintes funcionalidades
//Buscar por id
//Buscar por descrição
//Mostrar qual o mais caro
//Mostrar qual o mais barato

import java.util.Scanner;

public class Cadastro {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int opcao=0;
		System.out.print("Digite quantos contatos deseja cadastrar: ");
		int qtdCont = scan.nextInt();
		Contato[] contatos = new Contato[qtdCont];
		System.out.println("id\tNome\tTelefone\t");
		for(int i=0;i< qtdCont;i++) {
			contatos[i]= new Contato();
			contatos[i].id = scan.nextInt();
			contatos[i].nome = scan.next();
			contatos[i].telefone = scan.next();	
		}
		while(opcao != 5) {
			System.out.println("\n1.Mostrar Todos\t\t2.Buscar por Id\n3.Buscar por Nome\t4.Buscar por Telefone\n5.Sair");
			System.out.print("Escolha: ");
		opcao=scan.nextInt();	
		switch(opcao) {
		case 1:
		System.out.print("\nid\tNome\tTelefone\n");
		for(int i=0;i< qtdCont;i++) {
			System.out.println(contatos[i].contatoTab());
		}
			break;
		case 2:
			System.out.println("id\n");
			for(int i=0;i< qtdCont;i++) {
				System.out.println(contatos[i].id);
			}
			break;
		case 3:
			System.out.println("Nome\n");
			for(int i=0;i< qtdCont;i++) {
				System.out.println(contatos[i].nome);
			}
			break;
		case 4:
			System.out.println("Telefone\n");
			for(int i=0;i< qtdCont;i++) {
				System.out.println(contatos[i].telefone);
			}
			break;
		case 5:
			System.out.println("Adeus");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
			}
		}
	}
}
