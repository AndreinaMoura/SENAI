package modelo;

public class Planilha {
	private String v1;
	private double v2;
	private double v3;
	private double v4;

	// Construtor
	public Planilha(String entrada) {
		v1 = entrada.split(";")[0];
		v2 = Double. parseDouble(entrada.split(";")[1]);
		v3 = Double. parseDouble(entrada.split(";")[2]);
		v4 = Double. parseDouble(entrada.split(";")[3]);
	}

	// Métodos para Processamento
	public String media() {
		double media = (v2+v3+v4)/3;
		
		return v1 + "\t" + String.format("%.2f",media);
	}
}