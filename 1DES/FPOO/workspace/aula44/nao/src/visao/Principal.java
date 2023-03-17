package visao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import modelo.Aluno;
import modelo.Componete;

public class Principal {

	static int ra;
	static String[] nome;
	static Scanner scan = new Scanner(System.in);
	static Aluno[] alunos = new Aluno[1];
	static Componete[] materia = new Componete[4];
	static Componete[] notas = new Componete[3];

	public static void main(String[] args) throws IOException, ParseException {

		int opcao = 0;
		while (opcao != 9) {
			System.out.print("1.Cadastrar Aluno\t\t2.Cadastrar Notas\t\t3.Listar Alunos\t\t4.Listar Notas\n");
			System.out.print(
					"5.Obter Alunos Pelo RA\t\t6.Obter Aluno Pelo Nome\t\t7.Listar Aprovados\t8.Listar Reprovados\n9.Sair\nEscolha: ");
			opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				cadastrarAluno();
				break;
			case 2:
				cadastrarNota();
				break;
			case 3:
				listarAlunos();
				break;
			case 4:
				listarNotas();
				break;
			case 5:
				obterAluno(ra);
				break;
			case 6:
				obterAluno(nome);
				break;
			case 7:
				listarAprovados();
				break;
			case 8:
				listarReprovados();
				break;
			case 9:
				System.out.println("Adeus");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}
	}

	private static void cadastrarAluno() throws ParseException {
		System.out.println("Cadastro de alunos");

		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0; i < alunos.length; i++) {
			System.out.println((i + 1) + "º Nome" + "\t" + (i + 1) + "º Data de Nascimento");
			alunos[i] = new Aluno(null, 0, null);
			alunos[i].nome = scan.next();
			alunos[i].ra = i + 1;
			alunos[i].nascimento = dt.parse(scan.next());
		}
		System.out.println("Nome   RA    Data de Nascimento  Idade");
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].paraString());
		}
	}

	private static void cadastrarNota() {
		System.out.println("Cadastro de notas");
		for (int i = 0; i < alunos.length; i++) {
			System.out.println((1 + i) + "º Aluno");
			for (int j = 0; j < 4; j++) {
				System.out.print((1 + j) + "º Matéria: ");
				String componente = scan.next();
				System.out.print("1° Notas: ");
				int nota1 = scan.nextInt();
				System.out.print("2° Notas: ");
				int nota2 = scan.nextInt();
				System.out.print("3° Notas: ");
				int nota3 = scan.nextInt();
				alunos[i].materia[j] = new Componete(componente, nota1, nota2, nota3);
			}
		}
	}

	private static String listarAlunos() {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].paraString());
		}
		return null;
	}

	private static String listarNotas() {
		System.out.println("Matérias    1° Nota   2° Nota   3° Nota   Média");
		for (int i = 0; i < alunos.length; i++) {
			System.out.println((1 + i) + "º Aluno");
			for (int j = 0; j < 4; j++) {
				System.out.println(alunos[i].materia[j].paraString());

			}
		}
		return null;
	}

	private static String obterAluno(int ra) {
		System.out.print("Buscar aluno por ra: ");
		int ra1 = scan.nextInt();
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].ra == ra1) {
				System.out.println(alunos[i].paraString());
			}
		}
		return null;
	}

	private static String obterAluno(String[] nome) {
		System.out.print("Buscar aluno por nome: ");
		String aluno1 = scan.next();

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].nome.equalsIgnoreCase(aluno1)) {
				System.out.println(alunos[i].paraString());
			}
		}
		return null;
	}

	private static String listarAprovados() {
		int c=0;
		System.out.println("Alunos aprovados");
		
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].obterConceito().equals("Aprovado")) {
				System.out.println((i+1)+"° Nome\tConceito");
				System.out.println();
				System.out.print(alunos[i].nome + "\t" + alunos[i].obterConceito());
				System.out.println();
				System.out.println();
				c++;
			}
		}
			if(c==0) {
				System.out.println("Nenhum aluno aprovado");
			}
			return null;
		}
		

	private static String listarReprovados() {
		int c=0;
		System.out.println("Alunos reprovados");

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].obterConceito().equals("Reprovado")) {
				System.out.println((i+1)+"° Nome\tConceito");
				System.out.println();
				System.out.print(alunos[i].nome + "\t" + alunos[i].obterConceito());
				System.out.println();
				System.out.println();
				c++;
			}
		}
		if(c==0) {
			System.out.println("Nenhum aluno reprovado");
		}

		return null;
	}
}
