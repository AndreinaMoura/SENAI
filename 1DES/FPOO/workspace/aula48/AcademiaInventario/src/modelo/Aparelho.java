package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aparelho {

	public String nome;
	public String tipoExercicio;
	public String grupoMuscular;
	public Date dataAquisicao;
	public double valorAquisicao;
	
	public SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public Aparelho() {

	}

	public Aparelho(String nome, String tipoExercicio, String grupoMuscular, String dataAquisicao, double valorAquisicao) throws ParseException {
		this.nome = nome;
		this.tipoExercicio = tipoExercicio;
		this.grupoMuscular = grupoMuscular;
		this.dataAquisicao = df.parse(dataAquisicao);
		this.valorAquisicao = valorAquisicao;
	}

	public String toString() {
		return "Aparelho [nome=" + nome + ", tipoExercicio=" + tipoExercicio + ", grupoMuscular=" + grupoMuscular
				+ ", dataAquisicao=" + dataAquisicao + ", valorAquisicao=" + valorAquisicao + "]";
	}

	
}