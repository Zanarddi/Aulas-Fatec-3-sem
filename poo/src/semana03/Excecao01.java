package semana03;

import javax.swing.JOptionPane;

public class Excecao01 {

	public static void main(String[] args) {

		String[] meses = {"jan", "fev"};
		try {
			int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
			int conta = 10 / a;
			System.out.println("OK "+a);
			System.out.println(meses[a]);
			//catch (Exception  e)   FORMA GENERICA
			//catch (NumberFormatException | ArithmeticException  e) FORMA AGRUPADA
		} catch (NumberFormatException e) {  //FORMA ESPECIFICA
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("O valor nao pode ser zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O valor nao pode ser maior que 1");
		}
		finally {
			System.out.println("FIM");
		}
		
	}

}
