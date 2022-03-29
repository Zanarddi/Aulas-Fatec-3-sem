package semana05;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("ola");  //note que existe uma sobrecarga (overload) do metodo println, 
									//pois ele pode receber diferentes assinaturas, ainda que o nome seja o memso
		System.out.println(1);
		System.out.println(3.4);
		System.out.println(true);
		
		char[] letras = {'a', 'e', 'i', 'o', 'u'};
		System.out.println(letras);
		
		
		Metodos.imprimir(); //chamar ou invocar metodo	
		String meleca = "xxxxx";
		Metodos.imprimir(meleca);
	
	
	}
	

}
