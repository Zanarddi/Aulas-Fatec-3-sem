package semana11;

public interface Motor {
	
	//metodos de interfaces sao, por padrao, abstract e public
	//as variaveis s�o tamb�m, por padrao, final, public e static
	
	public String NOME = "motor";
	public void ligar();
	public void desligar();
	public void acelerar();
	public void frear();
}
