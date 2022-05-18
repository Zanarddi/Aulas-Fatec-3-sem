package semana10;

public class UsaEmpregado {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado(1, "Gustavo", null);
		Empregado e2 = new Empregado(1, "Daniel", e1);
		Empregado e3 = new Empregado(1, "Joao", e1);
		
		ListaEmpregado lista = new ListaEmpregado();
		
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		
		lista.mostrar();
		
	}
}