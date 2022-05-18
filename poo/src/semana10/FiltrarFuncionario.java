package semana10;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import semana09.BD;

public class FiltrarFuncionario {

	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		String sql = "select * from funcionarios where nome like ?";

		String nome = JOptionPane.showInputDialog("Digite a inicial do funcionario");

		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, "%" + nome + "%"); // altera as interrogações na string [sql].
			bd.rs = bd.st.executeQuery();
			while (bd.rs.next()) {
				System.out.println("[" + bd.rs.getInt(1) + ", " + bd.rs.getString(2) + ", " + bd.rs.getString(3) + ", "
						+ bd.rs.getString(4) + "]");
			}
		} catch (SQLException e) {

		} finally {
			bd.close();
		}
	}
}
