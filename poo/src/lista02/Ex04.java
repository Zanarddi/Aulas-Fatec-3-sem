package lista02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // cria o objeto do scanner

		System.out.println("Insira um numero: ");
		double n1 = s.nextDouble(); // n1 recebe o valor escaneado
		double n2 = s.nextDouble(); // n2 recebe o valor escaneado
		double n3 = s.nextDouble(); // n3 recebe o valor escaneado

		if (n1 > 0 && n2 > 0 && n3 > 0)
			System.out.println("Média = " + (n1 + n2 + n3)/3);
		else 
			System.out.println("A media nao pode ser calculada");

	}
}
