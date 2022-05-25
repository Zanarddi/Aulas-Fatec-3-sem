package semana12;

public class UsaAnimal {

	public static void main(String[] args) {
		Gato g = new Gato();
		Animal.gerarExcel(g);
		
		Elefante e = new Elefante();
		Animal.gerarExcel(e);
	}
}
