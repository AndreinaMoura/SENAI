package modelo;

public class Carro extends Veiculo {
	private String tipo;
	private int passageiros;

	public Carro(String placa, int anoModelo, int anoFabricacao, String modelo, String marca, double valor, String tipo,
			int passageiros) {
		super(placa, anoModelo, anoFabricacao, modelo, marca, valor);
		this.tipo = tipo;
		this.passageiros = passageiros;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	@Override
	public String toString() {
		return super.toString() + " tipo=" + tipo + ", passageiros=" + passageiros;
	}

}
