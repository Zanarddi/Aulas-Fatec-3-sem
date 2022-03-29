package semana02;

public class Main {

	public static void main(String[] args) {

		Banana fruta;

		int a = 10;
		float f = 2.3f;
		double d = 2.348625154648;
		
		f = (float)d;  //convertendo de um valor maior para menor
		a = (int)d;
		
		System.out.println("double: "+d);
		System.out.println("float: "+f);
		System.out.println("int: "+a);

		Integer a1 = 10;
		Float f1 = 2.3f;
		Double d1 = 2.3;

		final int x = 10;
		final byte NUMERO_MESES_ANO = 12; // constante
		byte numeroMesesAno = 12; // variavel

		int b = 10;
		int c = 20;
		System.out.println(b + c);

		String s1 = "Gustavo", s2 = " Zanardi";
		System.out.println(s1 + s2);
		// x = 12;
	}

}
