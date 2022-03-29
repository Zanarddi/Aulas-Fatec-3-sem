package semana03;

public class Math03 {
	public static void main(String[] args) {
		// cartao da megasena com 6 numeros
		for (int a = 1; a <= 6; a++) {
			int n = 1 + (int) (Math.random() * 60);
			System.out.print(n + " ");
		}
	}

}
