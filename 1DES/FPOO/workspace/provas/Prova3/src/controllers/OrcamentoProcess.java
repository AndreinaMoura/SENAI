package controllers;

import java.util.ArrayList;

import models.Orcamento;
import models.dao.OrcamentoDAO;
import views.OrcamentoForm;

public class OrcamentoProcess {

	public static ArrayList<Orcamento> orcamentos;
	private static OrcamentoDAO od = new OrcamentoDAO();

	public static void abrir() {
		orcamentos = od.ler();
	}

	public static void salvar() {
		od.escrever(orcamentos);
	}

	public static boolean comprarProdutos() {
		boolean comprar = true;
		for (int i = 0; i < OrcamentoProcess.orcamentos.size(); i++) {
			if (OrcamentoProcess.orcamentos.get(i).getProduto().contains(OrcamentoForm.produto.getText())) {
				if (OrcamentoProcess.orcamentos.get(i).getPreco() > OrcamentoForm.p) {
					OrcamentoProcess.orcamentos.get(i).setMaisBarato(false);
					comprar = true;
				} else {
					comprar = false;
				}
			}
		}
		return comprar;
	}
}
