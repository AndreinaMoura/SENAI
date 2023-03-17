package modelo;

public class Prato {

	public int codigoPrato;
	public String tipo;
	public String nome;
	public String descricao;
	public float preco;

	public Prato() {

	}

	public Prato(int codigoPrato, String tipo, String nome, String descricao, float preco) {
		this.codigoPrato = codigoPrato;
		this.tipo = tipo;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String toString() {
		return "Prato [codigoPrato=" + codigoPrato + ", tipo=" + tipo + ", nome=" + nome + ", descricao=" + descricao
				+ ", preco=" + preco + "]";
	}
}