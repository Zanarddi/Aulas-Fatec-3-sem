package semana07;

public class UsaMotor {
	
	public static void main(String[] args) {
		
		Motor motor = new Motor();
		
		motor.acelerar();
		motor.acelerar();
		System.out.println(motor.pegaVelocidade());
	}
}
