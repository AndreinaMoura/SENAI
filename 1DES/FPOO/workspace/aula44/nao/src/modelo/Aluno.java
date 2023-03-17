package modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Aluno {

	public int ra;
	public String nome;
	public Date nascimento;
	public Componete[] materia = new Componete[4];
	public SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
	public Componete[] notas = new Componete[3];
	public Aluno[] alunos = new Aluno[1];

	public Aluno(String nome, int ra, Date nascimento) {
		this.nome = nome;
		this.ra = ra;
		this.nascimento = nascimento;
	}

	@SuppressWarnings("deprecation")
	public int calcular() {
		java.util.Date agora = new java.util.Date();

		if (agora.getMonth() == nascimento.getMonth()) {
			if (agora.getDay() >= nascimento.getDay()) {
				return agora.getYear() - nascimento.getYear();
			} else {
				return agora.getYear() - nascimento.getYear() - 1;
			}
		} else if (agora.getMonth() > nascimento.getMonth()) {
			return agora.getYear() - nascimento.getYear();
		} else {
			return agora.getYear() - nascimento.getYear() - 1;
		}
	}

	public String obterConceito() {
		String conceito = null;
		boolean aprovado = true;
		for (int i = 0; i < materia.length; i++) {
			if (materia[i].media <= 50) {
				aprovado = false;
				break;

			}
		}
		if (aprovado) {
			conceito = "Aprovado";
		} else {
			conceito = "Reprovado";
		}
		return conceito;
	}

	public String paraString() {

		return nome + "\t" + ra + "\t" + dt.format(nascimento) + "\t" + calcular() + "\n";
	}

}