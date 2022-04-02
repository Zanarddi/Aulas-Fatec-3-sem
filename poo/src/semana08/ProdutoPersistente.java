package semana08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProdutoPersistente extends Produto {
	
	// objetos persistentes, transientes

	/**
	 * Metodo salva o estaod atual de um objeto, seus atributos e afins, na raiz do
	 * projeto
	 * 
	 * @return - se funcionou ou nao
	 */
	public boolean persistir() {
		try {
			FileOutputStream fos = new FileOutputStream("produto.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.flush(); // "força" a realização do comanto
			oos.writeObject(this); // escreve o objeto no disco (this se refere ao objeto corrente)
			oos.close(); // fecha o oos
			fos.close(); // fecha o fos
			return true; // gravacao realizada com sucesso
		} catch (IOException e) {
			System.out.println(e); // mensagem para o programador
			return false;
		}
	}

	/**
	 * método que retorna um objeto lido
	 * 
	 * @return - objeto produto
	 */
	public Produto recuperar() {
		try {
			FileInputStream fis = new FileInputStream("produto.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Produto p = (Produto) ois.readObject();
			ois.close();
			fis.close();
			return p;
		} catch (Exception e) {
			System.out.println(e); // mensagem para o programador
			return null;
		}
	}

}
