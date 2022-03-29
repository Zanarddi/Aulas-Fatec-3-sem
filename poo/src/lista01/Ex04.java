package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // cria o objeto do scanner

		System.out.println("Insira o raio: ");
		float raio = s.nextFloat(); // raio recebe o valor escaneado

		DecimalFormat df = new DecimalFormat("0.00"); // cria nova formatacao para os valores

		System.out.println("O círculo de raio " + raio + " tem area de " + 
						  df.format(Math.PI * raio * raio));

	}
}
