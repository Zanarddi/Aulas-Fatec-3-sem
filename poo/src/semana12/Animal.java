package semana12;

import java.lang.reflect.Field;

public abstract class Animal {
	
	public int codigo;
	public String nome;
	
	public abstract void comer();
	public abstract void dormir();
	
	public static void gerarExcel(Animal animal) {
		//System.out.println(animal.getClass());
		
		Class<?> object = animal.getClass();
		for(Field f : object.getDeclaredFields()) {
			System.out.println(f.getName());
		}
	}
	
}