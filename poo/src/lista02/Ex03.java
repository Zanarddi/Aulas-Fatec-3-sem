package lista02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); // cria o objeto do scanner

		System.out.println("Insira um numero: ");
		double num = s.nextDouble(); // num recebe o valor escaneado

		if (num > 0 )
			System.out.println(num * 2);
		else if (num < 0)
			System.out.println(num * 3);
		else 
			System.out.println(num);

		
	}
}
