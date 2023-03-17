package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {

	private int codCliente;
	private int codFuncinario;
	private double valor;
	private Date data;
	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public Venda(int id, int matricula, double valor, double comissao, Date data) {
		this.codCliente = id;
		this.codFuncinario = matricula;
		this.valor = valor;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public int getCodFuncinario() {
		return codFuncinario;
	}

	public void setCodFuncinario(int codFuncinario) {
		this.codFuncinario = codFuncinario;
	}

	public double getValor(double v) {
		v = valor * 0.15;
		return valor + v;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return codCliente + "\t" + codFuncinario + "\t" + valor + "\t" + getValor(0) + "\t" + df.format(data);
	}
}
