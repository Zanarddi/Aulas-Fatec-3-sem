package semana13;

public class Violacoes {

	public final static String MEN = "Idade recebida: ";

	public static void main(String[] args) {
		int i = 10;
		System.out.println(verificaIdade(i));
		System.out.println(verificaIdade2(i));
		System.out.println(verificaIdade3(i));
		System.out.println(Geral.user);
	}

	public static boolean verificaIdade(final int idade) {
		if (idade >= 18) {
			System.out.println(MEN + idade);
			return true;
		} else {
			System.out.println(MEN + idade);
			return false;
		}
	}

	public static boolean verificaIdade2(int idade) {
		boolean ret;
		if (idade >= 18) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public static boolean verificaIdade3(int idade) {
		return (idade >= 18);
	}
}
