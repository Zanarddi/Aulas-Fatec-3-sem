package lista02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // cria o objeto do scanner

		System.out.println("Insira um número: ");
		int num = s.nextInt(); // num recebe o valor escaneado

		if (num % 2 == 0) 
			System.out.println(num + " é par");
		else 
			System.out.println(num + " é ímpar");
		
	}
}
