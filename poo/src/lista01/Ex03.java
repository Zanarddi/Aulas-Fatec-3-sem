package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // cria o objeto do scanner

		System.out.println("Insira o valor em metros: ");
		float metro = s.nextFloat(); // metro recebe o valor escaneado

		DecimalFormat df = new DecimalFormat("0.00"); // cria nova formatacao para os valores

		System.out.println(metro + " metros equivalem a " + df.format(metro * 100) + "cm");

	}

}
