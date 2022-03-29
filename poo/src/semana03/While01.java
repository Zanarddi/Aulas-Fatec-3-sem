package semana03;

public class While01 {

	public static void main(String[] args) throws InterruptedException {

		// inicializacao da variavel de controle
		int a = 0;

		// comparacao
		while (a <= 10) {
			System.out.print(a + " ");

			// incremento da variavel
			a++;
			Thread.sleep(300);

		}
		System.out.println();
		a = 10;
		while (a >= 0) {
			System.out.print(a + " ");
			a--;
			Thread.sleep(300);

		}

	}
}
