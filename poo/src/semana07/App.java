package semana07;

public class App {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setCodigo(1);
		cliente.setNome("Gustavo Zanardi");
		cliente.setEmail("Zanardi.Gustavo@gmail.com");
		
		cliente.mostrar();
		System.out.println(cliente);//usa neste caso o metodo toString, que se torna pardrao nesses casos
	}
}
