package semana02;

//import java.util.Scanner;

import java.util.*; //neste caso é importado todas as classes da pasta util

public class EntradaDeDados2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Entre com a primeira nota: ");
		float a = s.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		float b = s.nextFloat();

		System.out.println("Media: " + ((a + b) / 2));
		s.close();
	}
}
