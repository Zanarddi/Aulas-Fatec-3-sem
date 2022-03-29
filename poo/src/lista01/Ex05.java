package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // cria o objeto do scanner

		System.out.println("Insira o lado do quadrado: ");
		float lado = s.nextFloat(); // lado recebe o valor escaneado

		DecimalFormat df = new DecimalFormat("0.00"); // cria nova formatacao para os valores

		float area = lado * lado;

		System.out.println("Dobro da area do quadrado = " + df.format(area * 2));
	}
}
