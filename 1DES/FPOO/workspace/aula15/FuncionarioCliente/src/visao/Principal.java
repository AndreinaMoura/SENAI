package visao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Funcionario;
import modelo.Cliente;
import modelo.Venda;

public class Principal {
	private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static ArrayList<Venda> vendas = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws IOException, ParseException {

		int menu = 0;
		while (menu != 7) {
			System.out.print(
					"1.Cadastrar Cliente    2.Cadastrar Funcion�rio    3.Cadastrar Vendas    4.Listar Clientes    5.Listar Funcion�rios    6.Listar Clientes     7.Sair\n-Escolha: ");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadastrarCliente();
				break;
			case 2:
				cadastrarFuncionario();
				break;
			case 3:
				cadastrarVendas();
				break;
			case 4:
				listarClientes();
				break;
			case 5:
				listarFuncionarios();
				break;
			case 6:
				listarVendas();
				break;
			case 7:
				System.out.println("At� mais volte sempre");
				break;
			default:
				System.out.println("Op��o Inv�lida");
				break;
			}
		}
	}

	private static void cadastrarCliente() throws ParseException {
		System.out.println("\n------------------Cadastrar Cliente--------------------\n");
		System.out.println("Nome    Telefone    Nascimento     id    Credito Limite");
		Cliente cl = new Cliente(scan.next(), scan.next(), df.parse(scan.next()), scan.nextInt(), scan.nextDouble());
		clientes.add(cl);
	}

	private static void cadastrarFuncionario() throws ParseException {
		System.out.println("\n----------------Cadastrar Funcion�rio------------------\n");
		System.out.println("Nome    Telefone    Nascimento    Matricula    Comiss�o");
		Funcionario fn = new Funcionario(scan.next(), scan.next(), df.parse(scan.next()), scan.nextInt(),
				scan.nextDouble());
		funcionarios.add(fn);
	}

	private static void cadastrarVendas() throws ParseException {
		System.out.println("\n-------------------------------Cadastrar Venda-------------------------------\n");
		System.out.println("C�digo do Cliente    C�digo do Vendedor    Valor da Venda    Comiss�o    Data");
		Venda vn = new Venda(scan.nextInt(), scan.nextInt(), scan.nextDouble(), scan.nextDouble(),
				df.parse(scan.next()));
		vendas.add(vn);
	}

	private static void listarClientes() {
		System.out.println("\nNome    Telefone    Nascimento     id    Credito Limite");
		for (Cliente cl : clientes) {
			System.out.println(cl.toString());
		}
	}

	private static void listarFuncionarios() {
		System.out.println("\nNome    Telefone    Nascimento    Matricula    Comiss�o");
		for (Funcionario fn : funcionarios) {
			System.out.println(fn.toString());
		}
	}

	private static void listarVendas() {
		System.out.println("\nC�digo do Cliente    C�digo do Vendedor    Valor da Venda    Comiss�o    Data");
		for (Venda vn : vendas) {
			System.out.println(vn.toString());
		}
	}
}