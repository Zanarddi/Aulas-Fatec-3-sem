package semana06;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("Zanardi");
		nomes.add("Samuel");
		nomes.add("Adilson");
		nomes.add("Daniel");
		nomes.add("Patrick");
		nomes.sort(null); //organiza em ordem alfabetica
		Metodos.listarNome(nomes);
		
		
		/*
		int[] vetor = {1, 2, 3};
		int r = Metodos.somar(vetor);
		System.out.println(r);
		
		double ret = Metodos.somar(1, 4, 4, 5, 89);
		System.out.println(ret);
		*/
		
		//System.out.println(Metodos.somatorio2(5));
		//System.out.println(Metodos.fatorial(5));
		
	}
}