package semana09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Texto {

	public static void append(String... dados) {
		try {
			FileWriter fw = new FileWriter("frutas.txt", true);
			for (String v : dados) {
				fw.append(v + "\n");
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("erro");
		}
	}

	public static String[] getLinhas(String file, int linhas) {
		String[] array = new String[linhas];
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int c = 0;
			while (c<linhas) {
				array[c++] = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return array;
	}

	public static String gerarCSV(List<String> linhas, String csvFile) {
		int c = 0;
		try {
			PrintWriter pw = new PrintWriter(csvFile);
			
			
			for(String s : linhas) {
				pw.write(s + "\n");
				c++;
			}
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERRO: " + e);
		}
		return c + " linhas inseridas";
	}
}
