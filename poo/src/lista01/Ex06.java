package lista01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex06 {
	
	public static void main(String[] args) {
		
		// a variavel recebe o valor inserido pelo usuario no InputDialog
		float valorHora = 
				Float.parseFloat(JOptionPane.showInputDialog("Insira o valor ganho por hora"));
		
		float horasTrabalhadas = 
				Float.parseFloat(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas"));

		float salario = valorHora * horasTrabalhadas; //calculo do valor total

		DecimalFormat df = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null, "Salário mensal = " + df.format(salario) + "R$");
		
	}

}
