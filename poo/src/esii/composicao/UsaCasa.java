package esii.composicao;

public class UsaCasa {

	public static void main(String[] args) {
		Casa c = new Casa();
		c.cozinha.lavalouca = true;
		c.cozinha.lampada.ligada = true;
		c.sala.tamanho = 10;
		c.quartos[0].arCondicionado = true;
		c.quartos[1].arCondicionado = false;
	}
}
