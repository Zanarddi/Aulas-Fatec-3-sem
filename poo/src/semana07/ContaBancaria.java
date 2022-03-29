package semana07;

public class ContaBancaria {

	private final int VALOR_MAXIMO_SAQUE = 1000;
	public String titular;
	private double saldo;

	/**
	 * Recebe um valor que será acrescido ao saldo
	 * 
	 * @param valor - o valor do deposito
	 */
	public void depositar(double valor) {
		if (valor > 0)
			saldo += valor;
	}

	/**
	 * recebe um valor a ser debitado do saldo
	 * 
	 * @param valor - o valor a sacar
	 */
	public String sacar(double valor) {
		String men = "";
		if (valor <= saldo) { // conforme RN01
			if (valor <= VALOR_MAXIMO_SAQUE) { // conforme RN02
				saldo -= valor;
				men = "Saque de " + valor + " realizado com sucesso!";
			} else {
				men = "O valor máximo para o saque é " + VALOR_MAXIMO_SAQUE;
			}
		} else
			men = "Saldo insuficiente!!";
		return men;
	}

	/**
	 * retorna o valor atual do saldo da conta
	 * 
	 * @return - o valor do saldo
	 */
	public double pegaSaldo() {
		return saldo;
	}

	public static String transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
		String men = "";
		//origem.saldo -= valor;
		//destino.saldo += valor;
		origem.sacar(valor);
		destino.depositar(valor);
		
		
		return men;
	}

}
