package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // cria o objeto do scanner

		System.out.println("Insira a primeira nota: ");
		float n1 = s.nextFloat(); // n1 recebe o valor escaneado
		System.out.println("Insira a segunda nota: ");
		float n2 = s.nextFloat(); // n2 recebe o valor escaneado
		System.out.println("Insira a terceira nota: ");
		float n3 = s.nextFloat(); // n3 recebe o valor escaneado

		DecimalFormat df = new DecimalFormat("0.00"); // cria nova formatacao para os valores

		System.out.println("Média final = " + df.format((n1 + n2 + n3) / 3));

	}
}
