package modelo;

public class Componete {

	public String componente;
	public float nota1;
	public float nota2;
	public float nota3;
	public float media;

	public Componete(String componente, float nota1, float nota2, float nota3) {
		this.componente = componente;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public float obterMedia() {
		media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	public String paraString() {

		return componente + "     " + nota1 + "  " + nota2 + "   " + nota3 + "   " + obterMedia() + "\n";
	}
}
