package semana14;

import java.sql.SQLException;

import semana09.BD;
import semana09.Texto;

public class AlunoImportar {

	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		String sql = "insert alunos values(?,?)";

		String csvFile = "src/alunos.csv";

		String[] v = Texto.getLinhas(csvFile, 9);

		int c = 0;
		for (int i = 1; i < v.length; i++) {
			// System.out.println(v[i]);
			// inserir no banco
			String[] aluno = v[i].split(";");
			System.out.println(aluno[0] + " - " + aluno[1]);

			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, aluno[0]);
				bd.st.setString(2, aluno[1]);
				bd.st.executeUpdate();
				c += bd.st.executeUpdate();

			} catch (SQLException e) {
				System.out.println("Erro: " + e);
			}

		}
		System.out.println("Alunos inseridos: " + c);
	}
}
