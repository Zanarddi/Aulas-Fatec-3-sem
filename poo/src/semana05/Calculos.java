package semana05;

/**
 * Classe que realiza diversos calculos matematicos
 * @author gustavo.zanardi
 *
 */
public class Calculos {
	
	/**
	 * Recebe dois valores do tipo double e imprime
	 * sua soma em tela.
	 * @param a - o primeiro valor
	 * @param b - o segundo valor
	 */
	public static void somar(double a, double b) {
		System.out.println(a+b);
	}
	
	/**
	 * Recebe dois valores do tipo double e imprime
	 * sua subtração em tela.
	 * @param a - o primeiro valor
	 * @param b - o segundo valor
	 */
	public static void subtrair(double a, double b) {
		System.out.println(a-b);
	}
	
	/**
	 * Recebe dois valores do tipo double e imprime
	 * seu produto em tela.
	 * @param a - o primeiro valor
	 * @param b - o segundo valor
	 */
	public static void multiplicar(double a, double b) {
		System.out.println(a*b);
	}

	/**
	 * Recebe dois valores do tipo double e imprime
	 * sua divisão em tela.
	 * @param a - o primeiro valor
	 * @param b - o segundo valor
	 */
	public static void dividir(double a, double b) {
		System.out.println("double");
		System.out.println(a/b);
	}
	
	public static void dividir(int a, int b) throws ArithmeticException{
		System.out.println("int");
		System.out.println(a/b);
	}
	
	
	/**
	 * Apresenta em tela os números inteiros
	 * so início ao fim com incremeto de 1, pausadamente
	 * @param inicio - valor inicial da contagem
	 * @param fim - valor final da contagem
	 * @throws InterruptedException 
	 */
	public static void contar(int inicio, int fim) throws InterruptedException {
		for(int i = inicio; i <= fim; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

	


	
	
}
