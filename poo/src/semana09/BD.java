package semana09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {

	public Connection con = null; // realiza a conex�o ao banco
	public PreparedStatement st = null; // executa instru��es SQL
	public ResultSet rs = null; // armazena as querys

	public final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // driver de conex�o ao banco
	public final String BANCO = "java"; // nome do banco
	public final String URL = "jdbc:sqlserver://localhost:1433;databasename=" + BANCO; // URL para se conectar ao banco
	public final String LOGIN = "sa";
	public final String SENHA = "123456789";

	/**
	 * Abre uma conex�o com o banco de dados a partir dos dados definidos acima
	 * 
	 * @return - true em caso de sucesso ou false caso contr�rio
	 */
	public boolean getConnection() {
		// carregar o driver
		try {
			Class.forName(DRIVER); // carrega a classe do driver
			con = DriverManager.getConnection(URL, LOGIN, SENHA);
			System.out.println("Sucesso!!");
			return true;

		} catch (ClassNotFoundException erro) {
			System.out.println("Driver n�o encontrado!!");
			return false;
		} catch (SQLException erro) {
			System.out.println("Falha na conex�o!!!" + erro);
			return false;
		}
	}

	/**
	 * Encerra a conex�o com o banco de dados
	 * 
	 * @return
	 */
	public void close() {

	}

	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
	}
}