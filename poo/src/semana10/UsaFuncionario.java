package semana10;

public class UsaFuncionario {

	public static void main(String[] args) {
		
		Cargo c1 = new Cargo(1, "Analista");
		Cargo c2 = new Cargo(2, "Programador");
		
		
		Funcionario f1 = new Funcionario(1, "Gustavo", 1200, c2);
		Funcionario f2 = new Funcionario(2, "Daniel", 1300, c1);
		Funcionario f3 = new Funcionario(3, "Joao", 1500, c1);
		
		f1.mostrar();
		f2.mostrar();
		f3.mostrar();
		
	}
}
