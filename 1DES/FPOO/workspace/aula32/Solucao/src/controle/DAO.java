package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Planilha;

public class DAO {
	private BufferedReader br;
	private BufferedWriter bw;
	private String entrada = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\logic\\FPOO\\wk\\workspace\\Solucao\\dados\\entrada.csv";
	private String saida = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\logic\\FPOO\\wk\\workspace\\Solucao\\dados\\saida.csv";

	public ArrayList<Planilha> abrir() {
		ArrayList<Planilha> linhas = new ArrayList<>();
		Planilha p;
		try {
			br = new BufferedReader(new FileReader(entrada));
			String l = br.readLine();
			while (l != null) {
				p = new Planilha(l);
				linhas.add(p);
				l = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return linhas;
	}

	public void salvarSoma(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha p : linhas) {
				bw.write(p.adicao() + "\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void salvarMult(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha p : linhas) {
				bw.write(p.mult() + "\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void salvarSub(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha p : linhas) {
				bw.write(p.sub() + "\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void salvarDiv(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha p : linhas) {
				bw.write(p.div() + "\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
