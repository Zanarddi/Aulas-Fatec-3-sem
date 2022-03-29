package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o primeiro numero: ");
		float n1 = s.nextFloat();
		System.out.println("Insira o segundo numero: ");
		float n2 = s.nextFloat();
		
		DecimalFormat df = new DecimalFormat("0.00");  // cria nova formatacao para os valores
		
		System.out.println(n1 + " + " + n2 + " = " +df.format(n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " +df.format(n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " +df.format(n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " +df.format(n1 / n2));
		
		
		
	}
}
