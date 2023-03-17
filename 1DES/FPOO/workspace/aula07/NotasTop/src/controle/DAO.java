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
	private String entradas = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\logic\\FPOO\\wk\\workspace\\Notas\\dados\\entradas.csv";
	private String saida = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\logic\\FPOO\\wk\\workspace\\Notas\\dados\\saida.csv";

	public ArrayList<Planilha> abrir() {
		ArrayList<Planilha> linhas = new ArrayList<>();
		Planilha p;
		try {
			br = new BufferedReader(new FileReader(entradas));
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

	public void salvar(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha p : linhas) {
				bw.write(p.media() + "\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
