package semana07;

public class Motor {

	private int velocidade;
	public String fabricante;

	public void acelerar() {
		if (velocidade < 100)
			velocidade++;
	}
	public void frear() {
		if (velocidade > 0)
			velocidade--;
	}
	public int pegaVelocidade() {
		return velocidade;
	}

}
