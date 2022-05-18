package esii.agregacao;

public class Veiculo {
	public int id;
	public String modelo;
	
	public Motor motor;
	public Suspensao suspensao;
	
	public Veiculo(int id, String modelo, Motor motor, Suspensao suspensao) {
		this.id = id;
		this.modelo = modelo;
		this.motor = motor;
		this.suspensao = suspensao;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void mostrar() {
		System.out.println(motor.fabricante);
		System.out.println(motor.potencia);
		System.out.println(suspensao.descricao);
	}
	
}
