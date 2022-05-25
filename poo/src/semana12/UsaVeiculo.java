package semana12;

public class UsaVeiculo {

	public static void main(String[] args) {
		
		Veiculo v = new Automovel();		//v se comporta como um automovel, mas nao tem as mesmas caracteristicas
		Automovel a = new Automovel();
		
		v.placa = "123";
		a.placa = "456";
		
		a.acelerar();
		v.acelerar();
	}
}
