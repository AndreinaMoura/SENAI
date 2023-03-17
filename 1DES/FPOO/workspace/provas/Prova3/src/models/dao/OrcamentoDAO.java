package models.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import models.Orcamento;

public class OrcamentoDAO {

	// DAO (Data Access Object = Objeto de Acesso a Dados)
	private Orcamento orca;
	private BufferedReader br;
	private BufferedWriter bw;
	private String arquivo = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\logic\\FPOO\\provas\\Prova3\\dados\\orcamentos.csv";

	public void escrever(ArrayList<Orcamento> vs) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo));
			for (Orcamento p : vs) {
				bw.write(p.toCSV());
			}
			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<Orcamento> ler() {
		ArrayList<Orcamento> linhas = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = br.readLine();
			while(linha != null) {
				orca = new Orcamento(linha);
				linhas.add(orca);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return linhas;
	}
}
