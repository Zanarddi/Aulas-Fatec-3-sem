package semana06;

import java.util.List;

public class Metodos {
	/**
	 * Recebe um vetor de numeros inteiros e 
	 * retorna a soma entre eles
	 * @param n - vetor de inteiro
	 * @return - a soma dos vetores
	 */
	public static int somar(int[] n) {
		int soma = 0;
		for (int i = 0; i < n.length; i++) {
			soma += n[i];
		}
		return soma;
	}

	/**
	 * Recebe valores e retorna a soma deles
	 * @param n - valores a serem somados
	 * @return - a soma dos valores
	 */
	public static double somar(double... n) {
		double soma = 0;
		for (int i = 0; i < n.length; i++) {
			soma += n[i];
		}
		return soma;
	}
	
	//recursividade
	public static int somatorio(int n) {
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			soma += i;
		}
		return soma;
	}
	
	public static int somatorio2(int n) {
		if(n == 1)
			return 1;
		else
		return n + somatorio2(--n);
	}
	
	public static int fatorial(int n) {
		if(n == 1)
			return 1;
		else
		return n * fatorial(--n);
	}
	
	public static void listarNome(List<String> nomes) {
		for(String s : nomes)  //iterator
			System.out.println(s);
	}
	
	public static void listarNome2(List<String> nomes) {
		nomes.forEach(n -> System.out.println(n)); //usando a sintaxe lambda
	}

}