package ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Aluno {

	// 3 - Armezene o nome dos alunos e os valores de 3 notas. Ao ler o conteúdo do
	// arquivo mostre o nome do aluno e sua média.
	public void cadastrar(String info, String fileName, boolean append) {

		try {
			FileWriter fw = new FileWriter(fileName + ".txt", append);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(info + "\r\n");

			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public ArrayList<String> ler(String fileName) {
		ArrayList<String> data = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName + ".txt");
			BufferedReader br = new BufferedReader(fr);

			String linha = "";
			while ((linha = br.readLine()) != null) {
				data.add(linha);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return data;
	}
}
