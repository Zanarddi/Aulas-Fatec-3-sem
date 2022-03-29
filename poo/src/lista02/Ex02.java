package lista02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // cria o objeto do scanner

		System.out.println("Insira o primeiro numero: ");
		double a = s.nextDouble(); // a recebe o valor escaneado
		System.out.println("Insira o segundo numero: ");
		double b = s.nextDouble(); // b recebe o valor escaneado

		if (a == b)
			System.out.println(a + " + " + b + " = " + (a + b));
		else
			System.out.println(a + " * " + b + " = " + (a * b));

	}
}
