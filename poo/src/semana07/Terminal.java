package semana07;

public class Terminal {
	
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		c1.depositar(1000);
		c2.depositar(500);
		
		ContaBancaria.transferir(c1, c2, 500);
		
		System.out.println(c1.pegaSaldo());
		System.out.println(c2.pegaSaldo());
		
		
		/*
		ContaBancaria conta = new ContaBancaria();
		conta.depositar(1000);
		conta.depositar(500);
		System.out.println(conta.pegaSaldo());
		
		System.out.println(conta.sacar(500));
		System.out.println(conta.pegaSaldo());
		*/
	}
}
