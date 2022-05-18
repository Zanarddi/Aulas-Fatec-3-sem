package esii.agregacao;

public class UsaVeiculo {

	public static void main(String[] args) {
		
		Motor m = new Motor();
		m.fabricante = "GM";
		m.potencia = 100;
		
		Suspensao s = new Suspensao();
		s.descricao = "Suspensão traseira";
		
		Veiculo v1 = new Veiculo(1, "fusca", m, s);
		v1.mostrar();
		
		Veiculo v2 = new Veiculo(2, "fusca", m, s);
		v2.mostrar();
	}
}
