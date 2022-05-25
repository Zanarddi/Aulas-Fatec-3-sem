package semana12;

public class Gato extends Animal{

	public String raca;
	
	@Override
	public void comer() {
		System.out.println("gato comendo...");
		
	}

	@Override
	public void dormir() {
		System.out.println("gato dormindo...");
		
	}
}
