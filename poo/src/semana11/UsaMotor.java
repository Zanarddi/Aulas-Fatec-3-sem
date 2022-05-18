package semana11;

public class UsaMotor {
	
	public static void main(String[] args) {
		Motor m = new Aviao();
		m.ligar();
		m.desligar();
		m.frear();
		m.acelerar();
		System.out.println(Motor.NOME);
	}

}
