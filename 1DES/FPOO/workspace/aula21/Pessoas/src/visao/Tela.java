package visao;

import controle.ProcessaPlanilha;

public class Tela {

	public static void main(String[] args) {
		ProcessaPlanilha.carregar();
		System.out.println("Idades calculadas com sucesso");
		ProcessaPlanilha.saida();
	}
}