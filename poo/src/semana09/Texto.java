package semana09;

import java.io.FileWriter;
import java.io.IOException;

public class Texto {

	public static void append(String... dados) {
		try {
			FileWriter fw = new FileWriter("frutas.txt", true);
			for(String v : dados) {
				fw.append(v + "\n");
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("erro");
		}
	}
}
