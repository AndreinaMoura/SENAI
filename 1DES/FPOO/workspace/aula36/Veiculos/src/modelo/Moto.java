package modelo;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String placa, int anoModelo, int anoFabricacao, String modelo, String marca, double valor,
			int cilindradas) {
		super(placa, anoModelo, anoFabricacao, modelo, marca, valor);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return super.toString() + " cilindradas=" + cilindradas;
	}

}
