package semana02;

//import java.util.Scanner;

import java.util.*; //neste caso é importado todas as classes da pasta util

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // criei um objeto 's', na classe Scanner
		System.out.println("Entre com um valor inteiro: ");
		int a = s.nextInt();
		System.out.println("Entre com outro valor inteiro: ");
		int b = s.nextInt();

		System.out.println("Soma: " + (a + b)); // é importante o uso dos parenteses, pois caso eles nao estivessem ali,
												// os valores a e b seriam printados como string, e nao como inteiro.
		System.out.println("Sub: " + (a - b));
		System.out.println("Mult: " + (a * b));
		System.out.println("Div: " + (a / b));
		s.close();
	}
}
