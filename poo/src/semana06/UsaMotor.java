package semana06;

public class UsaMotor {

	public static void main(String[] args) {
		Motor m1 = new Motor();
		m1.ligar();
		m1.acelerar();
		
		for(int i = 0; i < 1000; i++)
		m1.acelerar();
		m1.mostrar(); // impress�o ocorre na classe motor
		
		for(int i = 0; i < 1000; i++)
			m1.frear();
			m1.mostrar();		
		
		
		//System.out.println(m1); // impress�o ocorre aqui
	}
}