package semana05;

public class Exercicios {

	/**
	 * Gera uma senha alfanumerica contendo n digitos
	 * 
	 * @param quantDigitos - a quantidade de digitos
	 * @return - a senha alfanumerica
	 */
	public static String gerarSenha(int quantDigitos) {
		String s = "123456789abcABC!@#";
		int t = s.length();
		String senha = "";

		for (int i = 0; i < quantDigitos; i++) {
			// senha = senha + s.charAt((int) Math.random() * t);
			int n = (int) (Math.random() * t);
			char c = s.charAt(n);
			senha = senha + c;
		}
		return senha;
	}

	/**
	 * Realiza a contagem das vogais existentes na frase
	 * 
	 * @param frase - a frase fornecida
	 * @return - a quantidade de vogais
	 */
	public static int contarVogais(String frase) {
		int quant = 0;
		frase = frase.toLowerCase();
		int t = frase.length();
		for (int i = 0; i < t; i++) {
			char c = frase.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				quant++;
			}
		}
		return quant;
	}

	/**
	 * Gera numeros aleatórios e retorna eles escritos por extenso
	 * 
	 * @param quantDigitos - quantidade de digitos a serem gerados
	 * @return - os numeros por extenso
	 */
	public static String gerarPorExtenso(int quantDigitos) {
		String retorno = "";
		for (int i = 0; i < quantDigitos; i++) {
			int n = (int) (Math.random() * 10);
			switch (n) {
			case 0:
				retorno += "zero, ";
				break;
			case 1:
				retorno += "um, ";
				break;
			case 2:
				retorno += "dois, ";
				break;
			case 3:
				retorno += "três, ";
				break;
			case 4:
				retorno += "quatro, ";
				break;
			case 5:
				retorno += "cinco, ";
				break;
			case 6:
				retorno += "seis, ";
				break;
			case 7:
				retorno += "sete, ";
				break;
			case 8:
				retorno += "oito, ";
				break;
			case 9:
				retorno += "nove, ";
				break;
			}
		}
		return retorno;
	}

	/**
	 * Recebe um valor inteiro e identifica se ele é par ou ímpar
	 * 
	 * @param i - numero analisado
	 * @return - se ele é par ou ímpar
	 */
	public static String verificarParImpar(int i) {

		if (i % 2 == 0)
			return "PAR";
		else
			return "IMPAR";
	}

}
